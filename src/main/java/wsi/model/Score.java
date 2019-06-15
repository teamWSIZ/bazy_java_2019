package wsi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "highscore")
public class Score {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String alias;
  Integer score;
  Date created;
}
