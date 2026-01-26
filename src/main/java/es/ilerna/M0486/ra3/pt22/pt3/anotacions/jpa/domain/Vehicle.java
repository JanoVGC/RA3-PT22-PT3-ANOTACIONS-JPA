package es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public abstract class Vehicle {


    @Id
    @GeneratedValue
    private Integer id;


    @Column(length = 100)
    private String brand;

    @Column(length = 100)
    private Integer year;

    @Column(length = 100)
    private float price;


    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public void SetPerson(Person person) {
        this.person = person;
    }
}
