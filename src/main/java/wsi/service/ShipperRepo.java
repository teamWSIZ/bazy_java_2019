package wsi.service;

import org.springframework.data.repository.CrudRepository;
import wsi.model.Shipper;

import java.util.List;

public interface ShipperRepo extends CrudRepository<Shipper,Integer> {
    List<Shipper> getByShippernameStartingWith(String prefix);
}
