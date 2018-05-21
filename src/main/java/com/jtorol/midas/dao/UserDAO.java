package com.jtorol.midas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jtorol.midas.domain.UserVO;

@Repository
public interface UserDAO extends JpaRepository<UserVO, Integer>{
	
}
