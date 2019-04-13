package wsi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer employeeid;
  String lastname;
  String firstname;
  String photo;
  String notes;
  @Type(type = "date")
  @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
  Date birthdate;
}
