package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.DHToDHMapping;

@Repository
public interface DHToDHRepository extends JpaRepository<DHToDHMapping,Integer>{
	
	@Query(value="select * from dh_dh_mapper where dhId=:dhId",nativeQuery=true)
	List<DHToDHMapping> findAllByDHIds(@Param("dhId") Integer dhId);

}
