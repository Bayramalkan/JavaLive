package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_seeker")
public class JobSeeker extends User {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_id")
	private String nationalityId;
	
	@Column(name="birth_year")
	private Date birthYear;
	
	@Column(name="email_verify")
	private boolean emailVerify;

	public JobSeeker() {}
	
	
	public JobSeeker(int id, String firstName, String lastName, String nationalityId, Date birthYear,
			boolean emailVerify) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.birthYear = birthYear;
		this.emailVerify = emailVerify;
	}
	
	
}
