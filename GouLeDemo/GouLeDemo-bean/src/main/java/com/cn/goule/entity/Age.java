/**   
 * Copyright  2017 公司名. All rights reserved.
 * 
 * @Title: Age.java 
 * @Prject: GouLeDemo-bean
 * @Package: com.cn.goule.entity 
 * @Description: TODO
 * @author: 孙宇轩   
 * @date: 2017年10月28日 上午11:14:22 
 * @version: V1.0   
 */
package com.cn.goule.entity;

import java.io.Serializable;

/** 
 * @ClassName: Age 
 * @Description: TODO
 * @author: 孙宇轩
 * @date: 2017年10月28日 上午11:14:22  
 */
public class Age implements Serializable {
	private Integer dogId = null;
	private String  dogAge = null;
	/**
	 * @return the dogId
	 */
	public Integer getDogId() {
		return dogId;
	}
	/**
	 * @param dogId the dogId to set
	 */
	public void setDogId(Integer dogId) {
		this.dogId = dogId;
	}
	/**
	 * @return the dogAge
	 */
	public String getDogAge() {
		return dogAge;
	}
	/**
	 * @param dogAge the dogAge to set
	 */
	public void setDogAge(String dogAge) {
		this.dogAge = dogAge;
	}
	

}
