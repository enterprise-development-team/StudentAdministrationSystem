package com.studentadministration.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class EnrollEntityPK implements Serializable {
    private int studentNo;
    private int courseNo;
    private int cClassNo;

    @Column(name = "studentNo")
    @Id
    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    @Column(name = "courseNo")
    @Id
    public int getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    @Column(name = "cClassNo")
    @Id
    public int getcClassNo() {
        return cClassNo;
    }

    public void setcClassNo(int cClassNo) {
        this.cClassNo = cClassNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnrollEntityPK that = (EnrollEntityPK) o;

        if (studentNo != that.studentNo) return false;
        if (courseNo != that.courseNo) return false;
        if (cClassNo != that.cClassNo) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentNo;
        result = 31 * result + courseNo;
        result = 31 * result + cClassNo;
        return result;
    }
}
