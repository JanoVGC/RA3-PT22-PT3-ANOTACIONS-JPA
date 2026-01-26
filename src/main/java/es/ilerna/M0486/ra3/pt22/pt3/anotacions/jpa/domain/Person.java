package es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity // classe que forma part de la base de dades
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Person  {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String surname;

    @Column(length = 100)
    private int phoneNumber;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    @OneToMany // Relació 1/N
    // Una persona pot tenir molts vehicles
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        vehicles.getFirst();

    }

    public void removeVehicle (Vehicle vehicle) {
        vehicles.remove(vehicle);
        vehicles.getFirst();
    }

}
