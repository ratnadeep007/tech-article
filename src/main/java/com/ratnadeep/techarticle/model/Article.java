package com.ratnadeep.techarticle.model;

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

}