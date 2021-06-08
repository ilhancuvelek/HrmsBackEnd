package JavaKamp.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import JavaKamp.hrms.entities.concretes.Photo;

public interface PhotoDao extends JpaRepository<Photo, Integer>{

	Photo getById(int id);
	Photo getByJobseeker_Id(int id);
}
