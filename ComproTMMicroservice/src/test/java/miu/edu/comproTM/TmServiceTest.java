package miu.edu.comproTM;

import miu.edu.comproTM.model.SessionAttendance;
import miu.edu.comproTM.model.helpers.InstructorStudentViewModel;
import miu.edu.comproTM.model.helpers.InstructorViewModel;
import miu.edu.comproTM.repository.InstructorStudentRepository;
import miu.edu.comproTM.repository.SessionAttendanceRepository;
import miu.edu.comproTM.repository.TmInstructorRepository;
import miu.edu.comproTM.service.TmInstructorServiceImp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.lenient;

@ExtendWith(MockitoExtension.class)
public class TmServiceTest {

    @Mock
    public TmInstructorRepository tmInstructorRepository;

    @Mock
    public SessionAttendanceRepository sessionAttendanceRepository;

    @Mock
    public InstructorStudentRepository instructorStudentRepository;

    @InjectMocks
    public TmInstructorServiceImp tmInstructorService;

    @Test
    public void getTmInstructors(){
        List<InstructorViewModel> instructors = new ArrayList<>();
        doReturn(instructors).when(tmInstructorRepository).findAll();
        List<InstructorViewModel> actualProducts = tmInstructorService.getAllInstructors();
        assertThat(actualProducts).isEqualTo(instructors);
    }

    @Test
    public void getAllAppointments(){
        List<SessionAttendance> apps = new ArrayList<>();
        doReturn(apps).when(sessionAttendanceRepository).findAll();
        List<SessionAttendance> actualApps = tmInstructorService.getSessionAttendances();
        assertThat(actualApps).isEqualTo(apps);
    }


    @Test
    public void getInstructorStudents(){
        List<InstructorStudentViewModel> instructorStudents = new ArrayList<>();
        lenient().doReturn(instructorStudents).when(instructorStudentRepository).findAll();
        List<InstructorStudentViewModel> actual = tmInstructorService.viewAllInstructorStudents(ArgumentMatchers.anyInt());
        assertThat(actual).isEqualTo(instructorStudents);
    }



}
