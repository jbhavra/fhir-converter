package com.hapi.fhir.legacy.models;

public class LegacyAppointment {
	String date;
	String endTime;
	String appointmentId;
	String reason;
	String startTime;
	String status;
	String type;
	String birthdate;
	String creationDate;
	String creatorId;
	String creatorName;
	String patientId;
	boolean isExistingPatient;
	String patientName;
	String lastUpdatedDate;
	String centerId;
	String centerIdType;
	String consultingDoctorId;
	String consultingDoctorType;
	String doctorName;
	String departmentName;
	String departmentId;
	String servicesBooked;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public boolean isExistingPatient() {
		return isExistingPatient;
	}
	public void setExistingPatient(boolean isExistingPatient) {
		this.isExistingPatient = isExistingPatient;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public String getCenterIdType() {
		return centerIdType;
	}
	public void setCenterIdType(String centerIdType) {
		this.centerIdType = centerIdType;
	}
	public String getConsultingDoctorId() {
		return consultingDoctorId;
	}
	public void setConsultingDoctorId(String consultingDoctorId) {
		this.consultingDoctorId = consultingDoctorId;
	}
	public String getConsultingDoctorType() {
		return consultingDoctorType;
	}
	public void setConsultingDoctorType(String consultingDoctorType) {
		this.consultingDoctorType = consultingDoctorType;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getServicesBooked() {
		return servicesBooked;
	}
	public void setServicesBooked(String servicesBooked) {
		this.servicesBooked = servicesBooked;
	}
	
	public static LegacyAppointment getDefaultAppointment() {
		LegacyAppointment la = new LegacyAppointment();
		la.setDate("2023-01-02");
		la.setEndTime("2023-01-02 11:00:00");
		la.setAppointmentId("2");
		la.setReason("checkup");
		la.setStartTime("2023-01-02 10:00:00");
		la.setStatus("show");
		la.setType("Regular");
		la.setBirthdate("2000-10-10");
		la.setCreationDate("2023-01-01 10:00:00");
		la.setCreatorId("3");
		la.setCreatorName("John");
		la.setPatientId("1");
		la.setExistingPatient(false);
		la.setPatientName("John");
		la.setLastUpdatedDate("2023-01-01 10:00:00");
		la.setCenterId("4");
		la.setCenterIdType("5");
		la.setConsultingDoctorId("6");
		la.setConsultingDoctorType("Regular");
		la.setDoctorName("Adams");
		la.setDepartmentId("7");
		la.setDepartmentName("Diagnostics");
		la.setServicesBooked("checkup");
		return la;
	}
}
