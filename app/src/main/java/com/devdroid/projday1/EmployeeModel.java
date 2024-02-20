package com.devdroid.projday1;
import java.io.Serializable;
public class EmployeeModel implements Serializable {
    private final String name; // name of the employee
    private final String email; // email of the employee

    public EmployeeModel(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
