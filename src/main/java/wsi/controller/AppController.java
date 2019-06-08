package wsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wsi.model.*;
import wsi.service.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Projektowanie API:
 * https://pages.apigee.com/rs/apigee/images/api-design-ebook-2012-03.pdf
 */

@RestController
@CrossOrigin
public class AppController {
    @Autowired MessageRepo messageRepo;
    @Autowired ShipperRepo shipperRepo;
    @Autowired EmployeeRepo employeeRepo;
    @Autowired OrderRepo orderRepo;
    @Autowired CustomerRepo customerRepo;
    @Autowired OrderService orderService;
    @Autowired ProductRepo productRepo;

    @GetMapping(value = "/status")
    public String showStatus() {
        return "App running OK";
    }

    //Messages
    @GetMapping(value = "/msgs")
    public Iterable<Message> getMessages() {
        return messageRepo.findAll();
    }

    @PostMapping(value = "/msgs")
    public Message upsertMessage(@RequestBody Message message) {
        /*
         * Dostajemy JSON:
         * {"id":1,"title":"genesis","body":"lorem ipsum dolor sit amet"}
         */
        return messageRepo.save(message);
    }

    //Products
    @GetMapping(value = "/products")
    public Iterable<Product> getProducts() {
        return productRepo.findAll();
    }

    //// Shippers
    //C

    //R
    @GetMapping("/shippers")
    public Iterable<Shipper> getAllShippers(
            @RequestParam(value = "prefix", defaultValue = "") String prefix) {
        if (prefix.equals("")) return shipperRepo.findAll();
        else return shipperRepo.getByShippernameStartingWith(prefix);
    }



    //U
    void saveShipper(Shipper s) {
        shipperRepo.save(s);
    }

    //D

    //// Employees
    @GetMapping("/employees")
    public Iterable<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }


    //// Customers

    //dodac metode "getAllCustomers"

    @GetMapping("/customers")
    public Iterable<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }


    //// Orders
    @GetMapping("/customers/{customerid}/orders")
    public Iterable<Order> getOrdersOfCustomer(@PathVariable(value = "customerid") Integer customerid) {
        return orderRepo.getByCustomerid(customerid);
    }

    @GetMapping("/orders/extended/{orderid}")
    public OrderExpanded getExtended(@PathVariable(value = "orderid") Integer orderid) {
        return orderService.resolveDetails(orderid);
    }


    @GetMapping("/orders/extended")
    public Iterable<OrderExpanded> getExtendedOrders(@RequestBody List<Integer> orderIds) {
        List<OrderExpanded> res = new ArrayList<>();
        orderIds.forEach(id -> res.add(orderService.resolveDetails(id)));
        return res;
    }


    //// Countries

    @GetMapping("/countries/{countryprefix}/customers")
    public Iterable<Customer> getCustomersByCountry(
            @PathVariable(value = "countryprefix") String countryPrefix) {
        return customerRepo.getByCountryStartingWith(countryPrefix);
    }

}
