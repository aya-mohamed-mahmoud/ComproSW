package miu.edu.comproTM.controller;

import java.util.ArrayList;
import java.util.List;

import miu.edu.comproTM.model.InstructorStudent;
import miu.edu.comproTM.model.SessionAttendance;
import miu.edu.comproTM.model.TmInstructor;
import miu.edu.comproTM.model.helpers.InstructorStudentViewModel;
import miu.edu.comproTM.model.helpers.InstructorViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import miu.edu.comproTM.model.helpers.StudentViewModel;
import miu.edu.comproTM.service.TmInstructorServiceImp;

@RestController
@RequestMapping("/instructor")
public class TmInstructorController {

    @Autowired
    private TmInstructorServiceImp tmInstructorServiceImp;
	
	@PostMapping("/save")
    public Boolean saveInstructor(@RequestBody TmInstructor instructor){
	    return tmInstructorServiceImp.saveTmInstructor(instructor);
    }

    @GetMapping("/list")
    public List<InstructorViewModel> getAllTmInstructors(){
	    return tmInstructorServiceImp.getAllInstructors();
    }


    @DeleteMapping("/delete/{id}")
    public Boolean deleteInstructor(@PathVariable int id){
	    return tmInstructorServiceImp.deleteTmInstructor(id);
    }

    @GetMapping("/{instructorId}/students")
    public List<InstructorStudentViewModel> viewAllStudents(@PathVariable int instructorId) {
       return tmInstructorServiceImp.viewAllInstructorStudents(instructorId);
    }

    @PostMapping("/assignStudent")
    public Boolean assignStudent(@RequestBody InstructorStudent student) {
        InstructorStudent instructorStudent = tmInstructorServiceImp.saveInstructorStudent(student);
        return instructorStudent!=null ? true : false;
    }

    @PostMapping("/removeStudent")
    public Boolean removeStudent(@RequestParam InstructorStudent student) {
      return  tmInstructorServiceImp.deleteInstructorStudent(student.getId());
    }

    @PostMapping("/saveAppointment")
    public Boolean setupAppointment(@RequestBody SessionAttendance sessionAttendance) {
        SessionAttendance appointment =  tmInstructorServiceImp.saveSessionAttendance(sessionAttendance);
        return appointment!=null ? true : false;
    }

    @PostMapping("/takeDailyAttendance")
    public Boolean updateAppointment(@RequestBody SessionAttendance sessionAttendance) {
        SessionAttendance appointment =  tmInstructorServiceImp.saveSessionAttendance(sessionAttendance);
        return appointment!=null ? true : false;
    }

    @GetMapping("/allAppointments")
    public List<SessionAttendance> getAllAppointments(){
	    return tmInstructorServiceImp.getSessionAttendances();
    }

    @GetMapping("/appointments/{instructorId}")
    public List<SessionAttendance> getAllAppointments(@PathVariable int instructorId){
        return tmInstructorServiceImp.getSessionAttendancesByInstructor(instructorId);
    }

}
