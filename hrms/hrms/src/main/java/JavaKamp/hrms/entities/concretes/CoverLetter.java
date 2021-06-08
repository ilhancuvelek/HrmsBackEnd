package JavaKamp.hrms.entities.concretes;

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
@Table(name="cover_letters")

public class CoverLetter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="coverletter_id")
	private int id;
	
	@Column(name="text")
	private String text;
	

	@Column(name="jobseeker_id")
	private int jobSeekerId;
	

	
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id", insertable = false, updatable = false)
	@JsonIgnore
	private JobSeeker jobseeker;
	

	public CoverLetter() {
		super();
	}
	public CoverLetter(int id, String text,int jobSeekerId) {
		super();
		this.id = id;
		this.text = text;
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
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public JobSeeker getJobseeker() {
		return jobseeker;
	}
	public void setJobseeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}



	

}
