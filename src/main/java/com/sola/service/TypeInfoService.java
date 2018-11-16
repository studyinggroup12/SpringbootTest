package com.sola.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sola.entity.TypeInfo;

public interface TypeInfoService extends JpaRepository<TypeInfo, Integer>{
	Integer findIdByType(String type);
	List<TypeInfo> findByFatherId(Integer id);
	@Query("select id from TypeInfo where urlname=?1")
	Integer findIdByUrlName(String urlName);
}
