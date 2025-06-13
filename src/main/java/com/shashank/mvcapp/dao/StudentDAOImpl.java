package com.shashank.mvcapp.dao;

import com.shashank.mvcapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Student student) {
        String sql = "INSERT INTO student_details (first_name, last_name, gender, email, contact_number, address_line1, address_line2, address_line3, state, zipcode, course, age) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                student.getFirstName(),
                student.getLastName(),
                student.getGender(),
                student.getEmail(),
                student.getContactNumber(),
                student.getAddressLine1(),
                student.getAddressLine2(),
                student.getAddressLine3(),
                student.getState(),
                student.getZipcode(),
                student.getCourse(),
               // student.getDateOfJoining(),
                student.getAge()
        );
    }
}
