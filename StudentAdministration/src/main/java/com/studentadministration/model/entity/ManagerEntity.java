package com.studentadministration.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Manager", schema = "stusys", catalog = "")
public class ManagerEntity {
    private int id;
    private int password;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "password")
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManagerEntity that = (ManagerEntity) o;

        if (id != that.id) return false;
        if (password != that.password) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + password;
        return result;
    }
}
