package com.tw.mock.east.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tw.mock.east.model.ValidAddress;
import com.tw.mock.east.model.ValidationRequest;

@RestController
@RequestMapping("/validate")
public class MockAddressValidationController {
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Collection<ValidAddress>> validate(@RequestBody ValidationRequest request) {
		return new ResponseEntity<>(getMockResponse(request), HttpStatus.OK);
	}

	private Collection<ValidAddress> getMockResponse(ValidationRequest request) {
		List<ValidAddress> response = new ArrayList<>();
		ValidAddress add1 = ValidAddress.createInstance().routeType("RT-001").percentMatch(100).address(request.getAddress());
		response.add(add1);
		return response;
	}

}
