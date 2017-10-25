package com.zc.z05singleton;
//懒汉式,需要时候再创建.测试线程安全问题
public class Singleton3 {
	private Singleton3(){
		
	}
	private static Singleton3 instance;
	public static Singleton3 getInstance(){
		if(instance==null){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(Singleton3.class){
				if(instance==null){//若去除会有线程安全问题
					instance=new Singleton3();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			new Thread(new Runnable(){
				@Override
				public void run() {
					System.out.println(Singleton3.getInstance());
				}
			}).start();
		}
	}
}
