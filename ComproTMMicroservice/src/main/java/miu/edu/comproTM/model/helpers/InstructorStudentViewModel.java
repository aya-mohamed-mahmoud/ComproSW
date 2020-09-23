package miu.edu.comproTM.model.helpers;

import miu.edu.comproTM.model.InstructorStudent;

public class InstructorStudentViewModel {
    private Integer id;
    private Integer StudentId;
    private Integer InstructorId;

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

    public InstructorStudentViewModel(Integer id, Integer studentId, Integer instructorId) {
        this.id = id;
        StudentId = studentId;
        InstructorId = instructorId;
    }

    public InstructorStudentViewModel(InstructorStudent instructorStudent) {
        this.id = instructorStudent.getId();
        StudentId = instructorStudent.getStudentId();
        InstructorId = instructorStudent.getInstructor().getId();
    }
}
