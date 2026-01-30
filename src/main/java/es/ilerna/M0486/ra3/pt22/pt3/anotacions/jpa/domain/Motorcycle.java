package es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Motorcycle extends Vehicle{

    private boolean hasSideCar;
    private String brand;

    private float price;

    public boolean gethasSideCar() {
        return hasSideCar;
    }
    public void sethasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
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
