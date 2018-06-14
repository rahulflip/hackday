package com.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dto.DeliveryBoyRequest;
import com.dto.Response;
import com.entity.DHToDHMapping;
import com.service.DeliveryManagerService;

@Service
public class DeliveryManagerServiceImpl implements DeliveryManagerService{

	@Override
	List<Response> assignOrdersToDeliveryBoys(DeliveryBoyRequest request) {
		List<DHToDHMapping>getDHToDHMapping(request.getDeliveryHub());
	}
}
