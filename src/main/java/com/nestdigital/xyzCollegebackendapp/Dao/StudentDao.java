package com.nestdigital.xyzCollegebackendapp.Dao;

import com.nestdigital.xyzCollegebackendapp.Model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
}
