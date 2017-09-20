package com.mickzeller.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
public class Award
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String year;
    private String actress;
    private String movie;


    public Award()
    {
    }

    public void setActress(String actress)
    {
        this.actress = actress;
    }

    public void setMovie(String movie)
    {
        this.movie = movie;
    }

    public void setYear(String year)
    {
        this.year = year;
    }

    public String getYear()
    {
        return year;
    }

    public String getActress()
    {
        return actress;
    }

    public String getMovie()
    {
        return movie;
    }
}
