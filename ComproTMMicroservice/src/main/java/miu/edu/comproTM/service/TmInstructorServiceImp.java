package miu.edu.comproTM.service;

import miu.edu.comproTM.model.InstructorStudent;
import miu.edu.comproTM.model.SessionAttendance;
import miu.edu.comproTM.model.TmInstructor;
import miu.edu.comproTM.model.helpers.InstructorStudentViewModel;
import miu.edu.comproTM.model.helpers.InstructorViewModel;
import miu.edu.comproTM.model.helpers.StudentViewModel;
import miu.edu.comproTM.repository.InstructorStudentRepository;
import miu.edu.comproTM.repository.SessionAttendanceRepository;
import miu.edu.comproTM.repository.TmInstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TmInstructorServiceImp implements TmInstructorService {
	
	@Autowired
	private TmInstructorRepository tmInstructorRepository;
	@Autowired
	private InstructorStudentRepository instructorStudentRepository;
	@Autowired
	private SessionAttendanceRepository sessionAttendanceRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<InstructorViewModel> getAllInstructors() {
		List<TmInstructor> result = tmInstructorRepository.findAll();
		return result.stream().map(t->{return new InstructorViewModel(t);}).collect(Collectors.toList());
	}

	@Override
	public TmInstructor getTmInstructor(int id) {
		return tmInstructorRepository.findById(id).get();
	}

	@Override
	public Boolean saveTmInstructor(TmInstructor instructor) {
		TmInstructor saved = tmInstructorRepository.save(instructor);

		return saved!=null ? true : false;
}
	@Override
	public Boolean updateTmInstructor(TmInstructor instructor) {
		TmInstructor saved = tmInstructorRepository.save(instructor);
		return saved!=null ? true : false;
	}

	@Override
	public Boolean deleteTmInstructor(int id) {
		tmInstructorRepository.deleteById(id);
		return true;
	}
	@Override
	public List<InstructorStudentViewModel> viewAllInstructorStudents(Integer InstructorId) {

		List<InstructorStudent> students =
				instructorStudentRepository.getInstructorStudentsByInstructor_Id(InstructorId);

		return students.stream().map(t-> {
			//:TODO interface with the microservice, get student by
			//StudentViewModel svm = restTemplate.getForObject("http://student-microservice/student/"+t.studentId,StudentViewModel.class);
			StudentViewModel svm = new StudentViewModel(1,"mock name","mock id",new Date(),new Date(),3.9);
			return new InstructorStudentViewModel(t,t.getInstructor(),svm);
		}).collect(Collectors.toList());



	}
	@Override
	public List<TmInstructor> viewAllStudents() {
		//:TODO get from the other micro service List of all Students
		return null;
	}
	@Override
	public InstructorStudent saveInstructorStudent(InstructorStudent instructorStudent) {
		return instructorStudentRepository.save(instructorStudent);
	}

	@Override
	public Boolean deleteInstructorStudent(int id) {
		instructorStudentRepository.deleteById(id);
		return true;
	}

	@Override
	public List<SessionAttendance> getSessionAttendances() {
		List<SessionAttendance> sessions =  sessionAttendanceRepository.findAll();
		return sessions;
	}

	@Override
	public List<SessionAttendance> getSessionAttendancesByInstructor(int instructorId) {
		List<SessionAttendance> sessions = sessionAttendanceRepository.findAll();
		return sessions.stream().filter(t->t.getInstructorStudent().getInstructor().getId() == instructorId).collect(Collectors.toList());
	}

	@Override
	public SessionAttendance saveSessionAttendance(SessionAttendance sessionAttendance) {
		return sessionAttendanceRepository.save(sessionAttendance);
	}

	@Override
	public Boolean updateSessionAttendance(SessionAttendance sessionAttendance) {
		SessionAttendance st = sessionAttendanceRepository.findById(sessionAttendance.getId()).get();
		if(st!=null){
			st.setDate(sessionAttendance.getDate());
			st.setMeditationAttendance(sessionAttendance.isMeditationAttendance());
			st.setType(sessionAttendance.getType());
			sessionAttendanceRepository.save(st);
		};
		return true;
	}

	@Override
	public Boolean deleteSessionAttendance(Integer id) {
		sessionAttendanceRepository.deleteById(id);
		return true;
	}
   
}
