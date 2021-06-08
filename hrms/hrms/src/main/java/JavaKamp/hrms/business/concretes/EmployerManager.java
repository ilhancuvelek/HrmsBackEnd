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
		
		if(!this.checkIfEmailExists(employer.getEmail())) {
			return new ErrorResult("Email already exist!");
		}
		if(!this.employerValidation(employer)) {
			return new ErrorResult("Missing information!");
		}
		
		this.employerDao.save(employer);
		return new SuccessResult("Employer added !");
		
	}


	@Override
	public DataResult<Employer> findByEmail(String email) {
		
		return new SuccessDataResult<Employer>(this.employerDao.findByEmail(email));
	}
	
	private boolean employerValidation(Employer employer) {
		
		if(employer.getCompanyName() == null && employer.getWebsiteName()== null && employer.getEmail()== null
				&& employer.getPhoneNumber() == null && employer.getPassword() == null) {
			return false;
					
		}
		return true;
	}
	private boolean checkIfEmailExists(String email) {
		if(this.employerDao.findByEmail(email) !=null) {
			return false;
		}
		return true;
		
	}

	

	

}
