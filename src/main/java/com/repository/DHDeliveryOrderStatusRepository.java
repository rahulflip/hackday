package com.repository;

import com.entity.DHDeliveryOrderStatus;
import com.entity.DeliveryBoyDHMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DHDeliveryOrderStatusRepository extends JpaRepository<DHDeliveryOrderStatus,Integer> {
}
