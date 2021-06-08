package JavaKamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaKamp.hrms.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School, Integer>{
	
	List<School> getAllBySchoolNameOrderByGraduationDateDesc(String schoolName);
	List<School> findAllByJobseeker_Id(int jobseekerId);
}
