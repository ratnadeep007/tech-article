package com.ratnadeep.techarticle.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authors", catalog = "techarticle")
public @Data
class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "username")
    private String userName;

    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("author")
//    @JoinColumn(name = "author_id", referencedColumnName = "author_id")
    private List<Article> articles = new ArrayList<>();

}
