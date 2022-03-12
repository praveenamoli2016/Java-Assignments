package praveen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import praveen.model.Department;
import praveen.service.StudentService;

@RestController
public class CRUDController {

	@Autowired
	private StudentService studentService; 
	
	@GetMapping("/getAllDepartment")
	public List<Department> getAllDepartment(){
		return studentService.getAllDepartment();
	}
}
