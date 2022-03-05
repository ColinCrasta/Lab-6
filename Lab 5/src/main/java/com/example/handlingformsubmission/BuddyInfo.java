package com.example.handlingformsubmission;

import javax.persistence.*;

@Entity
public class BuddyInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String name;
	private String address;
	private String phone_number;

	public BuddyInfo(){
		this.id = null;
		this.name = null;
		this.address = null;
		this.phone_number= null;
	}

	public BuddyInfo(String name){
		this.id = null;
		this.name = name;
		this.address = null;
		this.phone_number= null;
	}

	public BuddyInfo(String id, String name, String address, String phone_number){
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone_number= phone_number;
	}
	public String getphone_number() {
		return phone_number;
	}

	public void setphone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}



//     public static void main(String[] args) {
//     BuddyInfo Homer = new BuddyInfo("Homer","London","1234567890");
//     System.out.println("Hello " + Homer.getName());
//
//     }
}

