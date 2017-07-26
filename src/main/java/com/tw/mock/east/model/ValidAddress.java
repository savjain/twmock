package com.tw.mock.east.model;

public class ValidAddress {
	
	private String RouteType;
	
	private double percentMatch;
	
	private String address;

	public String getRouteType() {
		return RouteType;
	}

	public ValidAddress routeType(String routeType) {
		RouteType = routeType;
		return this;
	}

	public double getPercentMatch() {
		return percentMatch;
	}

	public ValidAddress percentMatch(double percentMatch) {
		this.percentMatch = percentMatch;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public ValidAddress address(String address) {
		this.address = address;
		return this;
	}
	
	public static ValidAddress createInstance() {
		return new ValidAddress();
	}
	

}
