package com.service.impl;

import com.entity.DHDeliverOrderStatus;
import com.repository.DHDeliverOrderStatusRepository;
import com.repository.DeliveryDHMasterRepository;
import com.service.DefaultDeliveryServiceManager;

import org.hibernate.dialect.MySQL5InnoDBDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;


@Service
public class DefaultDeliveryServiceManagerImpl implements DefaultDeliveryServiceManager {



    @Autowired
    DHDeliverOrderStatusRepository dhDeliverOrderStatusRepository;

    @Autowired
    DeliveryDHMasterRepository deliveryBoyDHMasterRepository;

    void updatefunction(Integer dbId,String dbName,String status,Integer id) throws SQLException {
        Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/hackday","root", "");
        PreparedStatement st = con.prepareStatement("update dhDeliveryOrderStatus set deliveryBoyId= ?,deliveryBoyName= ?,status= ?  where id= ?");
        st.setString(1,Integer.toString(dbId));
        st.setString(2,dbName);
        st.setString(3,status);
        st.setString(4,Integer.toString(id) );
        st.executeUpdate();
    }


    @Override
    public Integer assignOrdersBydDefaultMethod(Integer dhId) throws SQLException {
        Object[][] totalActiveDbs = deliveryBoyDHMasterRepository.getDelveryBoyRecords(dhId,"PRESENT");
        if(totalActiveDbs != null && totalActiveDbs.length > 0) {
            for(Object[] db: totalActiveDbs) {
                Integer capacity_db = (Integer) db[0];
                Integer dbId = (Integer) db [1];
                String dbName = (String) db [2];
                Object [][] unassignedOrders =  dhDeliverOrderStatusRepository.getUnassignedDB(dhId,"NOT_ASSIGNED");
                if(unassignedOrders != null && unassignedOrders.length > 0) {
                    while (capacity_db>0) {
                        for (Object[] dbObject : unassignedOrders) {
                        		DHDeliverOrderStatus dhDeliverOrderStatus = new DHDeliverOrderStatus(null,null,null,null,null);
                        		dhDeliverOrderStatus.setId((Integer) dbObject[0]);
                        		dhDeliverOrderStatus.setDhId((Integer) dbObject[1]);
                        		dhDeliverOrderStatus.setDeliveryBoyId(dbId);
                        		dhDeliverOrderStatus.setDeliveryBoyName(dbName);
                        		dhDeliverOrderStatus.setStatus("ASSIGNED");
                        		dhDeliverOrderStatus.setDate(new Date());
                        		dhDeliverOrderStatus.setOrderId((String) dbObject[3]);
                        		updatefunction(dbId,dbName,"ASSIGNED",(Integer) dbObject[0]);
                        		//dhDeliverOrderStatusRepository.updateassignedDb((Integer) dbObject[0],dbId,dbName,"ASSIGNED");
                           //dhDeliverOrderStatusRepository.saveAndFlush(dhDeliverOrderStatus);
                        		capacity_db-- ;
                        		if(capacity_db == 0)
                        			break;

                        }
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
