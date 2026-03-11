package com.klef.fsad.exam;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="movie")
public class Movie 
{
    @Id
    private int id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String status;

    private String language;

    public Movie() {}

    public Movie(int id, String name, Date date, String status, String language) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.status = status;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}