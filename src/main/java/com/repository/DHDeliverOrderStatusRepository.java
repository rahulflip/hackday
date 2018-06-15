package com.repository;

import com.entity.DHDeliverOrderStatus;
import com.entity.DeliveryDHMaster;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DHDeliverOrderStatusRepository extends JpaRepository<DHDeliverOrderStatus,Integer> {
	
	@Query("select NEW com.entity.DHDeliverOrderStatus(dos.dhId,dos.deliveryBoyId,dos.deliveryBoyName,dos.status) from DHDeliverOrderStatus dos where dos.dhId=(:dhId) and dos.status=(:status)")
	public List<DHDeliverOrderStatus> findUnassignedOrdersForDH(@Param("dhId")Integer dhId, @Param("status") String status);
}
