package JavaKamp.hrms.core.utilities.photoUpload;

import java.util.Map;


import org.springframework.web.multipart.MultipartFile;



import JavaKamp.hrms.core.utilities.results.DataResult;


public interface CloudinaryService {
	DataResult<Map> uploadPhotoFile(MultipartFile imageFile);
}
