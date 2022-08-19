package com.jetbrains.SpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import java.util.Iterator;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);

                                          //INSERT DATA
//		                           Employee emp=new Employee();
//	                            	emp.setFirstname("patel");
//		                            emp.setLastname("jay");
//                            Employee emp1 = employeeRepository.save(emp);
//	                                System.out.println(emp1);


		                                 //UPDATE DATA
//                       Optional<Employee> optional = employeeRepository.findById(2);
//                           	Employee emp = optional.get();
//	                        	emp.setFirstname("karkar");
//	                        	employeeRepository.save(emp);
//	                         	System.out.println(emp);
//

                                        //DISPLAY DATA
	                       	Iterable<Employee> itr=employeeRepository.findAll();
		                    Iterator<Employee> iterator=itr.iterator();

                                		while(iterator.hasNext())
		                                {
											Employee emp=iterator.next();
			                                System.out.println(emp);
		                                }

		                               //DELETE DATA
//	                      	employeeRepository.deleteById(1);
//                  		System.out.println("deleted");




	}

}
