package es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("STUDENT") // --> emmagatzema el tipùs de valor a la columna person_type, és a dir, un rol
public class Student extends Person {

    @Column (name = "studentCode")
    private String studentCode;

    public String getStudentCode() {
        return studentCode;
    }
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }


}
