package com.zensar.service;

import java.util.List;

import com.zensar.dto.StudentDto;
import com.zensar.entity.Student;

public interface StudentService {

	public StudentDto getStudent(int studentId);

	public List<StudentDto> getAllStudents();

	public StudentDto insertStudent(StudentDto student);

	public void updateStudent(int studentId, StudentDto student);

	public void deleteStudent(int studentId);

	List<Student> getByStudentName(String studenName);

	List<Student> getByStudentAge(int studentAge);

	List<Student> getByStudentNameAndStudentAge(String studentName, int studentAge);

}
