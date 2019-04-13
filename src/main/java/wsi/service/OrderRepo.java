package wsi.service;

import org.springframework.data.repository.CrudRepository;
import wsi.model.Employee;
import wsi.model.Order;

public interface OrderRepo extends CrudRepository<Order,Integer> {
    Iterable<Order> getByCustomerid(Integer customerid);
}
