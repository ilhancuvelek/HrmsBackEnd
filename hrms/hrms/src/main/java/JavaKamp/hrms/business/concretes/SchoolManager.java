package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaKamp.hrms.business.abstracts.SchoolService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.SchoolDao;
import JavaKamp.hrms.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService{
	
	private SchoolDao schoolDao;
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public DataResult<List<School>> getall() {
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll());
	}

	@Override
	public DataResult<List<School>> getAllBySchoolNameOrderByGraduationDateDesc(String schoolName) {
		return new SuccessDataResult<List<School>>(this.schoolDao.getAllBySchoolNameOrderByGraduationDateDesc(schoolName));
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Okul Eklendi");
	}

	@Override
	public Result delete(School school) {
		this.schoolDao.delete(school);
		return new SuccessResult("Okul silindi");
	}

	@Override
	public Result update(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Okul güncellendi");
	}

	@Override
	public DataResult<List<School>> findAllByJobseeker_Id(int jobseekerId) {
		return new SuccessDataResult<List<School>>(this.schoolDao.findAllByJobseeker_Id(jobseekerId));
	}

}
