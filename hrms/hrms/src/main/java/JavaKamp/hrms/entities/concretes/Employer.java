package JavaKamp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name="employer_id")
public class Employer extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employer_id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
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

	public Employer(int id, int userId, String companyName, String websiteName, String phoneNumber, boolean emailVerify,
			boolean adminVerify) {
		super();
		this.id = id;
		this.userId = userId;
		this.companyName = companyName;
		this.websiteName = websiteName;
		this.phoneNumber = phoneNumber;
		this.emailVerify = emailVerify;
		this.adminVerify = adminVerify;
		
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
