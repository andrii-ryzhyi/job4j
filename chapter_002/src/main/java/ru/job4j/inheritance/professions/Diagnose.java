package ru.job4j.inheritance.professions;

public class Diagnose {
    private String title;
    private String treatment;

    public Diagnose(String name) {
        this.title = name;
    }
    public String getTitle() {
        return this.title;
    }
    public String getTreatment() {
        return this.treatment;
    }
}
