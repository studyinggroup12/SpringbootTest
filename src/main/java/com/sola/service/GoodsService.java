package com.sola.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sola.entity.Goods;

public interface GoodsService extends JpaRepository<Goods, Integer>{
	List<Goods> findAllByTypeId(Integer typeId);
}
