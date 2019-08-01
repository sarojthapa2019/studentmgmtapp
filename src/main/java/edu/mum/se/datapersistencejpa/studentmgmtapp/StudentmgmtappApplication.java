package edu.mum.se.datapersistencejpa.studentmgmtapp;

import edu.mum.se.datapersistencejpa.studentmgmtapp.model.ClassRoom;
import edu.mum.se.datapersistencejpa.studentmgmtapp.model.Student;
import edu.mum.se.datapersistencejpa.studentmgmtapp.model.Transcript;
import edu.mum.se.datapersistencejpa.studentmgmtapp.repository.ClassRoomRepository;
import edu.mum.se.datapersistencejpa.studentmgmtapp.repository.StudentRepository;
import edu.mum.se.datapersistencejpa.studentmgmtapp.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentmgmtappApplication implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TranscriptRepository transcriptRepository;
    @Autowired
    private ClassRoomRepository classRoomRepository;
    public static void main(String[] args) {
        SpringApplication.run(StudentmgmtappApplication.class, args);
    }
    public Student saveStudent(Student s){

        return this.studentRepository.save(s);
    }
    public Transcript saveTranscript(Transcript t){
        return this.transcriptRepository.save(t);
    }

    public ClassRoom saveClassRoom(ClassRoom c){
        return this.classRoomRepository.save(c);
    }
    @Override
    public void run(String... args) throws Exception {
        Student student = new Student("000-61-0001","Anna","Lynn",
                "Smith", 3.45, LocalDate.of(2019,5,24));
        System.out.println(student);


        Transcript transcript = new Transcript("BS Computer Science");
        ClassRoom classRoom = new ClassRoom("McLaughlin building","M105");
        classRoom.addStudent(student);
        student.setTranscript(transcript);
        //saving classroom object performs saving of the student and transcript object
        //saving classroom object performs saving of the student and transcript object
//        saveStudent(student);
//        saveTranscript(transcript);
        saveClassRoom(classRoom);
        System.out.println(student + "\n " + transcript + "\n " + classRoom);
    }
}
