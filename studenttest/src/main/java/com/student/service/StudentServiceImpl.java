package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.model.Student;
import com.student.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	@Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public Student updateStudent(Long id, Student updatedStudent) {
        updatedStudent.setId(id); // Make sure the ID matches
        return studentRepository.save(updatedStudent);
    }
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
