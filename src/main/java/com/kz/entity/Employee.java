//https://www.javaguides.net/2021/07/react-js-react-hooks-spring-boot.html
package com.kz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name", nullable = false, length = 200)
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 200)
	private String lastName;

	@Column(name = "email", nullable = false, length = 200)
	private String email;
}
