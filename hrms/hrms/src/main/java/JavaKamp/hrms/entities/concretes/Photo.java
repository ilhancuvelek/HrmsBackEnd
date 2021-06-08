package JavaKamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="photos")

public class Photo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="photo_id")
	private int id;
	
	@Column(name="photo_url")
	private String photoUrl;
	
	@Column(name="jobseeker_id")
	private int jobSeekerId;
	
	@OneToOne(optional=false,fetch=FetchType.LAZY)
    @JoinColumn(name = "jobseeker_id", insertable = false, updatable = false)
	private JobSeeker jobseeker;

	public Photo() {
		super();
	}

	public Photo(int id, String photoUrl,int jobSeekerId) {
		super();
		this.id = id;
		this.photoUrl = photoUrl;
		this.jobSeekerId=jobSeekerId;
		this.jobseeker.setId(jobSeekerId);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public int getJobSeekerId() {
		return jobSeekerId;
	}

	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}

	public JobSeeker getJobseeker() {
		return jobseeker;
	}

	public void setJobseeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}



}
