package com.example.bccServer.services;


import com.example.bccServer.models.answer;

import java.util.ArrayList;
import java.util.List;

public class answerService {
    List<answer> answerList = new ArrayList<answer>();

    public answer  createAnswer(answer Answer){
        answerList.add(Answer);
        return Answer;


    };

    public List<answer> findAllAnswers (){
        return answerList;
    }
}
