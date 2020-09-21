package edu.miu.cs544.eaproject.team5.studentmicroservice.serviceImpl;

import edu.miu.cs544.eaproject.team5.studentmicroservice.model.Student;
import edu.miu.cs544.eaproject.team5.studentmicroservice.repository.StudentRepository;
import edu.miu.cs544.eaproject.team5.studentmicroservice.service.CourseService;
import edu.miu.cs544.eaproject.team5.studentmicroservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp  implements StudentService {
     @Autowired
    private StudentRepository studentRepository;
     @Autowired
     private CourseService courseService;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        if( studentRepository.findById(id).isPresent())
        return studentRepository.findById(id).get();
        
         return null;
    }
    
    

    @Override
    public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
    }
}
