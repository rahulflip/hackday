package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.DeliveryBoyRequest;
import com.dto.Response;
import com.entity.DHToDHMapping;
import com.entity.OrderDHMap;
import com.repository.DHToDHRepository;
import com.repository.DeliveryBoyDHMasterRepository;
import com.repository.OrderDHMapRepository;
import com.service.DeliveryManagerService;

@Service
public class DeliveryManagerServiceImpl implements DeliveryManagerService{

	@Autowired 
	DHToDHRepository dhToDhRepository;
	
	@Autowired
	OrderDHMapRepository orderDHMapRepository;
	
	@Autowired
	DeliveryBoyDHMasterRepository deliveryBoyDHMasterRepository;
	
	@Override
	List<Response> assignOrdersToDeliveryBoys(DeliveryBoyRequest request) {
		List<Response> response = new ArrayList<Response>();
		List<Integer> ids = new ArrayList<>();
		ids.add(request.getDeliveryHub());
		List<OrderDHMap> unassignedOrders = orderDHMapRepository.findUnassignedOrdersForDH(request.getDeliveryHub(), "UNASSIGNED");
		if(null != unassignedOrders && unassignedOrders.size() > 0) {
			List<DHToDHMapping> dhIdMappingDataList = dhToDhRepository.findAllById(ids);
			for(DHToDHMapping dhMapping: dhIdMappingDataList) {
				Integer nearestDhId = dhMapping.getNearestDhId();
				Object[][] unassignedDBs = deliveryBoyDHMasterRepository.getUnassignedDB(nearestDhId, "UNASSIGNED", "PRESENT");
				if(unassignedDBs != null && unassignedDBs.length > 0) {
					for(Object[] db: unassignedDBs) {
						String dbName = (String)db[0];
						Integer dbId = (Integer)db[1];
						Integer capacity = (Integer) db[2];
						for(OrderDHMap order: unassignedOrders) {
							if(capacity > 0) {
								
							}
						}
					}
				}
			}
		}
	}
}
