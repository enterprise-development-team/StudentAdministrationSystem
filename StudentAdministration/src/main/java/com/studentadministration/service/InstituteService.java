package com.studentadministration.service;

import com.studentadministration.model.entity.InstituteEntity;
import java.util.List;

public interface InstituteService {
    public void addInstitute(InstituteEntity instituteEntity);

    public void updateInstitute(InstituteEntity instituteEntity);

    public List<InstituteEntity> listInstitute();

    public InstituteEntity getInstituteById(int id);

    public void removeInstitute(int id);
}
