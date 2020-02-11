package ru.job4j.inheritance.professions;

public class Doctor extends Profession {
    public Diagnose heal(Patient patient) {
        Diagnose diagnose = new Diagnose("diagnose");
        patient.setDiagnose(diagnose);
        return diagnose;
    }

}
