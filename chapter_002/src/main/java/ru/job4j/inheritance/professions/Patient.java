package ru.job4j.inheritance.professions;

public class Patient extends Profession {
    private Diagnose diagnose;

    public void setDiagnose(Diagnose diagnose) {
        this.diagnose = diagnose;
    }
}
