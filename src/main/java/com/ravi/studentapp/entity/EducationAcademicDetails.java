package com.ravi.studentapp.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "education_academic_details", schema = "registration")
public class EducationAcademicDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "std_edu_id")
    private Integer stdEduId;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Column(name = "tenth_school_name")
    private String tenthSchoolName;

    @Column(name = "tenth_board_name")
    private String tenthBoardName;

    @Column(name = "tenth_percentage")
    private Double tenthPercentage;

    @Column(name = "twelfth_school_name")
    private String twelfthSchoolName;

    @Column(name = "twelfth_board_name")
    private String twelfthBoardName;

    @Column(name = "twelfth_percentage")
    private Double twelfthPercentage;

    @Column(name = "higher_qualification_name")
    private String higherQualificationName;

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "university_name")
    private String universityName;

    @Column(name = "graduation_percentage")
    private Double graduationPercentage;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    // ===== GETTERS & SETTERS =====

    public Integer getStdEduId() { return stdEduId; }
    public void setStdEduId(Integer stdEduId) { this.stdEduId = stdEduId; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public String getTenthSchoolName() { return tenthSchoolName; }
    public void setTenthSchoolName(String tenthSchoolName) { this.tenthSchoolName = tenthSchoolName; }

    public String getTenthBoardName() { return tenthBoardName; }
    public void setTenthBoardName(String tenthBoardName) { this.tenthBoardName = tenthBoardName; }

    public Double getTenthPercentage() { return tenthPercentage; }
    public void setTenthPercentage(Double tenthPercentage) { this.tenthPercentage = tenthPercentage; }

    public String getTwelfthSchoolName() { return twelfthSchoolName; }
    public void setTwelfthSchoolName(String twelfthSchoolName) { this.twelfthSchoolName = twelfthSchoolName; }

    public String getTwelfthBoardName() { return twelfthBoardName; }
    public void setTwelfthBoardName(String twelfthBoardName) { this.twelfthBoardName = twelfthBoardName; }

    public Double getTwelfthPercentage() { return twelfthPercentage; }
    public void setTwelfthPercentage(Double twelfthPercentage) { this.twelfthPercentage = twelfthPercentage; }

    public String getHigherQualificationName() { return higherQualificationName; }
    public void setHigherQualificationName(String higherQualificationName) { this.higherQualificationName = higherQualificationName; }

    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }

    public String getUniversityName() { return universityName; }
    public void setUniversityName(String universityName) { this.universityName = universityName; }

    public Double getGraduationPercentage() { return graduationPercentage; }
    public void setGraduationPercentage(Double graduationPercentage) { this.graduationPercentage = graduationPercentage; }
}

