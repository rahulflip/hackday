package com.repository;

import com.entity.DHDeliverOrderStatus;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DHDeliverOrderStatusRepository extends JpaRepository<DHDeliverOrderStatus,Integer> {

	@Query("select NEW com.entity.DHDeliverOrderStatus(dos.dhId,dos.deliveryBoyId,dos.deliveryBoyName,dos.status,dos.orderId) from DHDeliverOrderStatus dos where dos.dhId=(:dhId) and dos.status=(:status)")
	public List<DHDeliverOrderStatus> findUnassignedOrdersForDH(@Param("dhId")Integer dhId, @Param("status") String status);


    @Query(value= "select dmm.id,dmm.dh_id,dmm.order_date,dmm.order_id from dh_delivery_order_status dmm inner join delivery_boy_absence dba on dmm.delivery_boy_id=dba.delivery_boy_id"
            + "where dmm.dh_id=(:dhId) and dba.status=(:status) and dba.active=(:active)",nativeQuery=true)
    public Object[][] getUnassignedDB(@Param("dhId") Integer dhId, @Param("status") String status, @Param("active") String active);

}
