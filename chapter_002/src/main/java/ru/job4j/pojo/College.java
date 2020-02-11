package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Andrii");
        student.setLastName("Ryzhyi");
        student.setGroup(3);
        student.setEntryDate(new Date());
        System.out.println("Student: " + student.getFirstName()
                + " " + student.getLastName()
                + " - Entry Date: " + student.getEntryDate()
                + " Group: " + student.getGroup());
    }
}
