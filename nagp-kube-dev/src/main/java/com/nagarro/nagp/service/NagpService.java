
package com.nagarro.nagp.service;

import java.util.List;

import com.nagarro.nagp.model.BasicDetails;

public interface NagpService {

	BasicDetails saveBasicDetails(BasicDetails department);

	List<BasicDetails> fetchBasicDetails(String phone);

}
