package com.zensar.controller;

import java.util.ArrayList;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.StudentDto;
import com.zensar.entity.ErrorResponse;
import com.zensar.entity.Student;
import com.zensar.exceptions.NoSuchStudentExistsException;
import com.zensar.exceptions.StudentAlreadyExistException;
import com.zensar.service.StudentService;

@RestController
@RequestMapping(value = "/student-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class StudentController {
	@Autowired
	private StudentService studentService;

	@ExceptionHandler(value = StudentAlreadyExistException.class)

	@ResponseStatus(HttpStatus.CONFLICT)
	public ErrorResponse handleStudentAlreadyExistsException(StudentAlreadyExistException ex) {
		return new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
	}

	@ExceptionHandler(value = NoSuchStudentExistsException.class)

	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorResponse handleNoSuchCouponExistsException(NoSuchStudentExistsException ex) {
		return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
	}

	// @RequestMapping("/student/{studentId}")
	@GetMapping(value = "/students/{studentId}")
	public ResponseEntity<StudentDto> getStudent(@PathVariable("studentId") int studentId) {
		return new ResponseEntity(studentService.getStudent(studentId), HttpStatus.OK);
	}

	// http://localhost:8181/students - Read
	// @RequestMapping(value={"/students","/listOfStudents"},method=RequestMethod.GET)
	@GetMapping("/students")
	public ResponseEntity<List<StudentDto>> getAllStudents() {
		return new ResponseEntity<List<StudentDto>>(studentService.getAllStudents(), HttpStatus.OK);
	}

	// @RequestMapping(value="/students",method = RequestMethod.POST)
	@PostMapping(value = "/students")
	public ResponseEntity<StudentDto> insertStudents(@RequestBody StudentDto studentDto) {
		return new ResponseEntity(studentService.insertStudent(studentDto), HttpStatus.CREATED);
	}

	// http:localhost:818/students - Delete
	// @RequestMapping(value="/students/{studentId}",method=RequestMethod.DELETE)
	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<String> deleteStudent(@PathVariable("studentId") int studentId,
			@RequestBody Student student) {
		studentService.deleteStudent(studentId);
		return new ResponseEntity<String>("Student Deleted Successfullyy..!!", HttpStatus.OK);
	}

	// http://localhost:8181/students - Update
	// @RequestMapping(value="/students/{studentId}",method=RequestMethod.PUT)
	@PutMapping("/students/{studentId}")
	public ResponseEntity<String> updateStudent(@PathVariable("studentId") int studentId,
			@RequestBody StudentDto studentDto) {
		studentService.updateStudent(studentId, studentDto);
		return new ResponseEntity<String>("StudentUpdated SuccessFully..!!!", HttpStatus.OK);
	}

	@GetMapping("/students/name/{studentName}")
	public List<Student> getByStudentName(@PathVariable("studentName") String studenName) {
		return studentService.getByStudentName(studenName);
	}

	@GetMapping("/students/age/{studentAge}")
	public List<Student> getByStudentAge(@PathVariable("studentAge") int studentAge) {
		return studentService.getByStudentAge(studentAge);
	}

	@GetMapping("/students/{studentName}/{studentAge}")
	public List<Student> getByStudentNameAndStudentAge(@PathVariable("studentName") String studentName,
			@PathVariable("studentAge") int studentAge) {
		return studentService.getByStudentNameAndStudentAge(studentName, studentAge);
	}
	
	

}
