package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.entities.concretes.City;

public interface CityService {
	
	DataResult<List<City>> getAll();

}
