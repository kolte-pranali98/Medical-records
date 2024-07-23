package com.service;

import java.util.ArrayList;
import java.util.List;

import com.entity.Patient;

public class PatientData {

	static List<Patient> patients = new ArrayList<>();

    public static void addPatient(Patient p) {
        patients.add(p);
    }

    public static List<Patient> getPatients() {
        return patients;
    }

}
