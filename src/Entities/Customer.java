package Entities;
import java.time.LocalDate;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationaltyId;
	
	public Customer(int id, String string, String string2, LocalDate of, String string3) {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationaltyId() {
		return nationaltyId;
	}
	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	
	
	
}
