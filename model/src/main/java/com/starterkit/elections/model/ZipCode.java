package com.starterkit.elections.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zip_codes")
public class ZipCode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "zip_code")
	private String zipCode;

	public Long getId() {
		return id;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	

}
