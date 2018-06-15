package com.repository;

import com.entity.DeliveryBoyAbsence;
import com.entity.DeliveryDHMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DeliveryDHMasterRepository extends JpaRepository<DeliveryDHMaster,Integer> {
	
	@Query(value= "select dmm.delivery_boy_name,dmm.delivery_boy_id,dmm.no_delivered_package from delivery_dh_master dmm inner join delivery_boy_absence dba on dmm.delivery_boy_id=dba.delivery_boy_id"
			+ " where dmm.dh_id=(:dhId) and dba.assigned_status=(:status) and dba.presence=(:active)",nativeQuery=true)
	public Object[][] getUnassignedDB(@Param("dhId") Integer dhId,@Param("status") String status,@Param("active") String active);



	@Query(value = "select dmm.no_delivered_package,dmm.delivery_boy_id,dmm.delivery_boy_name from delivery_dh_master dmm inner join delivery_boy_absence dba on dmm.delivery_boy_id=dba.delivery_boy_id "
			+ "where dmm.dh_id = (:dhId) and dba.presence = (:active)",nativeQuery = true)
	public Object[][] getDelveryBoyRecords(@Param("dhId") Integer dhId,@Param("active") String active);
}
