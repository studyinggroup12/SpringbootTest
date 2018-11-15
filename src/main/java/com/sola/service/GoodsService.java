package com.sola.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sola.entity.Goods;

public interface GoodsService extends JpaRepository<Goods, Integer>{
	List<Goods> findAllByTypeId(Integer typeId);
	
	@Query(value="select * from goods where id=?1",nativeQuery=true)
	Goods findById2(Integer id);
	
}
