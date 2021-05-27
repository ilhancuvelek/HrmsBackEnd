package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaKamp.hrms.business.abstracts.WorkingAreaService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.ErrorResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.WorkingAreaDao;
import JavaKamp.hrms.entities.concretes.WorkingArea;

@Service
public class WorkingAreaManager implements WorkingAreaService{
	
	private WorkingAreaDao workignareaDao;
	@Autowired
	public WorkingAreaManager(WorkingAreaDao workignareaDao) {
		super();
		this.workignareaDao = workignareaDao;
	}

	

	@Override
	public DataResult<List<WorkingArea>> getAll() {
		
		return new SuccessDataResult<List<WorkingArea>>(this.workignareaDao.findAll(),"çalışma alanları listelendi");
	}

	@Override
	public DataResult<WorkingArea> getByName(String name) {
		
		return new SuccessDataResult<>(this.workignareaDao.findByWorkingareaName(name));
	}



	@Override
	public Result add(WorkingArea workingArea) {
		if(getByName(workingArea.getWorkingareaName()).getData() != null){
	         return new ErrorResult("Aynı pozisyon zaten var.");
	    }
	   this.workignareaDao.save(workingArea);
	   return new SuccessResult("Pozisyon eklendi");
	}

}
