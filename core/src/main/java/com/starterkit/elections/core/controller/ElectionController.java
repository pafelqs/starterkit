package com.starterkit.elections.core.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.starterkit.elections.model.Voter;
import com.starterkit.elections.model.dao.VoterDao;

@RestController
public class ElectionController {

	private static final Logger log = LoggerFactory
			.getLogger(ElectionController.class);
	private final VoterDao voterDao;

	@Autowired
	public ElectionController(VoterDao voterDao) {
		this.voterDao = voterDao;
	}

	@RequestMapping("/voter")
	public Voter voter(@RequestParam(value = "id", required = false) String id) {

		Voter voter = new Voter();
		voter.setPesel(0000000012345l);
		voter.setId(1l);
		return voter;
	}

	@RequestMapping("voters")
    public List<Voter> voters() {
    	List<Voter> voters = voterDao.getList();
    	
    	log.debug("Size: " + voters.size());
    	for (Voter voter : voters) {
    		log.debug(voter.toString());
		}
    	
    	return voters;
    }
}