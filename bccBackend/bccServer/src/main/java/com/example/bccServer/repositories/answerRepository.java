package com.example.bccServer.repositories;

import com.example.bccServer.models.answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface answerRepository extends CrudRepository<answer,Long> {

}
