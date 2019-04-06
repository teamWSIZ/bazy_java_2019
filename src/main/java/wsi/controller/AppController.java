package wsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wsi.model.Message;
import wsi.service.MessageRepo;

@RestController
@CrossOrigin
public class AppController {

//    @Autowired
//    UserRepo userRepo;
    @Autowired
    MessageRepo messageRepo;

    @RequestMapping(value = "/status")
    public String showStatus() {
        return "App running OK";
    }

    //Messages
    @GetMapping(value = "/msgs")
    public Iterable<Message> getMessages() {
        return messageRepo.findAll();
    }

    @PostMapping(value = "/msgs")
    public Message upserMessage(@RequestBody Message message) {
        return messageRepo.save(message);
    }


}
