package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.DeliveryBoyRequest;
import com.dto.Response;
import com.entity.DHDeliverOrderStatus;
import com.entity.DHToDHMapping;
import com.repository.DHDeliverOrderStatusRepository;
import com.repository.DHToDHRepository;
import com.repository.DeliveryDHMasterRepository;
import com.service.DeliveryManagerService;

@Service
public class DeliveryManagerServiceImpl implements DeliveryManagerService{

	@Autowired 
	DHToDHRepository dhToDhRepository;
	
	@Autowired
	DHDeliverOrderStatusRepository orderDHMapRepository;
	
	@Autowired
	DeliveryDHMasterRepository deliveryBoyDHMasterRepository;
	
	@Override
	public List<Response> assignOrdersToDeliveryBoys(DeliveryBoyRequest request) {
		List<Response> response = new ArrayList<Response>();
		List<DHDeliverOrderStatus> unassignedOrders = orderDHMapRepository.findUnassignedOrdersForDH(request.getDeliveryHub(), "NOT_ASSIGNED");
		Integer unassignedOrderSize = unassignedOrders.size();
		if(null != unassignedOrders && unassignedOrders.size() > 0) {
			List<DHToDHMapping> dhIdMappingDataList = dhToDhRepository.findAllByDHIds(request.getDeliveryHub());
			for(DHToDHMapping dhMapping: dhIdMappingDataList) {
				Integer nearestDhId = dhMapping.getNearestDhId();
				Object[][] unassignedDBs = deliveryBoyDHMasterRepository.getUnassignedDB(nearestDhId, "NOT_ASSIGNED", "PRESENT");
				if(unassignedDBs != null && unassignedDBs.length > 0) {
					for(Object[] db: unassignedDBs) {
						String dbName = (String)db[0];
						Integer dbId = (Integer)db[1];
						Integer capacity = (Integer) db[2];
						for(DHDeliverOrderStatus order: unassignedOrders) {
							if(capacity > 0 && "NOT_ASSIGNED".equals(order.getStatus())) {
								unassignedOrderSize--;
								Response res = new Response();
								order.setStatus("ASSIGNED");
								order.setDeliveryBoyId(dbId);
								order.setDeliveryBoyName(dbName);
								res.setDeliveryHub(nearestDhId);
								res.setDeliveryMedium(dbId);
								res.setDeliveryMediumName(dbName);
								res.setOrderNo(order.getOrderId());
								response.add(res);
								if(unassignedOrderSize == 0)
									break;
								capacity--;
							}
						}
						if(unassignedOrderSize == 0)
							break;
					}
				}
				if(unassignedOrderSize == 0)
					break;
			}
		}
		return response;
	}
}
