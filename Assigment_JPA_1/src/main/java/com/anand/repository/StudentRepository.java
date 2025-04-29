package com.anand.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.anand.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

	//add all information using name based query parameter
	@Modifying
	@Transactional
	@Query(value="insert into student values(:stId,:stName,:stCource,:stCont)",nativeQuery=true)
	public void addAllDetail(@Param(value="stId") int stid,
			                 @Param(value="stName") String stName,
			                 @Param(value="stCource") String stCource,
			                 @Param(value="stCont")long stCont);
	
	//for delete student information
	@Modifying
	@Transactional
	@Query(value="DELETE FROM student WHERE stid = :stId",nativeQuery=true)
	public void deleteDetails(@Param(value="stId") int stId);
	
	//for update student information
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO student (stid, stname, stcource, stcont) VALUES (:stId, :stName, :stCource, :stCont) ON DUPLICATE KEY UPDATE stname = :stName, stcource = :stCource, stcont = :stCont", nativeQuery = true)
	public void update(@Param(value="stId") int stId,
			           @Param(value="stName") String stName,
			           @Param(value="stCource") String stCource,
			           @Param(value="stCont") long stCont);
}
