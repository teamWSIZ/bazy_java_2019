package wsi.service;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import wsi.model.Customer;
import wsi.model.Score;

import java.util.List;

public interface ScoreRepo extends CrudRepository<Score,Integer> {

    List<Score> findAllByOrderByScoreDesc(Pageable p);

    List<Score> findAllByAliasOrderByScoreDesc(String alias, Pageable p);
}
