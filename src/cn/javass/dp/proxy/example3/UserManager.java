package cn.javass.dp.proxy.example3;
import java.util.*;
import java.sql.*;

/**
 * ʵ��ʾ��Ҫ��Ĺ���
 */
public class UserManager {	
	/**
	 * ���ݲ��ű������ȡ�ò����µ�������Ա.�÷���ֻ��id��name,�Ҽ��ϴ洢���Ǵ������
	 * @param depId ���ű��
	 * @return �ò����µ�������Ա
	 */
	public Collection<UserModelApi> getUserListByDepId(String depId)throws Exception{
		Collection<UserModelApi> userList = new ArrayList<UserModelApi>();
		Connection conn = null;
		try{
			conn = this.getConnection();
			//ֻ��Ҫ��ѯuserId��name����ֵ�Ϳ�����
			String sql = "select u.userId,u.name "
				+"from tbl_user u,tbl_dep d "
				+"where u.depId=d.depId and d.depId like ?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, depId+"%");
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				//�����Ǵ����Ĵ�����󣬶�����ֱ�Ӵ���UserModel�Ķ���
				Proxy proxy = new Proxy(new UserModel());
				//ֻ������userId��name����ֵ�Ϳ�����
				proxy.setUserId(rs.getString("userId"));
				proxy.setName(rs.getString("name"));
				
				userList.add(proxy);
			}
			
			rs.close();
			pstmt.close();
		}finally{
			conn.close();
		}
		return userList;
	}
	/**
	 * ��ȡ�����ݿ������
	 * @return ���ݿ�����
	 */
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "test", "test");
	}
}
