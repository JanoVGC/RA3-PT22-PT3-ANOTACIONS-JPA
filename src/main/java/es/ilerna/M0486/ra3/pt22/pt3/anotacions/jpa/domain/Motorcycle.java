package es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Motorcycle extends Vehicle{

    private boolean hasSideCar;
    private String brand;
    private int year;
    private int price;

    public boolean gethasHasSideCar() {
        return hasSideCar;
    }
    public void sethasHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
