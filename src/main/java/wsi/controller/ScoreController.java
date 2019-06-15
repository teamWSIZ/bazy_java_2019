package wsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wsi.model.*;
import wsi.service.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class ScoreController {
    @Autowired ScoreRepo scoreRepo;


    //Messages
    @GetMapping(value = "/scores")
    public Iterable<Score> getScores() {
        return scoreRepo.findAllByOrderByScoreDesc();
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
