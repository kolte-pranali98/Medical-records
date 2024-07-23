package com.controller;

import java.util.List;
import java.util.Scanner;

import com.entity.Patient;
import com.exception.InvalidInputException;
import com.service.PatientData;

public class MainPatient {

	 public static void main(String[] args) throws InvalidInputException {
	        Scanner sc = new Scanner(System.in);
	        int choice = 0, ch;
	        do {
	            System.out.println("1. Add Patient data");
	            System.out.println("2. Display Patient data");
	            ch = sc.nextInt();
	            switch (ch) {
	                case 1: {
	                    System.out.println("Enter patient id");
	                    Patient p = new Patient();
	                    int id = sc.nextInt();
	                    if (id < 0)
	                        throw new InvalidInputException("id cannot be less than zero");

	                    p.setPatientid(id);
	                    System.out.println("Enter patient name");
	                    String patientnm = sc.next();
	                    boolean f = patientnm.startsWith("p");
	                    if (f == false)
	                        throw new InvalidInputException("patient name should begin with letter p");
	                    p.setPatientnm(patientnm);
	                    System.out.println("Enter patient phone num");
	                    String patientphone = sc.next();
	                    if (patientphone.length() != 10)
	                        throw new InvalidInputException("phone must be 10 digits");
	                    p.setPatientPhone(patientphone);
	                    System.out.println("Enter patient gender");
	                    String patientGender = sc.next();
	                    if (!patientGender.equalsIgnoreCase("male") && !patientGender.equalsIgnoreCase("female")) {
	                        throw new InvalidInputException("gender either male or female");
	                    }
	                    p.setPatientGender(patientGender);
	                    PatientData.addPatient(p);
	                    break;
	                }
	                case 2: {
	                    List<Patient> patients = PatientData.getPatients();
	                    if (patients.isEmpty()) {
	                        System.out.println("No patient data available");
	                    } else {
	                        for (Patient patient : patients) {
	                            System.out.println(patient);
	                        }
	                    }
	                    break;
	                }
	            }
	            System.out.println("Enter 1 to continue");
	            choice = sc.nextInt();
	        } while (choice == 1);
	    }

}
