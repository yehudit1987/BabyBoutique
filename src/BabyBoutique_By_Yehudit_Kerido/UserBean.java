package BabyBoutique_By_Yehudit_Kerido;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean 
public class UserBean {
	
	private String firstName;
	private String lastName; 
	private String email;
	private String phone;
	private String address; 
	private String city; 
	private int zipCode;
	private String userName;
	private String password;
	private String passwordConfirm;
	
	//no-arg constructor
	public UserBean()
	{
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
	public void validatePasswordConfirm (FacesContext context, UIComponent component, Object value)
				throws ValidatorException{
		
		// Retrieve the value passed to this method
	    String confirmPassword = (String) value;
	    // Retrieve the temporary value from the password field
	    UIInput passwordInput = (UIInput) component.findComponent("password");
	    String password = (String) passwordInput.getLocalValue();
	    if (password == null || confirmPassword == null || !password.equals(confirmPassword)) {
	    	FacesMessage message=new FacesMessage ("Please enter the same password");
			throw new ValidatorException (message);
		}
			
	}
			
	
	
	

}
