package praveen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import praveen.model.Department;
import praveen.model.repo.DepartmentRepo;

@Service
public class StudentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	public List<Department> getAllDepartment(){
		
		return departmentRepo.findAll(); 
	}
	
}
