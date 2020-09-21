package miu.edu.comprosystemsoftware.demo.model;

import java.time.LocalDate;
import java.util.Date;

public class Student {
     private String Id;
     private String name;
     private LocalDate enrollementDate;
     private LocalDate graduationDate;

    public Student() {
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getEnrollementDate() {
        return enrollementDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

}
