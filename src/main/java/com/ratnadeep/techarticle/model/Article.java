package com.ratnadeep.techarticle.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "articles", catalog = "techarticle")
public @Data
class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "article_id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "data")
    private String data;
//    @Column(name = "author_id")
//    private Integer authorId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_author")
    @JsonIgnoreProperties("articles")
    private Author author;

}
