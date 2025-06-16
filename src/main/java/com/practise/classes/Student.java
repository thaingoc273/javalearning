package com.practise.classes;

public class Student {
    String name;
    int marks;
    String department;
    public Student(String name, int marks, String department) {
        this.name = name;
        this.marks = marks;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "Name: " + name + (", marks = " + marks + ", department = " + department);
    }
}
