package com.hapi.fhir.legacy.models;

public class LegacyDoctorMaster {
	String doctorId;
	String centerId;
	String departmentId;
	String departmentName;
	String doctorName;
	String speciality;
	String degree;
	String doctorType;
	String isActive;
	String licenseNo;

	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDoctorType() {
		return doctorType;
	}
	public void setDoctorType(String doctorType) {
		this.doctorType = doctorType;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	
	public static LegacyDoctorMaster getDefaultDoctor() {
		LegacyDoctorMaster doc = new LegacyDoctorMaster();
		doc.setDoctorId("6");
		doc.setCenterId("4");
		doc.setDepartmentId("7");
		doc.setDepartmentName("Diagnostics");
		doc.setDoctorName("Adams");
		doc.setSpeciality("Physiotherapist");
		doc.setDegree("MD");
		doc.setDoctorType("Full-time");
		doc.setIsActive("active");
		doc.setLicenseNo("12345");
		return doc;
	}
}
