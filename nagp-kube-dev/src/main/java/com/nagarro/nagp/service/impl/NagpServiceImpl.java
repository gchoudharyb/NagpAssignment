
package com.nagarro.nagp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.model.BasicDetails;
import com.nagarro.nagp.repository.NagpRepository;
import com.nagarro.nagp.service.NagpService;

@Service

public class NagpServiceImpl
	implements NagpService {

	@Autowired
	private NagpRepository nagpRepository;

	@Override
	public BasicDetails saveBasicDetails(BasicDetails basicDetails) {
		return nagpRepository.save(basicDetails);
	}

	@Override
	public List<BasicDetails> fetchBasicDetails(String phone) {
		return nagpRepository.findByPhone(phone);
	}

	
}
