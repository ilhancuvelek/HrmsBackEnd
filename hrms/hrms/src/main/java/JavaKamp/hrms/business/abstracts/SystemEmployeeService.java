package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.entities.concretes.SystemEmployee;



public interface SystemEmployeeService {
	
	DataResult<List<SystemEmployee>> getAll();
	Result add(SystemEmployee employee);
	
	Result update(SystemEmployee employee);
	
	Result delete(SystemEmployee employee);

}
