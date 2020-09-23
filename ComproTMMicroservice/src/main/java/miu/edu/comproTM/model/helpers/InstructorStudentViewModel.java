package miu.edu.comproTM.model.helpers;

import miu.edu.comproTM.model.InstructorStudent;
import miu.edu.comproTM.model.TmInstructor;

public class InstructorStudentViewModel {
    private Integer id;
    private Integer StudentId;
    private Integer InstructorId;
    private InstructorViewModel instructor;
    private StudentViewModel student;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public Integer getInstructorId() {
        return InstructorId;
    }

    public void setInstructorId(Integer instructorId) {
        InstructorId = instructorId;
    }

    public InstructorStudentViewModel(Integer id, Integer studentId, Integer instructorId, StudentViewModel student , InstructorViewModel instructor) {
        this.id = id;
        StudentId = studentId;
        InstructorId = instructorId;
        this.instructor = instructor;
        this.student = student;
    }

    public InstructorStudentViewModel(InstructorStudent instructorStudent, TmInstructor instructor , StudentViewModel student) {
        this.id = instructorStudent.getId();
        StudentId = instructorStudent.getStudentId();
        InstructorId = instructorStudent.getInstructor().getId();
        this.instructor = new InstructorViewModel(instructor);
        this.student = student;

    }

    public InstructorViewModel getInstructor() {
        return instructor;
    }

    public void setInstructor(InstructorViewModel instructor) {
        this.instructor = instructor;
    }

    public StudentViewModel getStudent() {
        return student;
    }

    public void setStudent(StudentViewModel student) {
        this.student = student;
    }
}
