package com.student.service;

import java.util.List;
import java.util.Optional;

import com.student.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Optional<Student> getStudentById(Long id);
	Student createStudent(Student student);
	Student updateStudent(Long id, Student updatedStudent);
	void deleteStudent(Long id);
}
