package JavaKamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaKamp.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{
	List<Language> findAllByJobseeker_Id(int jobseekerId);
}
