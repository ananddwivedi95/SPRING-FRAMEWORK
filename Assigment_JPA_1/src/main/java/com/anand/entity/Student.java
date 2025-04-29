package com.anand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
    
	@Id
	@Column(name="stId")
	private int stId;
	
	@Column(name="stName")
	private String stName;
	
	@Column(name="stCource")
	private String stCource;
	
	@Column(name="stCont")
	private long stCont;

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStCource() {
		return stCource;
	}

	public void setStCource(String stCource) {
		this.stCource = stCource;
	}

	public long getStCont() {
		return stCont;
	}

	public void setStCont(long stCont) {
		this.stCont = stCont;
	}

	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", stCource=" + stCource + ", stCont=" + stCont + "]";
	}
	
	
	
}
