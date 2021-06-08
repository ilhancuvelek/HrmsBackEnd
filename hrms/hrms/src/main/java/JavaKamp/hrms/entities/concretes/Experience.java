package JavaKamp.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="experiences")

public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="experience_id")
	private int id;
	
	@Column(name="workplace_name")
	private String workplaceName;
	
	@Column(name="position_name")
	private String positionName;
	
	@Column(name="entry_date")
	private Date entryDate;
	
	@Column(name="quit_date")
	private Date quitDate;
	

	@Column(name="jobseeker_id")
	private int jobSeekerId;
	

	
	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id", insertable = false, updatable = false)
	@JsonIgnore
	private JobSeeker jobseeker;

	public Experience() {
		super();
	}

	public Experience(int id, String workplaceName, String positionName, Date entryDate, Date quitDate,
			int jobSeekerId) {
		super();
		this.id = id;
		this.workplaceName = workplaceName;
		this.positionName = positionName;
		this.entryDate = entryDate;
		this.quitDate = quitDate;
		this.jobSeekerId=jobSeekerId;
		this.jobseeker.setId(jobSeekerId);
//		this.jobseeker=jobseeker;
	}

	public int getJobSeekerId() {
		return jobSeekerId;
	}

	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkplaceName() {
		return workplaceName;
	}

	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getQuitDate() {
		return quitDate;
	}

	public void setQuitDate(Date quitDate) {
		this.quitDate = quitDate;
	}

	public JobSeeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}



	
	
}
