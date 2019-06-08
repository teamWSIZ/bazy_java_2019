package wsi.service;

import org.springframework.data.repository.CrudRepository;
import wsi.model.Product;
import wsi.model.Shipper;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product,Integer> {
}
