package com.studentadministration.service;

import com.studentadministration.model.entity.ClassEntity;
import java.util.List;

public interface ClassService {
    public void addClass(ClassEntity classEntity);

    public void updateClass(ClassEntity classEntity);

    public List<ClassEntity> listClass();

    public ClassEntity getClassById(int id);

    public void removeClass(int id);
}
