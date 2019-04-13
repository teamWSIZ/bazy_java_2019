package wsi.service;

import org.springframework.data.repository.CrudRepository;
import wsi.model.Employee;
import wsi.model.Message;

public interface EmployeeRepo extends CrudRepository<Employee,Integer> {
//    Iterable<User> findByUsernameStartingWith(String usernameprefix);
}
