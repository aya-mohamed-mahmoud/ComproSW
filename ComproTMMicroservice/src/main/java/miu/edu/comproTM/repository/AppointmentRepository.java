package miu.edu.comproTM.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import miu.edu.comproTM.model.Appointment;
import miu.edu.comproTM.model.SessionAttendance;
import miu.edu.comproTM.model.Student;

public interface AppointmentRepository extends CrudRepository<Appointment,Integer> {
	public List<Student>  setupAppointment();

}
