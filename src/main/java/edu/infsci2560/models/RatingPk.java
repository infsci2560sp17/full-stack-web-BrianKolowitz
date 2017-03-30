/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author kolobj
 */
@Embeddable
public class RatingPk implements Serializable {
    // http://www.thejavageek.com/2014/05/01/jpa-embeddedid-example/
    
    private Long dvdId;
    private Long customerId;
    
    public RatingPk() {
        
    }
    
    public RatingPk(Long dvdId, Long customerId) {
        this.dvdId = dvdId;
        this.customerId = customerId;   
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
                return true;
        if (obj == null)
                return false;
        if (getClass() != obj.getClass())
                return false;
        RatingPk other = (RatingPk) obj;
        if ( !Objects.equals(other.dvdId, dvdId) )
            return false;

        return Objects.equals(other.getCustomerId(), getCustomerId());

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.getDvdId());
        hash = 29 * hash + Objects.hashCode(this.getCustomerId());
        return hash;
    }

    /**
     * @return the dvdId
     */
    public Long getDvdId() {
        return dvdId;
    }

    /**
     * @param dvdId the dvdId to set
     */
    public void setDvdId(Long dvdId) {
        this.dvdId = dvdId;
    }

    /**
     * @return the customerId
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    
}
