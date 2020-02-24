package com.example.bccServer.services;


import com.example.bccServer.models.answer;

import java.util.ArrayList;
import java.util.List;

public class answerService {
    List<answer> answerList = new ArrayList<answer>();
    { answer Answer1 = new answer ("2", "86", "97", "drip", "cream", "2", "3", "light",
            "lemon");
    answerList.add(Answer1);
    }

    public answer  createAnswer(answer Answer){
        answerList.add(Answer);
        return Answer;


    };

    public List<answer> findAllAnswers (){
        return answerList;
    }
}
