package wsi.service;

import org.springframework.data.repository.CrudRepository;
import wsi.model.Customer;
import wsi.model.Employee;

public interface CustomerRepo extends CrudRepository<Customer,Integer> {
    Iterable<Customer> getByCountryStartingWith(String countryPrefix);
}
