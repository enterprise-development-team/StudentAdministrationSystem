package com.studentadministration.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "CourseClass", schema = "stusys", catalog = "")
@IdClass(CourseClassEntityPK.class)
public class CourseClassEntity {
    private int courseNo;
    private int cClassNo;
    private int year;
    private short semester;
    private int capacity;
    private int enrollNumber;
    private String classroom;

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
    @Column(name = "year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Basic
    @Column(name = "semester")
    public short getSemester() {
        return semester;
    }

    public void setSemester(short semester) {
        this.semester = semester;
    }

    @Basic
    @Column(name = "capacity")
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Basic
    @Column(name = "enrollNumber")
    public int getEnrollNumber() {
        return enrollNumber;
    }

    public void setEnrollNumber(int enrollNumber) {
        this.enrollNumber = enrollNumber;
    }

    @Basic
    @Column(name = "classroom")
    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseClassEntity that = (CourseClassEntity) o;

        if (courseNo != that.courseNo) return false;
        if (cClassNo != that.cClassNo) return false;
        if (year != that.year) return false;
        if (semester != that.semester) return false;
        if (capacity != that.capacity) return false;
        if (enrollNumber != that.enrollNumber) return false;
        if (classroom != null ? !classroom.equals(that.classroom) : that.classroom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseNo;
        result = 31 * result + cClassNo;
        result = 31 * result + year;
        result = 31 * result + (int) semester;
        result = 31 * result + capacity;
        result = 31 * result + enrollNumber;
        result = 31 * result + (classroom != null ? classroom.hashCode() : 0);
        return result;
    }
}
