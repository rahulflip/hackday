package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dto.DeliveryBoyRequest;
import com.service.DeliveryManagerService;


@RestController
@RequestMapping("/deliverymedium")
public class DeliveryManagerController {

	@Autowired
	DeliveryManagerService deliveryManagerService;
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<?> assignOrdersToDeliveryBoys(DeliveryBoyRequest request) {
        try {
        	deliveryManagerService.assignOrdersToDeliveryBoys(request);
        } catch (Exception e) {
            
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

	
}
