package com.studentadministration.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Enroll", schema = "stusys", catalog = "")
@IdClass(EnrollEntityPK.class)
public class EnrollEntity {
    private int studentNo;
    private int courseNo;
    private int cClassNo;
    private Short score;
    private Timestamp recordDate;

    @Id
    @Column(name = "studentNo")
    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    @Id
    @Column(name = "courseNo")
    public int getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    @Id
    @Column(name = "cClassNo")
    public int getcClassNo() {
        return cClassNo;
    }

    public void setcClassNo(int cClassNo) {
        this.cClassNo = cClassNo;
    }

    @Basic
    @Column(name = "score")
    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    @Basic
    @Column(name = "recordDate")
    public Timestamp getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Timestamp recordDate) {
        this.recordDate = recordDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnrollEntity that = (EnrollEntity) o;

        if (studentNo != that.studentNo) return false;
        if (courseNo != that.courseNo) return false;
        if (cClassNo != that.cClassNo) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (recordDate != null ? !recordDate.equals(that.recordDate) : that.recordDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentNo;
        result = 31 * result + courseNo;
        result = 31 * result + cClassNo;
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (recordDate != null ? recordDate.hashCode() : 0);
        return result;
    }
}
