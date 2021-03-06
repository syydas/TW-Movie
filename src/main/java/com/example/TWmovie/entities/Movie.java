package com.example.TWmovie.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("movies")
public class Movie {
    @Id
    private int id;
    private String alt;
    private int year;
    private String title;
    @Column("original_title")
    private double originalTitle;
    private String directors;
    private String casts;
    private String genres;
    private String image;

    public Movie() {
    }

    public Movie(int id, String alt, int year, String title, double originalTitle, String directors, String casts, String genres, String image) {
        this.id = id;
        this.alt = alt;
        this.year = year;
        this.title = title;
        this.originalTitle = originalTitle;
        this.directors = directors;
        this.casts = casts;
        this.genres = genres;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(double originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getCasts() {
        return casts;
    }

    public void setCasts(String casts) {
        this.casts = casts;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
