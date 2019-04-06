package wsi.service;

import org.springframework.data.repository.CrudRepository;
import wsi.model.Message;

public interface MessageRepo extends CrudRepository<Message,Integer> {
//    Iterable<User> findByUsernameStartingWith(String usernameprefix);
}
