package JavaKamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import JavaKamp.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City	, Integer>{

}
