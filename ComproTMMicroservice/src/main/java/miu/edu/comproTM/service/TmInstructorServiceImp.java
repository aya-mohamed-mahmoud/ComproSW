package miu.edu.comproTM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miu.edu.comproTM.model.Student;
import miu.edu.comproTM.model.TMRecord;
import miu.edu.comproTM.model.TmInstructor;
import miu.edu.comproTM.repository.SessionAttendanceRepository;
import miu.edu.comproTM.repository.StudentRepository;
import miu.edu.comproTM.repository.TmInstructorRepository;

@Service
public class TmInstructorServiceImp implements TmInstructorService {
	
	@Autowired
	private TmInstructorRepository tmInstructorRepository;
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private SessionAttendanceRepository sessionAttendanceRepository;

	@Override
	public List <Student> viewAllStudents() {
		List<Student> s1 = sessionAttendanceRepository.getStudent();
		return s1;		
				 
		}
	public List<Student> assiggnStudent(List<Student>students,TmInstructor tmInstructor) {
		for(Student st:students) {
			st.setTmInstructor(tmInstructor);
			studentRepository.save(st);
		}
		return  students;
	}
///apointment
	public List<Student> setupAppointment(){
		//List<Student> s2 = appointmentRepository.
		return null;
	}
	
   
}
