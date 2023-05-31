package day17;

public class EncapsulationRBI {
	
	// Encapsulation - Binding your data and your code is said encapsulation 
	// It will increase security 
	
	// Encapsulation can be achieved by settinp ur data type as private access mofifier 
	// and by getter and setter methods
	
	private String aadharno ;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getLoandetails() {
		return loandetails;
	}
	public void setLoandetails(String loandetails) {
		this.loandetails = loandetails;
	}
	private String panno ;
	private String account ;
	private String loandetails ;
	
	
	
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}

	

}
