/**   
 * Copyright  2017 公司名. All rights reserved.
 * 
 * @Title: Type.java 
 * @Prject: GouLeDemo-bean
 * @Package: com.cn.goule.entity 
 * @Description: TODO
 * @author: 孙宇轩   
 * @date: 2017年10月28日 上午11:44:48 
 * @version: V1.0   
 */
package com.cn.goule.entity;

import java.io.Serializable;

/** 
 * @ClassName: Type 
 * @Description: TODO
 * @author: 孙宇轩
 * @date: 2017年10月28日 上午11:44:48  
 */
public class Type implements Serializable {
	private Integer dogTypeId = null;
	private String dogTypeCode = null;
	private String  dogTypeName = null;
	/**
	 * @return the dogTypeId
	 */
	public Integer getDogTypeId() {
		return dogTypeId;
	}
	/**
	 * @param dogTypeId the dogTypeId to set
	 */
	public void setDogTypeId(Integer dogTypeId) {
		this.dogTypeId = dogTypeId;
	}
	/**
	 * @return the dogTypeCode
	 */
	public String getDogTypeCode() {
		return dogTypeCode;
	}
	/**
	 * @param dogTypeCode the dogTypeCode to set
	 */
	public void setDogTypeCode(String dogTypeCode) {
		this.dogTypeCode = dogTypeCode;
	}
	/**
	 * @return the dogTypeName
	 */
	public String getDogTypeName() {
		return dogTypeName;
	}
	/**
	 * @param dogTypeName the dogTypeName to set
	 */
	public void setDogTypeName(String dogTypeName) {
		this.dogTypeName = dogTypeName;
	}
	

}
