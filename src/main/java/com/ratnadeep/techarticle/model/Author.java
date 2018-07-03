package com.ratnadeep.techarticle.model;

import lombok.Data;

import javax.persistence.*;

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

}
