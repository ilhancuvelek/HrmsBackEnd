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
@Table(name="schools")
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="school_id")
	private int id;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="school_depatment_name")
	private String schoolDepatmentName;
	
	@Column(name="entry_date")
	private Date entryDate;
	
	@Column(name="graduation_date")
	private Date graduationDate;
	


	@Column(name="jobseeker_id")
	private int jobSeekerId;
	


	@ManyToOne()
	@JoinColumn(name = "jobseeker_id", insertable = false, updatable = false)
	@JsonIgnore
	private JobSeeker jobseeker;

	


	public School() {
		super();
	}



	public School(int id, String schoolName,String schoolDepatmentName, Date entryDate, Date graduationDate, JobSeeker jobseeker,
			int schoolDepartmentId,int jobSeekerId) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.schoolDepatmentName=schoolDepatmentName;
		this.entryDate = entryDate;
		this.graduationDate = graduationDate;
		this.jobSeekerId=jobSeekerId;
		this.jobseeker.setId(jobSeekerId); 
		this.jobseeker=jobseeker;
	}



	public String getSchoolDepatmentName() {
		return schoolDepatmentName;
	}



	public void setSchoolDepatmentName(String schoolDepatmentName) {
		this.schoolDepatmentName = schoolDepatmentName;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}



	public Date getEntryDate() {
		return entryDate;
	}



	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}



	public Date getGraduationDate() {
		return graduationDate;
	}



	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
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
