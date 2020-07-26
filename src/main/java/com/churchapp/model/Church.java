package com.churchapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Church {
	
	@Id
	String churchId;
	String name;
	String logo;
	String address;
	Integer contactNumber;
	String liveURL;
	String website;	
	String facebookURL;
	String donationURL;
	
	public String getChurchId() {
		return churchId;
	}
	
	public void setChurchId(String churhcId) {
		this.churchId = churhcId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLogo() {
		return logo;
	}
	
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getLiveURL() {
		return liveURL;
	}
	
	public void setLiveURL(String liveURL) {
		this.liveURL = liveURL;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public void setWebsite(String website) {
		this.website = website;
	}
	
	public String getFacebookURL() {
		return facebookURL;
	}
	
	public void setFacebookURL(String facebookURL) {
		this.facebookURL = facebookURL;
	}
	
	public String getDonationURL() {
		return donationURL;
	}
	
	public void setDonationURL(String donationURL) {
		this.donationURL = donationURL;
	}
	
	@Override
	public String toString() {
		return "Church Id "+this.churchId
			   +"name "+this.name
			   +"logo "+this.logo
			   +"address "+this.address
			   +"contact number "+this.contactNumber
			   +"live url "+this.liveURL
			   +"website "+this.website
			   +"facebook url"+this.facebookURL
			   +"donation url"+this.donationURL;
	}

}
