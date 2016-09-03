package example;

public class RegisterForm {

	private  UserDto userDto;
	
	private  IUserDao userDao;
	
	public RegisterForm(){
		userDto=new UserDto("fei","123");
	}

	public void test1(){
		userDao.addUser(userDto);
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	//这里如果用注入的话就可以将userDao实例化为oracleUserDao
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	

	
	
	
}
