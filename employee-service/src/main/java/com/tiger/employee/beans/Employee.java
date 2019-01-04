package com.tiger.employee.beans;

/**
 * @author 王澎
 * @date 1/4/2019
 * @company VRV
 */
public class Employee {

    private String name;

    private int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + getName() + ", id=" + getId() + "]";
    }
}
