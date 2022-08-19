package com.jetbrains.SpringDataJPA;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository <Employee, Integer> {

}
