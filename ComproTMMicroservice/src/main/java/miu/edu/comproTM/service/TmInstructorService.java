package miu.edu.comproTM.service;

import miu.edu.comproTM.model.InstructorStudent;
import miu.edu.comproTM.model.SessionAttendance;
import miu.edu.comproTM.model.TmInstructor;
import miu.edu.comproTM.model.helpers.InstructorStudentViewModel;
import miu.edu.comproTM.model.helpers.InstructorViewModel;

import java.util.List;

public interface TmInstructorService {
	
   //Instructor related
   public List<InstructorViewModel> getAllInstructors();
   public TmInstructor getTmInstructor(int id);
   public Boolean saveTmInstructor(TmInstructor instructor);
   public Boolean updateTmInstructor(TmInstructor instructor);
   public Boolean deleteTmInstructor(int id);
   
   //Instructor Students
   public List<InstructorStudentViewModel> viewAllInstructorStudents(Integer InstructorId);
   public List<TmInstructor> viewAllStudents();
   
   public InstructorStudent saveInstructorStudent(InstructorStudent instructorStudent);
   public Boolean deleteInstructorStudent(int id);
   
   //
   public List<SessionAttendance> getSessionAttendances();
   public List<SessionAttendance> getSessionAttendancesByInstructor(int instructorId);
   public SessionAttendance saveSessionAttendance(SessionAttendance sessionAttendance);
   public Boolean updateSessionAttendance(SessionAttendance sessionAttendance); 
   public Boolean deleteSessionAttendance(Integer id);

}
