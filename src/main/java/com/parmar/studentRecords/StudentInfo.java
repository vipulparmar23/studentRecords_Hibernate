package com.parmar.studentRecords;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;

	
	@Entity
	public class StudentInfo {	

		@Id
		@GeneratedValue
		private int rollNo;
		private String firstName;
		private String lastName;
		private String city;
		private String country;

		public StudentInfo() {

		}

		public StudentInfo(String firstName, String lastName, String city, String country) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.city = city;
			this.country = country;
		}

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

	}
	

