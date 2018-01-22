package cn.javass.dp.proxy.example3;
import java.util.*;
public class Client {
	public static void main(String[] args) throws Exception{
		UserManager userManager = new UserManager();
		Collection<UserModelApi> userList = userManager.getUserListByDepId("0101");

		//如果只是显示用户名称，那么不需要重新查询数据库
		for(UserModelApi eachUser : userList){
			System.out.println("用户编号：="+eachUser.getUserId()+",用户姓名：="+eachUser.getName());
		}
		//如果访问非用户编号和用户姓名外的属性，那就会重新查询数据库
		for(UserModelApi eachUser : userList){
			System.out.println("用户编号：="+eachUser.getUserId()+",用户姓名：="+eachUser.getName()+",所属部门：="+eachUser.getDepId());
		}
	}
}