package wsi.service;

import org.springframework.data.repository.CrudRepository;
import wsi.model.Employee;
import wsi.model.FakeUser;

public interface FakeUserRepo extends CrudRepository<FakeUser,Integer> {
//    Iterable<User> findByUsernameStartingWith(String usernameprefix);
}
