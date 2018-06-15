package com.service.impl;

import com.entity.DHDeliverOrderStatus;
import com.repository.DHDeliverOrderStatusRepository;
import com.repository.DeliveryDHMasterRepository;
import com.service.DefaultDeliveryServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class DefaultDeliveryServiceManagerImpl implements DefaultDeliveryServiceManager {



    @Autowired
    DHDeliverOrderStatusRepository dhDeliverOrderStatusRepository;

    @Autowired
    DeliveryDHMasterRepository deliveryBoyDHMasterRepository;




    @Override
    public Integer assignOrdersBydDefaultMethod(Integer dhId){
        Object[][] totalActiveDbs = deliveryBoyDHMasterRepository.getDelveryBoyRecords(dhId,"PRESENT");
        if(totalActiveDbs != null && totalActiveDbs.length > 0) {
            for(Object[] db: totalActiveDbs) {
                Integer capacity_db = (Integer) db[0];
                Integer dbId = (Integer) db [1];
                String dbName = (String) db [2];
                Object [][] unassignedDbs =  dhDeliverOrderStatusRepository.getUnassignedDB(dhId,"NOT_ASSIGNED");
                if(unassignedDbs != null && unassignedDbs.length > 0) {
                    while (capacity_db>0) {
                        for (Object[] dbObject : unassignedDbs) {
                            DHDeliverOrderStatus dhDeliverOrderStatus = new DHDeliverOrderStatus(null,null,null,null,null);
                            dhDeliverOrderStatus.setId((Integer) dbObject[0]);
                            dhDeliverOrderStatus.setDhId((Integer) dbObject[1]);
                            dhDeliverOrderStatus.setDeliveryBoyId(dbId);
                            dhDeliverOrderStatus.setDeliveryBoyName(dbName);
                            dhDeliverOrderStatus.setStatus("ASSIGNED");
                            dhDeliverOrderStatus.setDate(new Date());
                            dhDeliverOrderStatus.setOrderId((String) dbObject[3]);
                            //dhDeliverOrderStatusRepository.updateassignedDb((Integer) dbObject[0],dbId,dbName,"ASSIGNED");
                            dhDeliverOrderStatusRepository.saveAndFlush(dhDeliverOrderStatus);
                        }
                        capacity_db-- ;
                    }
                }else{
                    return -1;
                }
            }
            Object [][] unassignedDbS =  dhDeliverOrderStatusRepository.getUnassignedDB(dhId,"NOT_ASSIGNED");
            if(unassignedDbS==null || unassignedDbS.length ==0){
                return -1;
            }else{
                //do the sync call to the

                return dhId;
            }
        }else{
            Object [][] unassignedDbS =  dhDeliverOrderStatusRepository.getUnassignedDB(dhId,"NOT_ASSIGNED");
            if(unassignedDbS==null || unassignedDbS.length ==0){
                return -1;
            }else{
                //do the sync call to the

                return dhId;
            }
        }
    }
}
