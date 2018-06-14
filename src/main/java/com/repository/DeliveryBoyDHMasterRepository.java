package com.repository;

import com.entity.DHToDHMapping;
import com.entity.DeliveryBoyDHMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryBoyDHMasterRepository extends JpaRepository<DeliveryBoyDHMaster,Integer> {
	
	@Query(value= "select dmm.delivery_medium_name,dmm.delivery_boy_id,dmm.capacity from delivery_dh_master dmm inner join delivery_boy_absence dba on dmm.delivery_boy_id=dba.delivery_boy_id"
			+ "where dmm.dh_id=(:dhId) and dba.status=(:status) and dba.active=(:active)",nativeQuery=true)
	public Object[][] getUnassignedDB(@Param("dhId") Integer dhId,@Param("status") String status,@Param("active") String active);
	
}
