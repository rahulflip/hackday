package com.repository;

import com.entity.DHDeliverOrderStatus;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DHDeliverOrderStatusRepository extends JpaRepository<DHDeliverOrderStatus,Integer> {

	@Query("select NEW com.entity.DHDeliverOrderStatus(dos.dhId,dos.deliveryBoyId,dos.deliveryBoyName,dos.status,dos.orderId) from DHDeliverOrderStatus dos where dos.dhId=(:dhId) and dos.status=(:status)")
	public List<DHDeliverOrderStatus> findUnassignedOrdersForDH(@Param("dhId")Integer dhId, @Param("status") String status);


    @Query(value= "select dmm.id,dmm.dh_id,dmm.orderDate,dmm.order_id from dh_delivery_order_status dmm "
            + "where dmm.dhId=(:dhId) and dmm.status=(:status)",nativeQuery=true)
    public Object[][] getUnassignedDB(@Param("dhId") Integer dhId, @Param("status") String status);


//    @Transactional
//    @Modifying
//    @Query("update DHDeliverOrderStatus set deliveryBoyId=:dbId,deliveryBoyName=:dbName,status=:status  where id=:id")
//    public Object [] updateassignedDb(@Param("id") Integer id,@Param("dbId") Integer dbId, @Param("dbName") String dbName, @Param("status") String status){
//
//
//    };


}
