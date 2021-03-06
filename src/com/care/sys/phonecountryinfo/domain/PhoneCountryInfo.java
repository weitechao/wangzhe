package com.care.sys.phonecountryinfo.domain;

import java.io.Serializable;

import com.godoing.rose.http.PublicVoBean;

public class PhoneCountryInfo extends PublicVoBean implements Serializable{
	private int id;
	private String MCC;
	private String ISO;
	private String Country;
	
	public PhoneCountryInfo() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMCC() {
		return MCC;
	}

	public void setMCC(String mCC) {
		MCC = mCC;
	}

	public String getISO() {
		return ISO;
	}

	public void setISO(String iSO) {
		ISO = iSO;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}	
	
}
