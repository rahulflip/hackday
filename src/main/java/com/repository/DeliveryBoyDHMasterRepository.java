package com.repository;

import com.entity.DHToDHMapping;
import com.entity.DeliveryBoyDHMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryBoyDHMasterRepository extends JpaRepository<DeliveryBoyDHMaster,Integer> {
}
