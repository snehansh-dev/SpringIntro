package com.snehansh.SpringIntro.service;

import com.snehansh.SpringIntro.entity.Department;
import org.springframework.stereotype.Service;


public interface DepartmentService {
    public Department saveDepartment(Department department);
}
