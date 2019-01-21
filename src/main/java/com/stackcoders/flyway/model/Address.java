package com.stackcoders.flyway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "address")
public class Address {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addrID;

   
    @Column(unique = true)
    @Size(min = 1, max = 100)
    private String doorNo;

    
    @Size(min = 1,max = 50)
    private String line1;

    @Size(min = 1,max = 50)
    private String line2;
    
    @Size(min = 1,max = 50)
    private String city;
    
    @Size(min = 1,max = 50)
    private String state;
    
    @Size(min = 1,max = 7)
    private String pincode;
    
    @Size(min = 1,max = 50)
    private String country;
    
    

	public Long getAddrID() {
		return addrID;
	}

	public void setAddrID(Long addrID) {
		this.addrID = addrID;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
    
    


}
