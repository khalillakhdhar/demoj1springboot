package com.demonstration.model;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@MappedSuperclass
public class Audit {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
private long id;
@Temporal(TemporalType.TIMESTAMP)
private Date createdAt;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}

}
