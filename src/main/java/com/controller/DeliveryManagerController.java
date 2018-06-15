package com.controller;

import java.util.List;
import com.service.DefaultDeliveryServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
@EnableAutoConfiguration
@SpringBootApplication
public class DeliveryManagerController {

	@Autowired
	DeliveryManagerService deliveryManagerService;

	@Autowired
    DefaultDeliveryServiceManager defaultDeliveryServiceManager;
	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public ResponseEntity<List<Response>> assignOrdersToDeliveryBoys(@RequestBody DeliveryBoyRequest request) {
        try {
        	List<Response> response = deliveryManagerService.assignOrdersToDeliveryBoys(request);
        	return new ResponseEntity<List<Response>>(response,HttpStatus.OK);
        } catch (Exception e) {
        	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @RequestMapping(value = "/assignOrder", method = RequestMethod.POST)
    public Integer assignOrders(@RequestBody Integer dhId) {
        try {
            defaultDeliveryServiceManager.assignOrdersBydDefaultMethod(dhId);
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }

	
}
