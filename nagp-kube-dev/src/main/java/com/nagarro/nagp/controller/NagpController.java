package com.nagarro.nagp.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.constants.NagpConstants;
import com.nagarro.nagp.model.BasicDetails;
import com.nagarro.nagp.service.NagpService;

@RestController
@RequestMapping(NagpConstants.API_VERSION)
public class NagpController {

	@Autowired
	private NagpService nagpService;
	
	private static final Log logger = LogFactory.getLog(NagpController.class);
	@PostMapping("/details")
	public ResponseEntity<Object> details(@RequestBody BasicDetails basicDetails)
	{
		nagpService.saveBasicDetails(basicDetails);
		logger.info("Details added successfully");
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/details/{phone}")
	public ResponseEntity<Object> getDetails(@PathVariable("phone") String phone)
	{
		logger.info("Details fetched successfully");
		return new ResponseEntity<Object>(nagpService.fetchBasicDetails(phone), HttpStatus.OK);
	}
}
