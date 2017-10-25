package cn.javass.dp.adapter.example2;
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

		//����������־�ļ��Ķ���
		LogFileOperateApi api = new LogFileOperate(""); 
		//������־�ļ�
		api.writeLogFile(list);
		
		//��ȡ��־�ļ�������
		List<LogModel> readLog = api.readLogFile();
		System.out.println("readLog="+readLog);
	}
}
