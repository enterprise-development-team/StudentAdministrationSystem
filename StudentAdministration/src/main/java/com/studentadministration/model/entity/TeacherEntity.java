package com.studentadministration.model.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Teacher", schema = "stusys", catalog = "")
public class TeacherEntity {
    private int teacherNo;
    private String teacherName;
    private Timestamp hireDate;

    @Id
    @Column(name = "teacherNo")
    public int getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(int teacherNo) {
        this.teacherNo = teacherNo;
    }

    @Basic
    @Column(name = "teacherName")
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Basic
    @Column(name = "hireDate")
    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherEntity that = (TeacherEntity) o;

        if (teacherNo != that.teacherNo) return false;
        if (teacherName != null ? !teacherName.equals(that.teacherName) : that.teacherName != null) return false;
        if (hireDate != null ? !hireDate.equals(that.hireDate) : that.hireDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teacherNo;
        result = 31 * result + (teacherName != null ? teacherName.hashCode() : 0);
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        return result;
    }
}
