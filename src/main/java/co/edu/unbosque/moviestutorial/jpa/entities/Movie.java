package co.edu.unbosque.moviestutorial.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Movie")
public class Movie {

    @Id
    @GeneratedValue
    @Column(name = "movieId")
    private Integer movieId;

    @Column(name = "title", nullable = false, unique = true)
    private String title;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "time", nullable = false)
    private Integer time;

    @Column(name = "lang", nullable = false)
    private String lang;

    @Column(name = "country", nullable = false)
    private String country;

    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Cast> casts = new ArrayList<>();

    public Movie() {
    }

    public Movie(String title, Integer year, Integer time, String lang, String country) {
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
