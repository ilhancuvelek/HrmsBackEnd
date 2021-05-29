package JavaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaKamp.hrms.business.abstracts.JobAdvertService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobadvert")
public class JobAdvertController {
	
	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
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

}
