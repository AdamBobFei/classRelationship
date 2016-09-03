package example;

public class UserDto {
	private String userAccount;
	private String userPassWord;
	
	
	public UserDto(String userAccount, String userPassWord) {
		super();
		this.userAccount = userAccount;
		this.userPassWord = userPassWord;
	}
	
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserPassWord() {
		return userPassWord;
	}
	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}
	

}
