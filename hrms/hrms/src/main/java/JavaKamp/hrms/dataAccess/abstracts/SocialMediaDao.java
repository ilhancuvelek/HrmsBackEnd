package JavaKamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaKamp.hrms.entities.concretes.SocialMedia;

public interface SocialMediaDao extends JpaRepository<SocialMedia, Integer>{
	List<SocialMedia> findAllByJobseeker_Id(int jobseekerId);
}
