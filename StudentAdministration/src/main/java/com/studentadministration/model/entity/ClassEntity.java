package com.studentadministration.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Class", schema = "stusys", catalog = "")
public class ClassEntity {
    private int classNo;
    private String className;
    private int grade;

    @Id
    @Column(name = "classNo")
    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    @Basic
    @Column(name = "className")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "grade")
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassEntity that = (ClassEntity) o;

        if (classNo != that.classNo) return false;
        if (grade != that.grade) return false;
        if (className != null ? !className.equals(that.className) : that.className != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classNo;
        result = 31 * result + (className != null ? className.hashCode() : 0);
        result = 31 * result + grade;
        return result;
    }
}
