package wsi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wsi.model.Customer;
import wsi.model.Employee;
import wsi.model.Order;
import wsi.model.OrderExpanded;

@Service
public class OrderService {
    @Autowired OrderRepo orderRepo;
    @Autowired CustomerRepo customerRepo;
    @Autowired EmployeeRepo employeeRepo;


    public OrderExpanded resolveDetails(Integer orderid) {
        Order order = orderRepo.findOne(orderid);
        Customer customer = customerRepo.findOne(order.getCustomerid());
        Employee employee = employeeRepo.findOne(order.getEmployeeid());

        Double total = 0.;
        //teraz policzyc total...
        //1) wyciagnać liste (iterable) wszystkich orderDetail
        //2) dla każdego, wziąć productid, i sprawdzić w repo jaki jest jego koszt jednostkowy
        //3) do sumy dodać orederDetail.quantity * product.price

        OrderExpanded expanded = new OrderExpanded(
                order,
                customer.getCustomername(),
                employee.getLastname(),
                total);


        return expanded;
    }

}
