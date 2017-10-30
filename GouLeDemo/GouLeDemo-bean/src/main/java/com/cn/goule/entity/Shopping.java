/**   
 * Copyright  2017 公司名. All rights reserved.
 * 
 * @Title: Shopping.java 
 * @Prject: GouLeDemo-bean
 * @Package: com.cn.goule.entity 
 * @Description: TODO
 * @author: 孙宇轩   
 * @date: 2017年10月28日 上午11:41:51 
 * @version: V1.0   
 */
package com.cn.goule.entity;

import java.io.Serializable;

/**
 * @ClassName: Shopping
 * @Description: TODO
 * @author: 孙宇轩
 * @date: 2017年10月28日 上午11:41:51
 */
public class Shopping implements Serializable {
	private Integer dogId = null;
	private String dogTitle = null;
	private Integer dogTypeId = null;
	private Integer dogPrice = null;
	private Integer dogAge = null;
	private Integer dogSex = null;
	private String dogDescribe = null;
	private String dogPircture = null;

	/**
	 * @return the dogId
	 */
	public Integer getDogId() {
		return dogId;
	}

	/**
	 * @param dogId
	 *            the dogId to set
	 */
	public void setDogId(Integer dogId) {
		this.dogId = dogId;
	}

	/**
	 * @return the dogTitle
	 */
	public String getDogTitle() {
		return dogTitle;
	}

	/**
	 * @param dogTitle
	 *            the dogTitle to set
	 */
	public void setDogTitle(String dogTitle) {
		this.dogTitle = dogTitle;
	}

	/**
	 * @return the dogTypeId
	 */
	public Integer getDogTypeId() {
		return dogTypeId;
	}

	/**
	 * @param dogTypeId
	 *            the dogTypeId to set
	 */
	public void setDogTypeId(Integer dogTypeId) {
		this.dogTypeId = dogTypeId;
	}

	/**
	 * @return the dogPrice
	 */
	public Integer getDogPrice() {
		return dogPrice;
	}

	/**
	 * @param dogPrice
	 *            the dogPrice to set
	 */
	public void setDogPrice(Integer dogPrice) {
		this.dogPrice = dogPrice;
	}

	/**
	 * @return the dogAge
	 */
	public Integer getDogAge() {
		return dogAge;
	}

	/**
	 * @param dogAge
	 *            the dogAge to set
	 */
	public void setDogAge(Integer dogAge) {
		this.dogAge = dogAge;
	}

	/**
	 * @return the dogSex
	 */
	public Integer getDogSex() {
		return dogSex;
	}

	/**
	 * @param dogSex
	 *            the dogSex to set
	 */
	public void setDogSex(Integer dogSex) {
		this.dogSex = dogSex;
	}

	/**
	 * @return the dogDescribe
	 */
	public String getDogDescribe() {
		return dogDescribe;
	}

	/**
	 * @param dogDescribe
	 *            the dogDescribe to set
	 */
	public void setDogDescribe(String dogDescribe) {
		this.dogDescribe = dogDescribe;
	}

	/**
	 * @return the dogPircture
	 */
	public String getDogPircture() {
		return dogPircture;
	}

	/**
	 * @param dogPircture
	 *            the dogPircture to set
	 */
	public void setDogPircture(String dogPircture) {
		this.dogPircture = dogPircture;
	}

}
