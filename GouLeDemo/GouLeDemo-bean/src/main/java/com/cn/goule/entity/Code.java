/**   
 * Copyright  2017 公司名. All rights reserved.
 * 
 * @Title: Code.java 
 * @Prject: GouLeDemo-bean
 * @Package: com.cn.goule.entity 
 * @Description: TODO
 * @author: 孙宇轩   
 * @date: 2017年10月28日 上午11:49:36 
 * @version: V1.0   
 */
package com.cn.goule.entity;

import java.io.Serializable;

/** 
 * @ClassName: Code 
 * @Description: TODO
 * @author: 孙宇轩
 * @date: 2017年10月28日 上午11:49:36  
 */
public class Code implements Serializable {
	private Integer userId = null;
	private String userCode = null;
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the userCode
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	

}
