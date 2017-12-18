package com.yourname.demo.dao;

import com.yourname.demo.model.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository("fakeDao")
public class FakeStudentDaoImpl implements StudentDao {

  private final Map<UUID, Student> database;

  public FakeStudentDaoImpl() {
    database = new HashMap<>();
    UUID studentId = UUID.randomUUID();
    database.put(
        studentId,
        new Student(studentId, 14, "Alex", "Montana", "Computer Science")
    );
  }

  @Override
  public int insertNewStudent(UUID studentId, Student student) {
    database.put(studentId, student);
    return 1;
  }

  @Override
  public Student selectStudentById(UUID studentId) {
    return database.get(studentId);
  }

  @Override
  public List<Student> selectAllStudents() {
    return new ArrayList<>(database.values());
  }

  @Override
  public int updateStudentById(UUID studentId, Student studentUpdate) {
    database.put(studentId, studentUpdate);
    return 1;
  }

  @Override
  public int deleteStudentById(UUID studentId) {
    database.remove(studentId);
    return 1;
  }
}
