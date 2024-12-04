package hus.vuhso.department_service.form;

import hus.vuhso.department_service.entity.Department;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
public class DepartmentFilterForm {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date minCreatedDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date maxCreatedDate;

    private Integer minYear;

    private Department.DepartmentType type;

}