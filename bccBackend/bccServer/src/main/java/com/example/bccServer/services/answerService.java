package com.example.bccServer.services;




import com.example.bccServer.models.answer;
import com.example.bccServer.repositories.answerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class answerService {
    List<answer> answerList = new ArrayList<answer>();
    @Autowired
    answerRepository answerrepository;



    public answer createAnswer(answer Answer) {
        return answerrepository.save(Answer);
    }



    public List<answer> findAllAnswers (){
        return answerList;
    }
}
