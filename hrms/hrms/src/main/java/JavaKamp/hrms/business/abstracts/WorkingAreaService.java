package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.entities.concretes.WorkingArea;



public interface WorkingAreaService {
	
	DataResult<List<WorkingArea>> getAll();
	DataResult<WorkingArea> getByName(String name);
	Result add(WorkingArea workingArea);

}
