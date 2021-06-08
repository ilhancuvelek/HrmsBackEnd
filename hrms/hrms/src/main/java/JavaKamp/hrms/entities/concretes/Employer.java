package JavaKamp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.EqualsAndHashCode;

@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name="user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_adverts"})
@EqualsAndHashCode(callSuper=false) 
public class Employer extends User{
	
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="website_name")
	private String websiteName;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email_verify")
	private boolean emailVerify;
	
	@Column(name="admin_verify")
	private boolean adminVerify;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvert> jobAdverts;
	
	public Employer() {
		super();
	}

	public Employer( String companyName, String websiteName, String phoneNumber, boolean emailVerify,
			boolean adminVerify) {
		super();

		this.companyName = companyName;
		this.websiteName = websiteName;
		this.phoneNumber = phoneNumber;
		this.emailVerify = emailVerify;
		this.adminVerify = adminVerify;
		
		
	}
	


	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsiteName() {
		return websiteName;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isEmailVerify() {
		return emailVerify;
	}

	public void setEmailVerify(boolean emailVerify) {
		this.emailVerify = emailVerify;
	}

	public boolean isAdminVerify() {
		return adminVerify;
	}

	public void setAdminVerify(boolean adminVerify) {
		this.adminVerify = adminVerify;
	}
}
