package JavaKamp.hrms.api.controllers;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.multipart.MultipartFile;

import JavaKamp.hrms.business.abstracts.JobSeekerService;
import JavaKamp.hrms.business.abstracts.PhotoService;

import JavaKamp.hrms.entities.concretes.JobSeeker;
import JavaKamp.hrms.entities.concretes.Photo;
import JavaKamp.hrms.core.utilities.results.DataResult;

import JavaKamp.hrms.core.utilities.results.Result;
@RestController
@RequestMapping("/api/photos")
public class PhotoController {
	
	private JobSeekerService jobSeekerService;
	private PhotoService photoService;
	
	@Autowired
	public PhotoController(PhotoService photoService, JobSeekerService jobSeekerService) {
		super();
		this.photoService = photoService;
		this.jobSeekerService=jobSeekerService;
	}
	@GetMapping("getAll")
	public DataResult<List<Photo>> getAll(){
			return this.photoService.getAll();
		
	}
	@PostMapping("/add")
	public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile){
		JobSeeker jobseeker = this.jobSeekerService.getById(id).getData();
		Photo photo = new Photo();
		photo.setJobseeker(jobseeker);
		return this.photoService.add(photo, imageFile);
	}
}
