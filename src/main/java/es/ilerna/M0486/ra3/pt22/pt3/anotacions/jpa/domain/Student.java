package es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Student extends Person {

    @Column
    private String studentCode;


    public String getStudentCode() {
        return studentCode;
    }
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
