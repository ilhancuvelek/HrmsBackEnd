package JavaKamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaKamp.hrms.entities.concretes.CoverLetter;

public interface CoverLetterDao extends JpaRepository<JavaKamp.hrms.entities.concretes.CoverLetter, Integer>{
	List<CoverLetter> findAllByJobseeker_Id(int jobseekerId);
}
