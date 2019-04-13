package wsi.service;

import org.springframework.data.repository.CrudRepository;
import wsi.model.Order;

public interface OrderDetailRepo extends CrudRepository<Order,Integer> {
}
