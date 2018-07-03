package com.ratnadeep.techarticle.respository;

import com.ratnadeep.techarticle.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRespository extends JpaRepository<Author, Integer> {
    Author findByUserName(String username);
}
