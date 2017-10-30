/**   
 * Copyright  2017 公司名. All rights reserved.
 * 
 * @Title: Price.java 
 * @Prject: GouLeDemo-bean
 * @Package: com.cn.goule.entity 
 * @Description: TODO
 * @author: 孙宇轩   
 * @date: 2017年10月28日 上午11:15:17 
 * @version: V1.0   
 */
package com.cn.goule.entity;

import java.io.Serializable;

/** 
 * @ClassName: Price 
 * @Description: TODO
 * @author: 孙宇轩
 * @date: 2017年10月28日 上午11:15:17  
 */
public class Price implements Serializable {
	private Integer  dogPriceId = null;
	private String  dogRriceRange = null;
	/**
	 * @return the dogPriceId
	 */
	public Integer getDogPriceId() {
		return dogPriceId;
	}
	/**
	 * @param dogPriceId the dogPriceId to set
	 */
	public void setDogPriceId(Integer dogPriceId) {
		this.dogPriceId = dogPriceId;
	}
	/**
	 * @return the dogRriceRange
	 */
	public String getDogRriceRange() {
		return dogRriceRange;
	}
	/**
	 * @param dogRriceRange the dogRriceRange to set
	 */
	public void setDogRriceRange(String dogRriceRange) {
		this.dogRriceRange = dogRriceRange;
	}
	
	

}
