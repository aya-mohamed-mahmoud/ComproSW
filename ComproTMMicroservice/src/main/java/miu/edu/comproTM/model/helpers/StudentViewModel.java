package miu.edu.comproTM.model.helpers;


import java.util.Date;

public class StudentViewModel {

    private int id;

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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    private String name;
    private String studentId;
    private Date enrollmentDate;
    private Date graduationDate;
    private Double GPA;

    public StudentViewModel(int id, String name, String studentId, Date enrollmentDate, Date graduationDate, Double GPA) {
        this.id = id;
        this.name = name;
        this.studentId = studentId;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.GPA = GPA;
    }

    public StudentViewModel() {

    }
}