package JavaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaKamp.hrms.entities.concretes.SystemEmployee;



public interface SystemEmployeeDao extends JpaRepository<SystemEmployee, Integer>{

}
