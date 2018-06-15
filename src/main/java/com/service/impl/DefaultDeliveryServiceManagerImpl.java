package com.service.impl;

import com.entity.DHDeliverOrderStatus;
import com.repository.DHDeliverOrderStatusRepository;
import com.repository.DeliveryDHMasterRepository;
import com.service.DefaultDeliveryServiceManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class DefaultDeliveryServiceManagerImpl implements DefaultDeliveryServiceManager {


    @Autowired
    DHDeliverOrderStatusRepository dhDeliverOrderStatusRepository;

    @Autowired
    DeliveryDHMasterRepository deliveryBoyDHMasterRepository;




    @Override
    public Integer assignOrdersBydDefaultMethod(Integer dhId){
        Object[][] totalDBs = deliveryBoyDHMasterRepository.getDelveryBoyRecords(dhId);
        if(totalDBs != null && totalDBs.length > 0) {
            for(Object[] db: totalDBs) {
                Integer capacity_db = (Integer) db[0];
                Integer dbId = (Integer) db [1];
                String dbName = (String) db [2];
                Object [][] unassignedDbs =  dhDeliverOrderStatusRepository.getUnassignedDB(dhId,"UNASSIGNED","PRESENT");
                if(unassignedDbs != null && unassignedDbs.length > 0) {
                    while (capacity_db>0) {
                        for (Object[] dbObject : unassignedDbs) {
                            DHDeliverOrderStatus dhDeliverOrderStatus = new DHDeliverOrderStatus(null,null,null,null);
                            dhDeliverOrderStatus.setId((Integer) dbObject[0]);
                            dhDeliverOrderStatus.setDhId((Integer) dbObject[1]);
                            dhDeliverOrderStatus.setDeliveryBoyId(dbId);
                            dhDeliverOrderStatus.setDeliveryBoyName(dbName);
                            dhDeliverOrderStatus.setStatus("ASSIGNED");
                            dhDeliverOrderStatus.setDate((Date) dbObject[2]);
                            dhDeliverOrderStatus.setOrderId((String) dbObject[3]);
                            dhDeliverOrderStatusRepository.save(dhDeliverOrderStatus);
                        }
                        capacity_db-- ;
                    }
                }else{
                    return -1;
                }
            }
            Object [][] unassignedDbS =  dhDeliverOrderStatusRepository.getUnassignedDB(dhId,"UNASSIGNED","PRESENT");
            if(unassignedDbS==null || unassignedDbS.length ==0){
                return -1;
            }else{
                //do the sync call to the

                return dhId;
            }
        }else{
            Object [][] unassignedDbS =  dhDeliverOrderStatusRepository.getUnassignedDB(dhId,"UNASSIGNED","PRESENT");
            if(unassignedDbS==null || unassignedDbS.length ==0){
                return -1;
            }else{
                //do the sync call to the

                return dhId;
            }
        }
    }
}
