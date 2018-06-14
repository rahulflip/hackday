package com.repository;

import com.entity.DHDeliverOrderStatus;
import com.entity.DeliveryDHMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DHDeliverOrderStatusRepository extends JpaRepository<DHDeliverOrderStatus,Integer> {
}
