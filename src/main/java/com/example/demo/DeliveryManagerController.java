package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/deliverymedium")
@RestController
public class DeliveryManagerController {

	
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public ResponseEntity<?> executeTask(String jhkjl) {
        try {
            
        } catch (Exception e) {
            
        }
        
    }
	
}
