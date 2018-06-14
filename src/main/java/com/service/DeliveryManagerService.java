package com.service;

import java.util.List;

import com.dto.DeliveryBoyRequest;
import com.dto.Response;

public interface DeliveryManagerService {

	List<Response> assignOrdersToDeliveryBoys(DeliveryBoyRequest request);
}
