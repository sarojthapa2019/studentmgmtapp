package edu.mum.se.datapersistencejpa.studentmgmtapp.repository;

import edu.mum.se.datapersistencejpa.studentmgmtapp.model.Transcript;
import org.springframework.data.repository.CrudRepository;

public interface TranscriptRepository extends CrudRepository<Transcript, Long> {
}
