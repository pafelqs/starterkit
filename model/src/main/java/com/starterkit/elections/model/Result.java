package com.starterkit.elections.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
(name = "results")
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "elections_id")
	private Election election;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "voters_id")
	private Voter voter;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "candidates_id")
	private Candidate candidate;

	public Long getId() {
		return id;
	}

	public Election getElection() {
		return election;
	}

	public Voter getVoter() {
		return voter;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setElection(Election election) {
		this.election = election;
	}

	public void setVoter(Voter voter) {
		this.voter = voter;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	
	
}
