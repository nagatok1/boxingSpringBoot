package com.benleadbeater.database.hello.mySpringDatabaseBootApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.benleadbeater.database.hello.mySpringDatabaseBootApp.model.BoxerModel;

@Repository
public interface BoxerRepository extends JpaRepository<BoxerModel,Long> {
	
//List<mySpringBootDataModel> findByCategory(String filmCategory);

}
