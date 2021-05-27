package JavaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaKamp.hrms.entities.concretes.WorkingArea;



public interface WorkingAreaDao extends JpaRepository<WorkingArea, Integer>{

	WorkingArea findByWorkingareaName(String workingareaName);
}
