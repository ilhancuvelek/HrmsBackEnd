package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaKamp.hrms.business.abstracts.EmployerService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.ErrorResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.EmployerDao;
import JavaKamp.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}


	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"employer listelendi");
	}



	@Override
	public Result add(Employer employer) {
		
		if(findByEmail(employer.getEmail()).getData() != null){
	         return new ErrorResult("Aynı email zaten var.");
	    }else if(employer.getPassword()!=employer.getPasswordRepeat()) {
	    	return new ErrorResult("şifre uyuşmuyor");
	    }
		this.employerDao.save(employer);
		return new SuccessResult("İş veren eklendi");
		
		
		
	}


	@Override
	public DataResult<Employer> findByEmail(String email) {
		
		return new SuccessDataResult<Employer>(this.employerDao.findByEmail(email));
	}

	

	

}
