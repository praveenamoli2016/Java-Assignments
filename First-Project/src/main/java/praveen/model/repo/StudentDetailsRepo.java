package praveen.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import praveen.model.StudentDetails;

public interface StudentDetailsRepo extends JpaRepository<StudentDetails, Long> {

}
