package cn.javass.dp.adapter.example3;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		//׼����־���ݣ�Ҳ���ǲ��Ե�����
		LogModel logModel01 = new LogModel();
		logModel01.setLogId("001");
		logModel01.setOperateUser("admin");
		logModel01.setOperateTime("2010-03-02 10:08:18");
		logModel01.setLogContent("����һ������");
		
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(logModel01);

		//����������־�ļ��Ķ���,���ɵĲ�����־�ļ����� �� �ӿ�,��Ҫ������
		LogFileOperateApi oldLogFileApi = new LogFileOperate("");
		
		//�����°�Ĳ�����־�Ľӿڶ���,����Adapter��ʵ�����µ�LogDbOperateApi�ӿ�,��������
		LogDbOperateApi newApi = new Adapter(oldLogFileApi); 
		
		//������־�ļ�
		newApi.createLog(logModel01);
		
		//��ȡ��־�ļ�������
		List<LogModel> allLog = newApi.getAllLog();
		System.out.println("allLog="+allLog);
	}
}
