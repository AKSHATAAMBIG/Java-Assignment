package assignment;

import java.util.*;
/*
If EmpNo=123 then EmpName=Jadeja. Like this how can we keep 100 EmpName with its EmpId?
 */

public class ProblemEleven {
    public static Map<Integer, String> addEmployee() {
        HashMap<Integer, String> h1 = new HashMap<>();
        for (int i = 1; i <= 100; i++) {
            int empId = i;
            String empName = "employeeName" + i;
            h1.put(empId, empName);
        }
        for (Map.Entry<Integer, String> map : h1.entrySet()) {
            System.out.println("EmpId:" + map.getKey() + " and EmpName:" + map.getValue());
        }
        return h1;
    }

    public static void main(String[] args) {
        addEmployee();
    }
}
