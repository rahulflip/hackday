package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dto.DeliveryBoyRequest;
import com.dto.Response;
import com.service.DeliveryManagerService;


@RestController
@RequestMapping("/deliverymedium")
public class DeliveryManagerController {

	@Autowired
	DeliveryManagerService deliveryManagerService;
	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public ResponseEntity<List<Response>> assignOrdersToDeliveryBoys(@RequestBody DeliveryBoyRequest request) {
        try {
        	List<Response> response = deliveryManagerService.assignOrdersToDeliveryBoys(request);
        	return new ResponseEntity<List<Response>>(response,HttpStatus.OK);
        } catch (Exception e) {
        	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

	
}
