package edu.mum.se.datapersistencejpa.studentmgmtapp.model;

import javax.persistence.*;

@Entity
@Table(name ="Transcripts")
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transcriptId;
    private String degreeTitle;

    @OneToOne(mappedBy = "transcript")
    private Student student;

    public Transcript(String degreeTitle){
        this.degreeTitle = degreeTitle;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "transcriptId=" + transcriptId +
                ", degreeTitle='" + degreeTitle + '\'' +
                '}';
    }
}
