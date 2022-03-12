package praveen.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import praveen.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
