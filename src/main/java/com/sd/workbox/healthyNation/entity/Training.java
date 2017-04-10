package com.sd.workbox.healthyNation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 * An entity class for Training.
 *
 * @version 1.0 10 April 2017
 *
 * @author Serhiy Dudynsky
 *
 * @since 1.8
 */
@Entity
public class Training {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;

    /**
     * Date of the training.
     */
    private LocalDate date;

    /**
     * Start time of the training.
     */
    private LocalTime startTime;

    /**
     * End time of the training.
     */
    private LocalTime endTime;

    private Map<Exercise, Integer> myExercise = new HashMap<>();

}
