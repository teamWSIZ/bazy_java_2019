package wsi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * To jest "DTO", czyli DataTransferObject
 * cel jest taki, by przesyłać na frontend obiekty z wypełnionymi polami EmployeeName, CustomerName,
 * OrderTotalDollars
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderExpanded {
    Order order;
    String customername;
    String employeename;
    Double orderTotalDollars;
}
