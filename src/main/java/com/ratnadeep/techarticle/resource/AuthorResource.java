package com.ratnadeep.techarticle.resource;

import com.ratnadeep.techarticle.model.Author;
import com.ratnadeep.techarticle.respository.AuthorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorResource {

    @Autowired
    private AuthorRespository authorRespository;

    @GetMapping("/user/{username}")
    public Author getAuthor(@PathVariable final String username) {
        return authorRespository.findByUserName(username);
    }

    @GetMapping("/{id}")
    public Optional<Author> getAuthorById(@PathVariable final Integer id) {
        return authorRespository.findById(id);
    }

    @PostMapping
    public Author addAuthor(@RequestBody final Author author) {
        authorRespository.save(author);
        return author;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Author updateAuthor(@PathVariable final Author author) {
        authorRespository.save(author);
        return author;
    }

    @DeleteMapping("/{id}")
    public String deleteAuthorById(@PathVariable final Integer id) {
        authorRespository.deleteById(id);
        return "Deleted";
    }
}
