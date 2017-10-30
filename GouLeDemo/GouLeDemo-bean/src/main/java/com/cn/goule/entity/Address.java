/**   
 * Copyright  2017 公司名. All rights reserved.
 * 
 * @Title: Address.java 
 * @Prject: GouLeDemo-bean
 * @Package: com.cn.goule.entity 
 * @Description: TODO
 * @author: 孙宇轩   
 * @date: 2017年10月28日 上午11:12:02 
 * @version: V1.0   
 */
package com.cn.goule.entity;

import java.io.Serializable;

/** 
 * @ClassName: Address 
 * @Description: TODO
 * @author: 孙宇轩
 * @date: 2017年10月28日 上午11:12:02  
 */
public class Address implements Serializable {
			private  Integer addressId = null;
			private Integer addressFatherCodeId = null;
			private Integer addressCodeId = null;
			private String  addressCode = null;
			private String  addressName = null;
			/**
			 * @return the addressId
			 */
			public Integer getAddressId() {
				return addressId;
			}
			/**
			 * @param addressId the addressId to set
			 */
			public void setAddressId(Integer addressId) {
				this.addressId = addressId;
			}
			/**
			 * @return the addressFatherCodeId
			 */
			public Integer getAddressFatherCodeId() {
				return addressFatherCodeId;
			}
			/**
			 * @param addressFatherCodeId the addressFatherCodeId to set
			 */
			public void setAddressFatherCodeId(Integer addressFatherCodeId) {
				this.addressFatherCodeId = addressFatherCodeId;
			}
			/**
			 * @return the addressCodeId
			 */
			public Integer getAddressCodeId() {
				return addressCodeId;
			}
			/**
			 * @param addressCodeId the addressCodeId to set
			 */
			public void setAddressCodeId(Integer addressCodeId) {
				this.addressCodeId = addressCodeId;
			}
			/**
			 * @return the addressCode
			 */
			public String getAddressCode() {
				return addressCode;
			}
			/**
			 * @param addressCode the addressCode to set
			 */
			public void setAddressCode(String addressCode) {
				this.addressCode = addressCode;
			}
			/**
			 * @return the addressName
			 */
			public String getAddressName() {
				return addressName;
			}
			/**
			 * @param addressName the addressName to set
			 */
			public void setAddressName(String addressName) {
				this.addressName = addressName;
			}
			

}
