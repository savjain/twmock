package com.tw.mock.east.model;

import com.tw.mock.east.util.Utils;

public class ValidationRequest {
	
	private String streetNumber;

	private String streetNumberSuffix;
	
	private String propertyName;
	
	private String state;
	
	private String postCode;
	
	private String locality;
	
	public String getAddress() {
		StringBuffer buf = new StringBuffer();
		buf.append(Utils.NVL(propertyName, "")).append(" ");
		buf.append(Utils.NVL(streetNumber, "")).append(" ");
		buf.append(Utils.NVL(streetNumberSuffix, "")).append(" ");
		buf.append(Utils.NVL(locality, "")).append(" ");
		buf.append(Utils.NVL(state, "")).append(" ");
		buf.append(Utils.NVL(postCode, ""));
		return buf.toString();
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetNumberSuffix() {
		return streetNumberSuffix;
	}

	public void setStreetNumberSuffix(String streetNumberSuffix) {
		this.streetNumberSuffix = streetNumberSuffix;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}
}
