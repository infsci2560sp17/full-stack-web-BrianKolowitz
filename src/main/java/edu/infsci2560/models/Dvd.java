/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author kolobj
 */
@Entity
public class Dvd {

    private static final long serialVersionUID = 1L;

    public enum WorkoutType {
        Unknown,
        Strength,
        Cardio,
        CrossTrain
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
    protected WorkoutType workoutType;

    public Dvd() {
        this.id = Long.MAX_VALUE;
        this.name = null;
        this.workoutType = WorkoutType.Unknown;
    }

    public Dvd(Long id, String name, WorkoutType workoutType) {
        this.id = id;
        this.name = name;
        this.workoutType = workoutType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", name=" + this.name + ", workoutType=" + this.workoutType + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the workoutType
     */
    public WorkoutType getWorkoutType() {
        return workoutType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setWorkoutType(WorkoutType workoutType) {
        this.workoutType = workoutType;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}
