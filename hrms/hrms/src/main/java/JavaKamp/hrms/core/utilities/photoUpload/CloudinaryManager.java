package JavaKamp.hrms.core.utilities.photoUpload;

import java.io.IOException;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.ErrorDataResult;
import JavaKamp.hrms.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryManager implements CloudinaryService{
	
	private Cloudinary cloudinary;

	public CloudinaryManager() {
		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dyjldwiwt",
				"api_key", "489896256811876",
				"api_secret", "VgxC09WBiFiyM2PWI4CtDyswJvw"));
	}

	@Override
	public DataResult<Map> uploadPhotoFile(MultipartFile imageFile) {
		try {
			@SuppressWarnings("unchecked")
			Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(resultMap);
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		return new ErrorDataResult<Map>();
	}

}
