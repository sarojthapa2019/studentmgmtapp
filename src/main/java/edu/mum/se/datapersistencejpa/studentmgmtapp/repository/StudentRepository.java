package edu.mum.se.datapersistencejpa.studentmgmtapp.repository;

import edu.mum.se.datapersistencejpa.studentmgmtapp.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
