package com.zc.l12flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//客户端 使用随机数生成外蕴状态	创建大量对象 但是各个享元类的构造方法只被调用了一次 实现复用
public class Client extends JFrame{
	private static final long serialVersionUID = 1L;
	private static final int WIDTH=300;
	private static final int HEIGHT=300;
	//形状为内蕴状态
	private static final String[] shapes={"R","O"};
	//以下均为外蕴状态
	private static final Color[] colors={Color.red,Color.green,Color.blue};//颜色
	private static final boolean[] fill={true,false};//是否填充
	private static final String[] font={"Arial","Courier"};//字体
	
	public Client(){
		Container container=getContentPane();
		JButton startBtn=new JButton("Draw Shapes");
		final JPanel panel=new JPanel();
		
		container.add(panel,BorderLayout.CENTER);
		container.add(startBtn, BorderLayout.SOUTH); 
		setSize(WIDTH, HEIGHT); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
		//每次点按钮,绘制100个图形
		startBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics g = panel.getGraphics();//使用panel的Graphics 
				for (int i = 0 ; i < 100;i++){
				MyShape shape = ShapeFactory.getShape(getRandomShape());//获取不同形状 
				shape.draw(g,getRandomX(),getRandomY(),getRandomWidth(), 
						getRandomHeight(), getRandomColor(), 
						getRandomFill(), getRandomFont());
			} 
		}});
	}
	
	private String getRandomShape(){
		int n=(int)(Math.random()*shapes.length);
		return shapes[n];
	}
	private int getRandomX(){
		return (int)(Math.random()*WIDTH);
	}
	private int getRandomY(){
		return (int)(Math.random()*HEIGHT);
	}
	private int getRandomWidth(){
		return (int)(Math.random()*(WIDTH/7));
	}
	private int getRandomHeight(){
		return (int)(Math.random()*HEIGHT/7);
	}
	private Color getRandomColor(){
		return colors[(int)(Math.random()*colors.length)];
	}
	private boolean getRandomFill(){
		return fill[(int)(Math.random()*fill.length)];
	}
	private String getRandomFont(){
		return font[(int)(Math.random()*font.length)];
	}
	public static void main(String[] args) {
		new Client();
	}
	
}
