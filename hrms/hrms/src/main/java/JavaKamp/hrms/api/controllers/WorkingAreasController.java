package JavaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaKamp.hrms.business.abstracts.WorkingAreaService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.core.utilities.results.Result;
import JavaKamp.hrms.entities.concretes.WorkingArea;

@RestController
@RequestMapping("/api/workingareas")
public class WorkingAreasController {
	
	private WorkingAreaService workingAreaService;
	@Autowired
	public WorkingAreasController(WorkingAreaService workingAreaService) {
		super();
		this.workingAreaService = workingAreaService;
	}
	@PostMapping("/add")
    public Result add(@RequestBody WorkingArea workingArea){
        return this.workingAreaService.add(workingArea);
    }
	@GetMapping("/getall")
	    public DataResult<List<WorkingArea>> getAll(){
	        return this.workingAreaService.getAll();
	    }

}
