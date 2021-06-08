package JavaKamp.hrms.business.concretes;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import JavaKamp.hrms.core.utilities.results.Result;

import JavaKamp.hrms.business.abstracts.PhotoService;
import JavaKamp.hrms.core.utilities.photoUpload.CloudinaryService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessResult;
import JavaKamp.hrms.dataAccess.abstracts.PhotoDao;
import JavaKamp.hrms.entities.concretes.Photo;

@Service
public class PhotoManager implements PhotoService{
	
	private PhotoDao photoDao;
	private CloudinaryService cloudinaryService;
	
	@Autowired
	public PhotoManager(PhotoDao photoDao,CloudinaryService cloudinaryService) {
		super();
		this.photoDao = photoDao;
		this.cloudinaryService=cloudinaryService;
	}

	@Override
	public Result add(Photo imageForCV, MultipartFile imageFile) {
		Map<String,String> uploadImage = this.cloudinaryService.uploadPhotoFile(imageFile).getData();
		imageForCV.setPhotoUrl(uploadImage.get("url"));
		this.photoDao.save(imageForCV);
		return new SuccessResult("Photo has been added.");
	}

	@Override
	public Result update(Photo imageForCV) {
		this.photoDao.save(imageForCV);
		return new SuccessResult("Photo has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.photoDao.deleteById(id);
		return new SuccessResult("Photo has been deleted.");
	}

	@Override
	public DataResult<Photo> getById(int id) {
		return new SuccessDataResult<Photo>(this.photoDao.getById(id));
	}

	@Override
	public DataResult<List<Photo>> getAll() {
		return new SuccessDataResult<List<Photo>>(this.photoDao.findAll());
	}

	@Override
	public DataResult<Photo> getByJobseekerId(int id) {
		return new SuccessDataResult<Photo>(this.photoDao.getByJobseeker_Id(id));
	}

	

}
