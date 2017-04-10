/* Person 1.0 09/04/2017 */
package com.sd.workbox.healthyNation.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * An entity class for persons.
 *
 * @version 1.0 09 April 2017
 *
 * @author Serhiy Dudynsky
 *
 * @since 1.8
 */
@Entity
@Table(indexes = {@Index(columnList = "mail")})
public class Person {

    /**
     * id for database
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * first name of parson
     */
    private String firstName;

    /**
     * last name of parson
     */
    private String lastName;

    /**
     * email of parson
     */
    private String email;

    /**
     * password of parson
     */
    private String password;

    /**
     * User role in system.
     */
    @Enumerated
    private PersonRole role = PersonRole.ROLE_USER;

    /**
     * List of id of persons who is friend of this one.
     */
    private List<Integer> freinds = new ArrayList<>();

    /**
     * List of trainings belonging to this parson.
     */
    @OneToMany(mappedBy = "person")
    private List<Training> myTrainings = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public PersonRole getRole() {
        return role;
    }

    public List<Integer> getFreinds() {
        return freinds;
    }

    public List<Training> getMyTrainings() {
        return myTrainings;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(PersonRole role) {
        this.role = role;
    }

    public void setFreinds(List<Integer> freinds) {
        this.freinds = freinds;
    }

    public void setMyTrainings(List<Training> myTrainings) {
        this.myTrainings = myTrainings;
    }
}
