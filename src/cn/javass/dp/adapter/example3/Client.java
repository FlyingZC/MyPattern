package cn.javass.dp.adapter.example3;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //准备日志内容，也就是测试的数据
        LogModel logModel01 = new LogModel();
        logModel01.setLogId("001" );
        logModel01.setOperateUser("admin" );
        logModel01.setOperateTime("2010-03-02 10:08:18" );
        logModel01.setLogContent("这是一个测试" );

        List<LogModel> list = new ArrayList<LogModel>();
        list.add(logModel01);

        //创建操作日志文件的对象,即旧的操作日志文件对象 的 接口,需要被适配
        LogFileOperateApi oldLogFileApi = new LogFileOperate("" );

        //创建新版的操作日志的接口对象,由于Adapter类实现了新的LogDbOperateApi接口,向上造型
        LogDbOperateApi newApi = new Adapter(oldLogFileApi);

        //保存日志文件
        newApi.createLog(logModel01);

        //读取日志文件的内容
        List<LogModel> allLog = newApi.getAllLog();
        System.out.println("allLog=" + allLog);
    }
}
