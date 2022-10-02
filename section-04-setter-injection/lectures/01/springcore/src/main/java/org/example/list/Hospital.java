package org.example.list;

import java.util.List;

public class Hospital {
    private String name;
    private List<String> departments;

    public String getName() {
        return name;
    }

    public Hospital setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getDepartments() {
        return departments;
    }

    public Hospital setDepartments(List<String> departments) {
        this.departments = departments;
        return this;
    }
}
