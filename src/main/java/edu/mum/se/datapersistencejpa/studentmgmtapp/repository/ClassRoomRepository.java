package edu.mum.se.datapersistencejpa.studentmgmtapp.repository;

import edu.mum.se.datapersistencejpa.studentmgmtapp.model.ClassRoom;
import org.springframework.data.repository.CrudRepository;

public interface ClassRoomRepository extends CrudRepository<ClassRoom, Long> {
}
