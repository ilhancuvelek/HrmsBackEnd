package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.LanguageDao;
import JavaKamp.hrms.business.abstracts.LanguageService;
import JavaKamp.hrms.core.utilities.results.DataResult;

import JavaKamp.hrms.entities.concretes.Language;
@Service
public class LanguageManager implements LanguageService{
	
	private LanguageDao languageDao;
	

	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<List<Language>> getall() {
		return new SuccessDataResult<List<Language>>(this.languageDao.findAll());
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult();
	}

	@Override
	public Result delete(Language language) {
		this.languageDao.save(language);
		return new SuccessResult();
	}

	@Override
	public Result update(Language language) {
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Language>> findAllByJobseeker_Id(int jobseekerId) {
		return new SuccessDataResult<List<Language>>(this.languageDao.findAllByJobseeker_Id(jobseekerId));
	}

}
