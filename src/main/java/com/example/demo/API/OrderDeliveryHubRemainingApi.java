package com.example.demo.API;

import com.example.demo.ClassImpl.OrderAndDeliveryHub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDeliveryHubRemainingApi extends JpaRepository<Clientbranchmaster,Integer> {

     public OrderAndDeliveryHub orderAndDeliveryBoyRemaining();

}
