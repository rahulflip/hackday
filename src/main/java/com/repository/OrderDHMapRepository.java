package com.repository;

import com.entity.OrderDHMap;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderDHMapRepository extends JpaRepository<OrderDHMap,Integer> {
	
	@Query("select NEW com.entity.OrderDHMap() from OrderDHMap odm where odm.dh_id=(:dhId) and odm.status=(:status)")
	public List<OrderDHMap> findUnassignedOrdersForDH(@Param("dhId")Integer dhId, @Param("status") String status);
}
