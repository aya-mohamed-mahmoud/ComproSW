package miu.edu.comproTM;

import miu.edu.comproTM.controller.TmInstructorController;
import miu.edu.comproTM.repository.InstructorStudentRepository;
import miu.edu.comproTM.repository.SessionAttendanceRepository;
import miu.edu.comproTM.repository.TmInstructorRepository;
import miu.edu.comproTM.service.TmInstructorServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TmApplicationTest {

    @Autowired
    private TmInstructorController tmInstructorController;

    @Autowired
    private TmInstructorServiceImp tmInstructorServiceImp;

    @Autowired
    private TmInstructorRepository tmInstructorRepository;

    @Autowired
    private SessionAttendanceRepository sessionAttendanceRepository;

    @Autowired
    private InstructorStudentRepository instructorStudentRepository;


    //Tests if the repositories services and controller are actually loaded
    @Test
    public void contextLoads() throws Exception {
        assertThat(tmInstructorController).isNotNull();
        assertThat(tmInstructorServiceImp).isNotNull();
        assertThat(tmInstructorRepository).isNotNull();
        assertThat(sessionAttendanceRepository).isNotNull();
        assertThat(instructorStudentRepository).isNotNull();
    }

}
