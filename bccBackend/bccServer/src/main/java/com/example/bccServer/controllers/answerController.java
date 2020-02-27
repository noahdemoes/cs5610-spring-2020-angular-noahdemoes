package com.example.bccServer.controllers;



import com.example.bccServer.models.answer;
import com.example.bccServer.repositories.answerRepository;
import com.example.bccServer.services.answerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class answerController {
    @Autowired
    answerService service;



    @PostMapping("/api/answers")
    public answer createAnswer(@RequestBody answer Answer){
        return service.createAnswer(Answer);
    };

    @GetMapping("/api/answers")
    public List<answer> findAllAnswers(){
        return service.findAllAnswers();}


}
