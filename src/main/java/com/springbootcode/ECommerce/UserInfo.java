package com.springbootcode.ECommerce;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "UserInfo")
 public class UserInfo {
    
    protected UserInfo(){
        
    }

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String firstname , middlename , lastname,  email ,password;
	
	/* @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    @JoinTable(name = "users_roles",joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
	        inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	    private Collection < Role > roles;
	 

	
	public SignUpBean(String firstname, String middlename, String lastname, String email, String password,
			Collection<Role> roles) {
		super();
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.roles = roles;
	} */

	public UserInfo(Long id, String firstname, String middlename, String lastname, String email, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}

    UserInfo(String firstname, String middlename, String lastname, String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


	/* public SignUpBean(Long id , String firstname, String middlename, String lastname, String email, String password,
			Collection<Role> roles) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
*/

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getMiddlename() {
		return middlename;
	}


	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


/*	public Collection<Role> getRoles() {
		return roles;
	}


	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
} */

    void saveData(UserInfo userInfoService) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}