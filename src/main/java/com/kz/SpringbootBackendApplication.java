// https://www.javaguides.net/2021/07/react-js-react-hooks-spring-boot.html?lr=1
package com.kz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kz.entity.Employee;
import com.kz.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder().firstName("Klemen").lastName("Zivkovic")
				.email("klemen.zivkovic@gmail.com").build();

		Employee employee2 = Employee.builder().firstName("Janez").lastName("Kranjski")
				.email("janez.kranjski@gmail.com").build();
		
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);		

	}

}
