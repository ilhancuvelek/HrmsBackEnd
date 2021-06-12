package JavaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import JavaKamp.hrms.business.abstracts.JobAdvertService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobadvert")
@CrossOrigin
public class JobAdvertController {
	
	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvertisement) {
		
		return this.jobAdvertService.add(jobAdvertisement);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvert>> getAll(){		
		return this.jobAdvertService.getAll();
	}
	@GetMapping("/getAllActiveJobAdvert")
	public DataResult<List<JobAdvert>> getAllActiveJobAdvert(){
		return this.jobAdvertService.getAllActiveJobAdvert();
	}
	@GetMapping("/getAllByOpenAndDeadlineJobAdvert")
	public DataResult<List<JobAdvert>> getAllByOpenAndDeadlineJobAdvert(){
		return this.jobAdvertService.getAllByOpenAndDeadlineJobAdvert();
	}
	@GetMapping("/getByCityId")
	public DataResult<List<JobAdvert>> getByCity(@RequestParam int cityId) {
		return this.jobAdvertService.getByCity(cityId);
	}

}
