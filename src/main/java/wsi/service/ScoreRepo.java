package wsi.service;

import org.springframework.data.repository.CrudRepository;
import wsi.model.Customer;
import wsi.model.Score;

public interface ScoreRepo extends CrudRepository<Score,Integer> {
    Iterable<Score> findAllByOrderByScoreDesc();
}
