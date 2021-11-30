package co.edu.unbosque.moviestutorial.resources.pojos;

import co.edu.unbosque.moviestutorial.jpa.entities.Cast;

import java.util.List;

public class MoviePOJO {

    private Integer movieId;

    private String title;

    private Integer year;

    private Integer time;

    private String lang;

    private  String country;

    private List<Cast> casts;

    public MoviePOJO() {
    }

    public MoviePOJO(Integer movieId, String title, Integer year, Integer time, String lang, String country) {
        this.movieId = movieId;
        this.title = title;
        this.year = year;
        this.time = time;
        this.lang = lang;
        this.country = country;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
