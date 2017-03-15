package structural.designpattern.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {
	
	private int id;
	private String firstname;
	private String lastname;
	private String emailAddress;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public EmployeeCSV(String values){
		StringTokenizer tokenizer = new StringTokenizer(values,",");
		if(tokenizer.hasMoreTokens()){
			id = Integer.parseInt(tokenizer.nextToken());
		}
		
		if(tokenizer.hasMoreElements()){
			firstname = tokenizer.nextToken();
		}
		if(tokenizer.hasMoreElements()){
			lastname = tokenizer.nextToken();
		}
		if(tokenizer.hasMoreElements()){
			emailAddress = tokenizer.nextToken();
		}
	}


	

}