package miu.edu.comproTM.model.helpers;

import miu.edu.comproTM.model.TmInstructor;

import java.time.LocalDate;

public class InstructorViewModel {
    private int id;
    private String name;
    private String responsibiltyDesc;
    private String officeID;
    private LocalDate hiringDate;

    public InstructorViewModel(int id, String name, String responsibiltyDesc, String officeID, LocalDate hiringDate) {
        this.id = id;
        this.name = name;
        this.responsibiltyDesc = responsibiltyDesc;
        this.officeID = officeID;
        this.hiringDate = hiringDate;
    }

    public InstructorViewModel(TmInstructor instructor) {
        this.id = instructor.getId();
        this.name = instructor.getName();
        this.responsibiltyDesc = instructor.getResponsibiltyDesc();
        this.officeID = instructor.getOfficeID();
        this.hiringDate = instructor.getHiringDate();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponsibiltyDesc() {
        return responsibiltyDesc;
    }

    public void setResponsibiltyDesc(String responsibiltyDesc) {
        this.responsibiltyDesc = responsibiltyDesc;
    }

    public String getOfficeID() {
        return officeID;
    }

    public void setOfficeID(String officeID) {
        this.officeID = officeID;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }
}
