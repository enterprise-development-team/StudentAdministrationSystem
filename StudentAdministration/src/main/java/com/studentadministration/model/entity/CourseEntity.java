package com.studentadministration.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Course", schema = "stusys", catalog = "")
public class CourseEntity {
    private int courseNo;
    private String courseName;
    private short creditHour;
    private short courseHour;

    @Id
    @Column(name = "courseNo")
    public int getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    @Basic
    @Column(name = "courseName")
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Basic
    @Column(name = "creditHour")
    public short getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(short creditHour) {
        this.creditHour = creditHour;
    }

    @Basic
    @Column(name = "courseHour")
    public short getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(short courseHour) {
        this.courseHour = courseHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseEntity that = (CourseEntity) o;

        if (courseNo != that.courseNo) return false;
        if (creditHour != that.creditHour) return false;
        if (courseHour != that.courseHour) return false;
        if (courseName != null ? !courseName.equals(that.courseName) : that.courseName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseNo;
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        result = 31 * result + (int) creditHour;
        result = 31 * result + (int) courseHour;
        return result;
    }
}
