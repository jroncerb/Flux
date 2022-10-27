package com.nttdata.recativeThymeleaf;

public class Person {

	
	private String firstname;
	private String lasttname;
	private Integer dorsal;

	public Person(String firstname, String lasttname, int dorsal) {
		super();
		this.firstname = firstname;
		this.lasttname = lasttname;
		this.dorsal = dorsal;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLasttname() {
		return lasttname;
	}

	public void setLasttname(String lasttname) {
		this.lasttname = lasttname;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int age) {
		this.dorsal = dorsal;
	}
	
	
}
