package wsi.service;

import org.springframework.data.repository.CrudRepository;
import wsi.model.Shipper;

public interface ShipperRepo extends CrudRepository<Shipper,Integer> {
}
