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

	//���������ע��Ļ��Ϳ��Խ�userDaoʵ����ΪoracleUserDao
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	

	
	
	
}
