package com.starterkit.elections.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
(name = "elections")
public class Election {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "election_date")
	private Date electionDate;

	public Long getId() {
		return id;
	}

	public Date getElectionDate() {
		return electionDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setElectionDate(Date electionDate) {
		this.electionDate = electionDate;
	}
	
	
}
