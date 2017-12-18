package com.yourname.demo.dao;

import com.yourname.demo.model.Student;
import java.util.List;
import java.util.UUID;

public interface StudentDao {

  int insertNewStudent(UUID studentId, Student student);

  Student selectStudentById(UUID studentId);

  List<Student> selectAllStudents();

  int updateStudentById(UUID studentId, Student studentUpdate);

  int deleteStudentById(UUID studentId);
}
