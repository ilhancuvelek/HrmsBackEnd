package JavaKamp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="working_areas")
public class WorkingArea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="workingarea_id")
	private int id;
	
	@Column(name="workingarea_name")
	private String workingareaName;
	
	@OneToMany(mappedBy = "workingArea")
	private List<JobAdvert> jobAdverts; 

	
	public WorkingArea() {
		super();
	}

	public WorkingArea(int id, String workingareaName) {
		super();
		this.id = id;
		this.workingareaName = workingareaName;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkingareaName() {
		return workingareaName;
	}

	public void setWorkingareaName(String workingareaName) {
		this.workingareaName = workingareaName;
	}
	
	
}
