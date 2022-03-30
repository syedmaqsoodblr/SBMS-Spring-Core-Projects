package com.maq.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "STUDENT_INFO")
public class Student {

	@Id
	@SequenceGenerator(name="sid_seq", sequenceName="STUDENT_ID_SEQ", allocationSize=1)
	@GeneratedValue(generator="sid_seq")
	@Column(name = "student_id")
	private Integer sid;

	@Column(name = "student_name")
	private String sname;

	@Column(name = "student_rank")
	private Integer srank;

	@Column(name = "created_date", updatable = false)
	@CreationTimestamp
	private LocalDateTime createdDate;

	@Column(name = "updated_date", insertable = false)
	@UpdateTimestamp
	private LocalDateTime updatedDate;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getSrank() {
		return srank;
	}

	public void setSrank(Integer srank) {
		this.srank = srank;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", srank=" + srank + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}

}
