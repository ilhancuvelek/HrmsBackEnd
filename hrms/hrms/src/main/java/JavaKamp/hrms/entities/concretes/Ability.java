package JavaKamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="abilities")
public class Ability {
	
	
	@Id
	@GeneratedValue
	@Column(name="ability_id")
	private int id;
	
	@Column(name="ability_name")
	private String abilityName;
	

	@Column(name="jobseeker_id")
	private int jobSeekerId;
	

	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id", insertable = false, updatable = false)
	@JsonIgnore
	private JobSeeker jobseeker;


	


	public Ability(int id, String abilityName, int jobSeekerId) {
		super();
		this.id = id;
		this.abilityName = abilityName;
		this.jobSeekerId = jobSeekerId;
		this.jobseeker.setId(jobSeekerId);

	}


	public Ability() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAbilityName() {
		return abilityName;
	}


	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}


	public JobSeeker getJobseeker() {
		return jobseeker;
	}


	public void setJobseeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}


	public int getJobSeekerId() {
		return jobSeekerId;
	}


	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}
	
	




}
