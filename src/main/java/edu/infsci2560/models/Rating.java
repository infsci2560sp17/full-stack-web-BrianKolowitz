/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author kolobj
 */
@Entity
public class Rating {
    
    @EmbeddedId
    private RatingPk ratingPk;
        
    private int stars;
    
    public Rating() {
        
    }
    
    public Rating(RatingPk ratingPk, int stars) {
        this.ratingPk = ratingPk;
        this.stars = stars;
    }

    /**
     * @return the id
     */
    public RatingPk getRatingPk() {
        return ratingPk;
    }

    /**
     * @param ratingPk the id to set
     */
    public void setRatingPk(RatingPk ratingPk) {
        this.ratingPk = ratingPk;
    }

    /**
     * @return the stars
     */
    public int getStars() {
        return stars;
    }

    /**
     * @param stars the stars to set
     */
    public void setStars(int stars) {
        this.stars = stars;
    }
    
}
