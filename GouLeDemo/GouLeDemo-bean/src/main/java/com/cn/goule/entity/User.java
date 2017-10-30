/**   
 * Copyright  2017 公司名. All rights reserved.
 * 
 * @Title: User.java 
 * @Prject: GouLeDemo-bean
 * @Package: com.cn.goule.entity 
 * @Description: TODO
 * @author: 孙宇轩   
 * @date: 2017年10月28日 上午11:46:02 
 * @version: V1.0   
 */
package com.cn.goule.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: User 
 * @Description: TODO
 * @author: 孙宇轩
 * @date: 2017年10月28日 上午11:46:02  
 */
public class User implements Serializable {
	private Integer userId = null;
	private String userCode = null;
	private String userPwd = null;
	private Integer userAddress = null;
	private String  userAddressCity = null;
	private String  userEmall = null;
	private Integer userSex = null;
	private Date userBirthday = null;
	private String  userOccuptaion = null;
	private Integer userQQ = null;
	private String  userWeixin = null;
	private Integer userType = null;
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
	/**
	 * @return the userPwd
	 */
	public String getUserPwd() {
		return userPwd;
	}
	/**
	 * @param userPwd the userPwd to set
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	/**
	 * @return the userAddress
	 */
	public Integer getUserAddress() {
		return userAddress;
	}
	/**
	 * @param userAddress the userAddress to set
	 */
	public void setUserAddress(Integer userAddress) {
		this.userAddress = userAddress;
	}
	/**
	 * @return the userAddressCity
	 */
	public String getUserAddressCity() {
		return userAddressCity;
	}
	/**
	 * @param userAddressCity the userAddressCity to set
	 */
	public void setUserAddressCity(String userAddressCity) {
		this.userAddressCity = userAddressCity;
	}
	/**
	 * @return the userEmall
	 */
	public String getUserEmall() {
		return userEmall;
	}
	/**
	 * @param userEmall the userEmall to set
	 */
	public void setUserEmall(String userEmall) {
		this.userEmall = userEmall;
	}
	/**
	 * @return the userSex
	 */
	public Integer getUserSex() {
		return userSex;
	}
	/**
	 * @param userSex the userSex to set
	 */
	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
	/**
	 * @return the userBirthday
	 */
	public Date getUserBirthday() {
		return userBirthday;
	}
	/**
	 * @param userBirthday the userBirthday to set
	 */
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	/**
	 * @return the userOccuptaion
	 */
	public String getUserOccuptaion() {
		return userOccuptaion;
	}
	/**
	 * @param userOccuptaion the userOccuptaion to set
	 */
	public void setUserOccuptaion(String userOccuptaion) {
		this.userOccuptaion = userOccuptaion;
	}
	/**
	 * @return the userQQ
	 */
	public Integer getUserQQ() {
		return userQQ;
	}
	/**
	 * @param userQQ the userQQ to set
	 */
	public void setUserQQ(Integer userQQ) {
		this.userQQ = userQQ;
	}
	/**
	 * @return the userWeixin
	 */
	public String getUserWeixin() {
		return userWeixin;
	}
	/**
	 * @param userWeixin the userWeixin to set
	 */
	public void setUserWeixin(String userWeixin) {
		this.userWeixin = userWeixin;
	}
	/**
	 * @return the userType
	 */
	public Integer getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	

}
