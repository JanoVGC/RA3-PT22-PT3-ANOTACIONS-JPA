package es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Plane extends Vehicle {


    private Boolean autopilot;
    private Integer tailNumber;
    private String brand;

    private float price;

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
    public Boolean getAutopilot() {
        return autopilot;
    }
    public void setAutopilot(Boolean autopilot) {
        this.autopilot = autopilot;
    }
    public Integer getTailNumber() {
        return tailNumber;
    }
    public void setTailNumber(Integer tailNumber) {
        this.tailNumber = tailNumber;
    }

}
