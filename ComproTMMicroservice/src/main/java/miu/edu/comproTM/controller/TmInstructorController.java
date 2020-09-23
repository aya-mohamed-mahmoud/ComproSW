package miu.edu.comproTM.controller;

import java.util.List;

import miu.edu.comproTM.model.InstructorStudent;
import miu.edu.comproTM.model.SessionAttendance;
import miu.edu.comproTM.model.TmInstructor;
import miu.edu.comproTM.model.helpers.InstructorStudentViewModel;
import miu.edu.comproTM.model.helpers.InstructorViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import miu.edu.comproTM.service.TmInstructorServiceImp;

@RestController
@RequestMapping("/tm/")
public class TmInstructorController {

    @Autowired
    private TmInstructorServiceImp tmInstructorServiceImp;
	
	@PostMapping("instructor/save")
    public Boolean saveInstructor(@RequestBody TmInstructor instructor){
	    return tmInstructorServiceImp.saveTmInstructor(instructor);
    }

    @GetMapping("instructor/list")
    public List<InstructorViewModel> getAllTmInstructors(){
	    List<InstructorViewModel> list = tmInstructorServiceImp.getAllInstructors();
	    return list;
    }


    @DeleteMapping("instructor/delete/{id}")
    public Boolean deleteInstructor(@PathVariable int id){
	    return tmInstructorServiceImp.deleteTmInstructor(id);
    }

    @GetMapping("instructor/{instructorId}/students")
    public List<InstructorStudentViewModel> viewAllStudents(@PathVariable int instructorId) {
	    List<InstructorStudentViewModel> list = tmInstructorServiceImp.viewAllInstructorStudents(instructorId);
        return list;
    }

    @PostMapping("instructor/assignStudent")
    public Boolean assignStudent(@RequestBody InstructorStudent student) {
        InstructorStudent instructorStudent = tmInstructorServiceImp.saveInstructorStudent(student);
        return instructorStudent!=null ? true : false;
    }

    @PostMapping("instructor/removeStudent")
    public Boolean removeStudent(@RequestParam InstructorStudent student) {
      return  tmInstructorServiceImp.deleteInstructorStudent(student.getId());
    }

    @PostMapping("session/saveAppointment")
    public Boolean setupAppointment(@RequestBody SessionAttendance session) {
        SessionAttendance appointment =  tmInstructorServiceImp.saveSessionAttendance(session);
        return appointment!=null ? true : false;
    }

    @PostMapping("session/takeDailyAttendance")
    public Boolean updateAppointment(@RequestBody SessionAttendance sessionAttendance) {
        return tmInstructorServiceImp.updateSessionAttendance(sessionAttendance);
    }

    @GetMapping("session/allAppointments")
    public List<SessionAttendance> getAllAppointments(){
	    return tmInstructorServiceImp.getSessionAttendances();
    }

    @GetMapping("session/appointments/{instructorId}")
    public List<SessionAttendance> getAllAppointmentsByInstructor(@PathVariable int instructorId){
        return tmInstructorServiceImp.getSessionAttendancesByInstructor(instructorId);
    }

}
