package com.studentadministration.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Institute", schema = "stusys", catalog = "")
public class InstituteEntity {
    private int instituteNo;
    private String instituteName;

    @Id
    @Column(name = "instituteNo")
    public int getInstituteNo() {
        return instituteNo;
    }

    public void setInstituteNo(int instituteNo) {
        this.instituteNo = instituteNo;
    }

    @Basic
    @Column(name = "instituteName")
    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstituteEntity that = (InstituteEntity) o;

        if (instituteNo != that.instituteNo) return false;
        if (instituteName != null ? !instituteName.equals(that.instituteName) : that.instituteName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = instituteNo;
        result = 31 * result + (instituteName != null ? instituteName.hashCode() : 0);
        return result;
    }
}
