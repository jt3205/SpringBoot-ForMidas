package com.jtorol.midas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USER")
@Getter
@Setter
public class UserVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seq", updatable = false, nullable = false)
	int seq;
	
	@Column(name = "userId", nullable = false)
	String userId;
	
	@Column(name = "userPassword", nullable = false)
	String userPassword;
}
