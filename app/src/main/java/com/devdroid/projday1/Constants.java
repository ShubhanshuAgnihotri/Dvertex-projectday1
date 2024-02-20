package com.devdroid.projday1;

import java.util.ArrayList;

public class Constants {

    // This Method create an employee Arraylist and return the Arraylist
    public static ArrayList<EmployeeModel> getEmployeeData() {
        // create an ArrayList of type Employee class
        ArrayList<EmployeeModel> employeeList = new ArrayList<>();
        EmployeeModel emp1 = new EmployeeModel("Shubham Sharma", "shubham12@gmail.com");
        employeeList.add(emp1);
        EmployeeModel emp2 = new EmployeeModel("Ram prakash", "ram12p@gmail.com");
        employeeList.add(emp2);
        EmployeeModel emp3 = new EmployeeModel("Rohit Kumar", "rohitkumar12@gmail.com");
        employeeList.add(emp3);
        EmployeeModel emp4 = new EmployeeModel("Himanshu Agnihotri", "himanshu12@gmail.com");
        employeeList.add(emp4);
        EmployeeModel emp5 = new EmployeeModel("Abhisek Mishra", "mishraabhi@gmail.com");
        employeeList.add(emp5);
        EmployeeModel emp6 = new EmployeeModel("Varun Sharma", "varun12@gmail.com");
        employeeList.add(emp6);
        EmployeeModel emp7 = new EmployeeModel("Anil jaiswal", "anil123@gmail.com");
        employeeList.add(emp7);
        EmployeeModel emp8 = new EmployeeModel("Sachin sinha", "sinhas@gmail.com");
        employeeList.add(emp8);
        EmployeeModel emp9 = new EmployeeModel("Amit sahoo", "sahooamit@gmail.com");
        employeeList.add(emp9);
        EmployeeModel emp10 = new EmployeeModel("Raj kumar", "kumarraj@gmail.com");
        employeeList.add(emp10);

        return employeeList;
    }
}
