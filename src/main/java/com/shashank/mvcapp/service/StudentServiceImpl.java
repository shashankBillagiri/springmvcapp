package com.shashank.mvcapp.service;

import com.shashank.mvcapp.dao.StudentDAO;
import com.shashank.mvcapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements  StudentService{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public void save(Student student) {
        studentDAO.save(student);
    }

}
