package es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain;

import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Car extends Vehicle {
    private Integer doors;
    private Integer seats;
    private String brand;

    private float price;



    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }


}

