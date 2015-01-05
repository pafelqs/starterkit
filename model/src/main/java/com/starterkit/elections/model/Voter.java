package com.starterkit.elections.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "voters")
public class Voter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "pesel")
	private Long pesel;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "zip_codes_id")
	private ZipCode zipCode;

	public Long getId() {
		return id;
	}

	public Long getPesel() {
		return pesel;
	}

	public ZipCode getZipCode() {
		return zipCode;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPesel(Long pesel) {
		this.pesel = pesel;
	}

	public void setZipCode(ZipCode zipCode) {
		this.zipCode = zipCode;
	}
	
}
