package 关联关系.双向关联;

import 关联关系.单向关联.Address;

public class Product {

	//customer与product是双向关联关系
	private  Customer customer;
	
	//Product 与 address 是单向关联
	private  Address address;
}
