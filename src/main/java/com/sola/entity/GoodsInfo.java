package com.sola.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="goodsinfo")
public class GoodsInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name="goodsid",nullable=false)
	private Integer goodsId;
	@Column(name="sizeid",nullable=false)
	private Integer sizeId;
	@Column(name="colorid",nullable=false)
	private Integer colorId;
	@Column(name="stockings",nullable=false)
	private Integer stockings;
	
	public GoodsInfo() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	public GoodsInfo(Integer goodsId, Integer sizeId, Integer colorId, Integer stockings) {
		super();
		this.id = id;
		this.goodsId = goodsId;
		this.sizeId = sizeId;
		this.colorId = colorId;
		this.stockings = stockings;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getSizeId() {
		return sizeId;
	}
	public void setSizeId(Integer sizeId) {
		this.sizeId = sizeId;
	}
	public Integer getColorId() {
		return colorId;
	}
	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}
	public Integer getStockings() {
		return stockings;
	}
	public void setStockings(Integer stockings) {
		this.stockings = stockings;
	}
	
	
}
