package com.ticketing.bs.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "movie")
public class Movie {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String movieName;
    private Long movieLength;
    private String movieLanguage;
}