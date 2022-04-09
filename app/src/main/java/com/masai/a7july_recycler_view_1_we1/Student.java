package com.masai.a7july_recycler_view_1_we1;

public class Student {
    private final String name;
    private final int age;
    private final String rollNo;

    public Student(String name, int age, String rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollNo() {
        return rollNo;
    }

}
