package com.studentadministration.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Manager", schema = "stusys", catalog = "")
public class ManagerEntity {
    private String id;
    private String password;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
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
        int result = Integer.parseInt(id);
        result = 31 * result + Integer.parseInt(password);
        return result;
    }
}
