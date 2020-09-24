package miu.edu.comproTM.configuration;

import miu.edu.comproTM.repository.TmInstructorRepository;
import miu.edu.comproTM.service.TmInstructorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializeData implements CommandLineRunner {

    @Autowired
    TmInstructorServiceImp tmService;

    @Autowired
    TmInstructorRepository tmInstructorRepository;

    @Override
    public void run(String... args) throws Exception {
//        tmInstructorRepository.deleteAll();
//        TmInstructor instructor = new TmInstructor(0,"Alex","Trains TM","ID0215", LocalDate.now());
//        tmService.saveTmInstructor(instructor);
    }
}
