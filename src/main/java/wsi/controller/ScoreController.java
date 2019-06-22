package wsi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import wsi.model.Score;
import wsi.service.ScoreRepo;

import java.util.Date;

@RestController
@CrossOrigin
@Slf4j
public class ScoreController {
    @Autowired ScoreRepo scoreRepo;


    //Messages
    @GetMapping(value = "/scores")
    public Iterable<Score> getScores(
            @RequestParam(value = "limit", defaultValue = "10000") Integer limit,
            @RequestParam(value = "alias") String alias
    ) {
        log.info("Setting limit: {}", limit);
        Pageable p = PageRequest.of(0, limit);

        if (alias==null) {
            ///....
        } else {
            ////
        }
        //todo: pole "since" typu Data.......

        return scoreRepo.findAllByOrderByScoreDesc(p);
    }

    @PostMapping(value = "/scores")
    public Score upsertMessage(@RequestBody Score score) {
        score.setCreated(new Date());
        return scoreRepo.save(score);
    }

    @DeleteMapping(value = "/scores/{id}")
    public String deleteScore(@PathVariable Integer id) {
        scoreRepo.deleteById(id);
        return "OK";
    }

}
