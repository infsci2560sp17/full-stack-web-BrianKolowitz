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
    private RatingPk id;
        
    private int stars;
    
    public Rating() {
        
    }
    
    public Rating(RatingPk id, int stars) {
        this.id = id;
        this.stars = stars;
    }

    /**
     * @return the id
     */
    public RatingPk getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(RatingPk id) {
        this.id = id;
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
