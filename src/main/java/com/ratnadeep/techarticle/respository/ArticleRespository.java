package com.ratnadeep.techarticle.respository;

import com.ratnadeep.techarticle.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRespository extends JpaRepository<Article, Integer> {
}
