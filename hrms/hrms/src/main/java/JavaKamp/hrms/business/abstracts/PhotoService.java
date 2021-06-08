package JavaKamp.hrms.business.abstracts;

import java.util.List;


import org.springframework.web.multipart.MultipartFile;

import JavaKamp.hrms.core.utilities.results.Result;

import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.entities.concretes.Photo;

public interface PhotoService {
	
	Result add(Photo imageForCV, MultipartFile imageFile);
	Result update(Photo imageForCV);
	Result delete(int id);
	DataResult<Photo> getById(int id);	
	DataResult<List<Photo>> getAll();
	DataResult<Photo> getByJobseekerId(int id);
}
