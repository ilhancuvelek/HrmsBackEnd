package JavaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import JavaKamp.hrms.business.abstracts.JobSeekerService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.entities.concretes.JobSeeker;
import JavaKamp.hrms.entities.dtos.JobSeekerCVDto;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	
	private JobSeekerService jobSeekerService;
	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.add(jobSeeker);
	}
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return jobSeekerService.getAll();
	}
	
		
	@GetMapping("/getJobseekerCVById")
	public DataResult<JobSeekerCVDto> getJobseekerCVById(@RequestParam int id){
		return this.jobSeekerService.getJobseekerCVById(id);
	}

}
