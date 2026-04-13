package com.hapi.fhir.legacy.models;

public class LegacyPatient {
	String patientId;
	String gender;
	String dob;
	Integer age;
	String firstName;
	String middleName;
	String lastName;
	String salutation;
	String displayName;
	String languagePreferance;
	String mobile;
	String email;
	String address;
	String state;
	String nationalityId;
	String insurance;
	String company;
	String registrationDate;
	String status;
	String nationality;
	String loyaltyLevel;
	String alternateMobileNumber;
	String maritalStatus;
	String regCentreId;
	String regCentreName;
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getLanguagePreferance() {
		return languagePreferance;
	}
	public void setLangiagePreferance(String languagePreferance) {
		this.languagePreferance = languagePreferance;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getLoyaltyLevel() {
		return loyaltyLevel;
	}
	public void setLoyaltyLevel(String loyaltyLevel) {
		this.loyaltyLevel = loyaltyLevel;
	}
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getRegCentreId() {
		return regCentreId;
	}
	public void setRegCentreId(String regCentreId) {
		this.regCentreId = regCentreId;
	}
	public String getRegCentreName() {
		return regCentreName;
	}
	public void setRegCentreName(String regCentreName) {
		this.regCentreName = regCentreName;
	}
	
	public static LegacyPatient getDefaultPatient() {
		LegacyPatient lp = new LegacyPatient();
		lp.setPatientId("1");
		lp.setGender("MALE");
		lp.setDob("1990-11-10");
		lp.setAge(32);
		lp.setFirstName("John");
		lp.setMiddleName("J");
		lp.setLastName("Smith");
		lp.setSalutation("Mr");
		lp.setDisplayName("John Smith");
		lp.setLangiagePreferance("EN");
		lp.setMobile("+19876543210");
		lp.setEmail("john@smith.com");
		lp.setAddress("E104 Pine Street");
		lp.setState("CA");
		lp.setNationalityId("111-11-1111");
		lp.setInsurance("12345");
		lp.setCompany("ABC");
		lp.setRegistrationDate("2003-12-12");
		lp.setStatus("active");
		lp.setNationality("USA");
		lp.setLoyaltyLevel("basic");
		lp.setAlternateMobileNumber("+1654987321");
		lp.setMaritalStatus("married");
		lp.setRegCentreId("123");
		lp.setRegCentreName("A2Z");
		
		return lp;
	}
}
