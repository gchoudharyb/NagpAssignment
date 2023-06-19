
package com.nagarro.nagp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.nagp.model.BasicDetails;


public interface NagpRepository extends JpaRepository<BasicDetails, Long> {
	
	public List<BasicDetails> findByPhone(String phone);
}
