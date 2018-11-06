package com.sola.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="goods")
public class Goods implements Serializable{
	private static final long serialVersionUID = -714071795694743034L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name="goodsname")
	private String goodsName;
	@Column(name="price")
	private Double price;
	@Column(name="descrition")
	private String descrition;
	@Column(name="off")
	private Double off;
	@Column(name="favoritenums")
	private Integer favoriteNums;
	@Column(name="starts")
	private Integer stars;
	@Column(name="startclick")
	private Integer startClick;
	@Column(name="typeid")
	private Integer typeId;
	@Column(name="imgsrc",nullable=false)
	private String imgSrc;
	
	
	
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public Integer getStartClick() {
		return startClick;
	}
	public void setStartClick(Integer startClick) {
		this.startClick = startClick;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(String goodsName, Double price, String descrition, Double off, Integer favoriteNums, Integer stars,
			Integer startClick) {
		super();
		this.goodsName = goodsName;
		this.price = price;
		this.descrition = descrition;
		this.off = off;
		this.favoriteNums = favoriteNums;
		this.stars = stars;
		this.startClick = startClick;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	public Double getOff() {
		return off;
	}
	public void setOff(Double off) {
		this.off = off;
	}
	public Integer getFavoriteNums() {
		return favoriteNums;
	}
	public void setFavoriteNums(Integer favoriteNums) {
		this.favoriteNums = favoriteNums;
	}
	public Integer getStars() {
		return stars;
	}
	public void setStars(Integer stars) {
		this.stars = stars;
	}
	
	
}
