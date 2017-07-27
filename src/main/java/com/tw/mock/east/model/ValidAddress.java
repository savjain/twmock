package com.tw.mock.east.model;

public class ValidAddress {
	
	private long addressId;
	
	private String ESA;
	
	private String streetNumber;
	
	private String streetNumberSuffix;
	
	private String state;
	
	private String postCode;
	
	private String locality;
	
	private String propertyName;
	
	private String routeType;
	
	private boolean confirmed;

	public long getAddressId() {
		return addressId;
	}

	public ValidAddress addressId(long addressId) {
		this.addressId = addressId;
		return this;
	}

	public String getESA() {
		return ESA;
	}

	public ValidAddress ESA(String eSA) {
		ESA = eSA;
		return this;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public ValidAddress streetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
		return this;
	}

	public String getStreetNumberSuffix() {
		return streetNumberSuffix;
	}

	public ValidAddress streetNumberSuffix(String streetNumberSuffix) {
		this.streetNumberSuffix = streetNumberSuffix;
		return this;
	}

	public String getState() {
		return state;
	}

	public ValidAddress state(String state) {
		this.state = state;
		return this;
	}

	public String getPostCode() {
		return postCode;
	}

	public ValidAddress postCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

	public String getLocality() {
		return locality;
	}

	public ValidAddress locality(String locality) {
		this.locality = locality;
		return this;
	}	

	public static ValidAddress createInstance() {
		return new ValidAddress();
	}

	public String getRouteType() {
		return routeType;
	}

	public ValidAddress routeType(String routeType) {
		this.routeType = routeType;
		return this;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public ValidAddress propertyName(String propertyName) {
		this.propertyName = propertyName;
		return this;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public ValidAddress confirmed(boolean confirmed) {
		this.confirmed = confirmed;
		return this;
	}

}
