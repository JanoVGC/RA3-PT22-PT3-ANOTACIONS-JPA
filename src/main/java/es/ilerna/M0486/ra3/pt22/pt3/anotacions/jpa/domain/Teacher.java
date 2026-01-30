package es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("TEACHER")
public class Teacher extends Person{

    private String teacherCode;


    public String getTeacherCode() {
        return getTeacherCode();
    }
    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }
}


