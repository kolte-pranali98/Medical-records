package com.entity;

public class Patient {

	private int patientid;
    private String patientnm;
    private String patientGender;
    private String patientPhone;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientid, String patientnm, String patientGender, String patientPhone) {
		super();
		this.patientid = patientid;
		this.patientnm = patientnm;
		this.patientGender = patientGender;
		this.patientPhone = patientPhone;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientnm() {
		return patientnm;
	}
	public void setPatientnm(String patientnm) {
		this.patientnm = patientnm;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public String getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}
	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", patientnm=" + patientnm + ", patientGender=" + patientGender
				+ ", patientPhone=" + patientPhone + "]";
	}


}
