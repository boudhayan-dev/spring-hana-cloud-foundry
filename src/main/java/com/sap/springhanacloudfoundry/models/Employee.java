package com.sap.springhanacloudfoundry.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	
	@Id
	@Column(name ="id", unique=true)
	private long id;
	@Column(name ="firstName")
	private String firstName;
	@Column(name ="lastName")
	private String lastName;
	@Column(name ="email", unique=true)
	private String email;
	@Column(name ="contact",unique=true)
	private String contact;

}
