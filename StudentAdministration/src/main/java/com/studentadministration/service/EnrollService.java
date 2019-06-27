package com.studentadministration.service;

import com.studentadministration.model.entity.EnrollEntity;
import java.util.List;

public interface EnrollService {
    public void addEnroll(EnrollEntity enrollEntity);

    public void updateEnroll(EnrollEntity enrollEntity);

    public List<EnrollEntity> listEnroll();

    public EnrollEntity getEnrollById(int id);

    public void removeEnroll(int id);
}
