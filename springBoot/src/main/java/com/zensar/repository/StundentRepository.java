package com.zensar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.entity.Student;

public interface StundentRepository extends JpaRepository<Student, Integer> {
	@Query("from Student s where s.studentName=:name")
	List<Student> getByStudentName(@Param(value = "name") String studenName);

	@Query("from Student s where s.studentAge=:age")
	List<Student> getByStudentAge(@Param(value = "age") int studentAge);

	@Query("from Student s where s.studentName=:name and studentAge=:age")
	List<Student> getByStudentNameAndStudentAge(@Param(value = "name") String studentName,
			@Param(value = "age") int studentAge);
}
