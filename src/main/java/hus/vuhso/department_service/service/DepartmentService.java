package hus.vuhso.department_service.service;

import hus.vuhso.department_service.entity.Department;
import hus.vuhso.department_service.form.DepartmentFilterForm;
import hus.vuhso.department_service.repository.DepartmentRepository;
import hus.vuhso.department_service.specification.department.DepartmentSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements IDepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Page<Department> getAllDepartments(Pageable pageable, String search, DepartmentFilterForm filterForm) {

        Specification<Department> where = DepartmentSpecification.buildWhere(search, filterForm);
        return repository.findAll(where, pageable);
    }

    @Override
    public Department getDepartmentByID(int id) {
        return repository.findById(id).isPresent()? repository.findById(id).get() : null;
    }

}
