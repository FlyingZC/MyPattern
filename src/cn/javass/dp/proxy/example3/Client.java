package cn.javass.dp.proxy.example3;
import java.util.*;
public class Client {
	public static void main(String[] args) throws Exception{
		UserManager userManager = new UserManager();
		Collection<UserModelApi> userList = userManager.getUserListByDepId("0101");

		//���ֻ����ʾ�û����ƣ���ô����Ҫ���²�ѯ���ݿ�
		for(UserModelApi eachUser : userList){
			System.out.println("�û���ţ�="+eachUser.getUserId()+",�û�������="+eachUser.getName());
		}
		//������ʷ��û���ź��û�����������ԣ��Ǿͻ����²�ѯ���ݿ�
		for(UserModelApi eachUser : userList){
			System.out.println("�û���ţ�="+eachUser.getUserId()+",�û�������="+eachUser.getName()+",�������ţ�="+eachUser.getDepId());
		}
	}
}