package com.ratnadeep.techarticle.resource;

import com.ratnadeep.techarticle.model.Article;
import com.ratnadeep.techarticle.respository.ArticleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/article")
public class ArticleResource {

    @Autowired
    private ArticleRespository articleRespository;

    @GetMapping
    public List<Article> getAll() {
        return articleRespository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Article> getSingleArticle(@PathVariable final Integer id) {
        return articleRespository.findById(id);
    }

    @PostMapping
    public Article addArticle(@RequestBody final Article article) {
        articleRespository.save(article);
        return article;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Article updateArticle(@RequestBody final Article article) {
        articleRespository.save(article);
        return article;
    }

    @DeleteMapping("/{id}")
    public String deleteArticle(@PathVariable final Integer id) {
        articleRespository.deleteById(id);
        return "Deleted";
    }

}
