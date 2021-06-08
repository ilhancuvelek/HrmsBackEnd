package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.core.utilities.results.Result;

import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.entities.concretes.School;


public interface SchoolService {
	DataResult<List<School>> getall();
	DataResult<List<School>> getAllBySchoolNameOrderByGraduationDateDesc(String schoolName);
	Result add(School school);
	Result delete(School school);
	Result update(School school);
	
	DataResult<List<School>> findAllByJobseeker_Id(int jobseekerId);
}
