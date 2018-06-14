package com.repository;

import com.entity.DeliveryBoyDHMaster;
import com.entity.OrderDHMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDHMapRepository extends JpaRepository<OrderDHMap,Integer> {
}
