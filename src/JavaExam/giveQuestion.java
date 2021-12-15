package JavaExam;

import java.awt.GridLayout;

public class giveQuestion implements Runnable
{
	public synchronized void run() 
	{
		Thread thread=Thread.currentThread();
		long start=System.nanoTime();
		int i,j;
		if(thread.getName()=="zhang")
		{
			i=1;j=17;
		}
		else
		{
			i=17;j=1;
		}
		for(;i<=16;i++)
		{
			switch(i)
			{
			case 1:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.setLayout(new GridLayout(4, 1));
				
				Main.label.setText("<html>"+i+".在Java的方法中定义一个常量要用const关键字。");
				Main.jradio1.setText("<html>A.对");
				Main.jradio2.setText("<html>B.错");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="B")
					Main.count++;
			};break;
			case 2:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.check1);
				Main.pan.add(Main.check2);
				Main.pan.add(Main.check3);
				Main.pan.add(Main.check4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+i+".下面哪个语句正确地声明一个整型的二维数组？");
				Main.check1.setText("A.int a[][] = new int[][];");
				Main.check2.setText("B.int a[10][10] = new int[][];");
				Main.check3.setText("C.int a[][] = new int[10][10];");
				Main.check4.setText("D.int [][]a = new int[10][10];");
				
				JudgeCheck judge=new JudgeCheck();
				Main.check1.addItemListener(judge);
				Main.check2.addItemListener(judge);
				Main.check3.addItemListener(judge);
				Main.check4.addItemListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer[0]==false&&judge.answer[1]==false&&judge.answer[2]==true&&judge.answer[3]==true)
					Main.count+=2;
			};break;
			case 3:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.add(Main.jradio3);
				Main.pan.add(Main.jradio4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+i+".下列选项中，表示数据或方法可以被同一包中的任何类或它的子类访问，即使子类在不同的包中也可以的修饰符是");
				Main.jradio1.setText("<html>A.public");
				Main.jradio2.setText("<html>B.protected");
				Main.jradio3.setText("<html>C.private");
				Main.jradio4.setText("<html>D.final");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				Main.jradio3.addActionListener(judge);
				Main.jradio4.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="A")
					Main.count++;
			};break;
			case 4:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				
				Main.pan.setLayout(new GridLayout(4, 1));
				Main.label.setText("<html>"+i+".抽象方法必须在抽象类中，所以抽象类中的方法都必须是抽象方法。");
				Main.jradio1.setText("<html>A.对");
				Main.jradio2.setText("<html>B.错");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="B")
					Main.count++;
			};break;
			case 5:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.check1);
				Main.pan.add(Main.check2);
				Main.pan.add(Main.check3);
				Main.pan.add(Main.check4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+i+".下面哪些不是java的简单数据类型?");
				Main.check1.setText("A.short");
				Main.check2.setText("B.Boolean");
				Main.check3.setText("C.Double");
				Main.check4.setText("D.float");
				
				JudgeCheck judge=new JudgeCheck();
				Main.check1.addItemListener(judge);
				Main.check2.addItemListener(judge);
				Main.check3.addItemListener(judge);
				Main.check4.addItemListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer[0]==false&&judge.answer[1]==true&&judge.answer[2]==true&&judge.answer[3]==false)
					Main.count+=2;
			};break;
			case 6:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.add(Main.jradio3);
				Main.pan.add(Main.jradio4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+i+".Java嵌入式应用开发平台名称为:");
				Main.jradio1.setText("<html>A.JDK");
				Main.jradio2.setText("<html>B.J2ME");
				Main.jradio3.setText("<html>C.J2SE");
				Main.jradio4.setText("<html>D.J2EE");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				Main.jradio3.addActionListener(judge);
				Main.jradio4.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="B")
					Main.count++;
			};break;
			case 7:{
				Main.pan.removeAll();
				
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.setLayout(new GridLayout(4, 1));
				
				Main.label.setText("<html>"+i+".接口是特殊的类，所以接口也可以继承，子接口将继承父接口的所有常量和抽象方法。");
				Main.jradio1.setText("<html>A.对");
				Main.jradio2.setText("<html>B.错");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="A")
					Main.count++;
			};break;
			case 8:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.check1);
				Main.pan.add(Main.check2);
				Main.pan.add(Main.check3);
				Main.pan.add(Main.check4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+i+".下面哪些语句能够正确地生成5个空字符串？");
				Main.check1.setText("A.String a[]=new String[5]; for(int i=0；i<5；a[i++]='');");
				Main.check2.setText("B.String a[]={\"\",\"\",\"\",\"\",\"\"};");
				Main.check3.setText("C.String a[5];");
				Main.check4.setText("D.String [5]a;");
				
				JudgeCheck judge=new JudgeCheck();
				Main.check1.addItemListener(judge);
				Main.check2.addItemListener(judge);
				Main.check3.addItemListener(judge);
				Main.check4.addItemListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				if(judge.answer[0]==true&&judge.answer[1]==true&&judge.answer[2]==false&&judge.answer[3]==false)
					Main.count+=2;
			};break;
			case 9:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.add(Main.jradio3);
				Main.pan.add(Main.jradio4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+i+".ArrayList类的底层数据结构是");
				Main.jradio1.setText("<html>A.数组结构");
				Main.jradio2.setText("<html>B.链表结构");
				Main.jradio3.setText("<html>C.哈希表结构");
				Main.jradio4.setText("<html>D.红黑树结构");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				Main.jradio3.addActionListener(judge);
				Main.jradio4.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="A")
					Main.count++;
			};break;
			case 10:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.setLayout(new GridLayout(4, 1));
				
				Main.label.setText("<html>"+i+".final修饰的类能派生子类。");
				Main.jradio1.setText("<html>A.对");
				Main.jradio2.setText("<html>B.错");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="B")
					Main.count++;
			};break;
			case 11:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.check1);
				Main.pan.add(Main.check2);
				Main.pan.add(Main.check3);
				Main.pan.add(Main.check4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+i+".下列说法错误的有");
				Main.check1.setText("A.数组是一种对象");
				Main.check2.setText("B.数组属于一种原生类");
				Main.check3.setText("C.int number=[]={31,23,33,43,35,63}");
				Main.check4.setText("D.数组的大小可以任意改变");
				
				JudgeCheck judge=new JudgeCheck();
				Main.check1.addItemListener(judge);
				Main.check2.addItemListener(judge);
				Main.check3.addItemListener(judge);
				Main.check4.addItemListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer[0]==false&&judge.answer[1]==true&&judge.answer[2]==true&&judge.answer[3]==true)
					Main.count+=2;
			};break;
			case 12:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.add(Main.jradio3);
				Main.pan.add(Main.jradio4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+i+".LinkedList类的特点是");
				Main.jradio1.setText("<html>A.查询快");
				Main.jradio2.setText("<html>B.增删快");
				Main.jradio3.setText("<html>C.元素不重复");
				Main.jradio4.setText("<html>D.元素自然排序");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				Main.jradio3.addActionListener(judge);
				Main.jradio4.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="B")
					Main.count++;
			};break;
			case 13:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.setLayout(new GridLayout(4, 1));
				
				Main.label.setText("<html>"+i+".覆盖的同名方法中，子类方法不能比父类方法的访问权限低。");
				Main.jradio1.setText("<html>A.对");
				Main.jradio2.setText("<html>B.错");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="A")
					Main.count++;
			};break;
			case 14:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.check1);
				Main.pan.add(Main.check2);
				Main.pan.add(Main.check3);
				Main.pan.add(Main.check4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+i+".不能用来修饰interface的有");
				Main.check1.setText("A.private");
				Main.check2.setText("B.public");
				Main.check3.setText("C.protected");
				Main.check4.setText("D.static");
				
				JudgeCheck judge=new JudgeCheck();
				Main.check1.addItemListener(judge);
				Main.check2.addItemListener(judge);
				Main.check3.addItemListener(judge);
				Main.check4.addItemListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer[0]==true&&judge.answer[1]==false&&judge.answer[2]==true&&judge.answer[3]==false)
					Main.count+=2;
			};break;
			case 15:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.add(Main.jradio3);
				Main.pan.add(Main.jradio4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+i+".Vector类的特点是");
				Main.jradio1.setText("<html>A.线程同步");
				Main.jradio2.setText("<html>B.线程不同步");
				Main.jradio3.setText("<html>C.增删快");
				Main.jradio4.setText("<html>D.底层是链表结构");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				Main.jradio3.addActionListener(judge);
				Main.jradio4.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="A")
					Main.count++;
			};break;
			case 16:{
				long end=System.nanoTime();
				long time = end-start;
				time/=10e8;
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.label.setText("                          你的成绩为："+Main.count+"分    所花的时间为："+ time + "秒");
				Main.pan.setLayout(new GridLayout(1, 1));
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
			};break;
			}
			Main.pan.repaint();
			Main.group.clearSelection();
			Main.check1.setSelected(false);
			Main.check2.setSelected(false);
			Main.check3.setSelected(false);
			Main.check4.setSelected(false);
		}
		
		for(;j<=16;j++)
		{
			switch(j)
			{
			case 1:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.setLayout(new GridLayout(4, 1));
				
				Main.label.setText("<html>"+j+".抽象类中能创建对象。");
				Main.jradio1.setText("<html>A.对");
				Main.jradio2.setText("<html>B.错");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="B")
					Main.count++;
			};break;
			case 2:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.check1);
				Main.pan.add(Main.check2);
				Main.pan.add(Main.check3);
				Main.pan.add(Main.check4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+j+".下列说法错误的有");
				Main.check1.setText("A.在类方法中可用this来调用本类的类方法");
				Main.check2.setText("B.在类方法中调用本类的类方法时可直接调用");
				Main.check3.setText("C.在类方法中只能调用本类中的类方法");
				Main.check4.setText("D.在类方法中绝对不能调用实例方法");
				
				JudgeCheck judge=new JudgeCheck();
				Main.check1.addItemListener(judge);
				Main.check2.addItemListener(judge);
				Main.check3.addItemListener(judge);
				Main.check4.addItemListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer[0]==true&&judge.answer[1]==false&&judge.answer[2]==true&&judge.answer[3]==true)
					Main.count+=2;
			};break;
			case 3:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.add(Main.jradio3);
				Main.pan.add(Main.jradio4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+j+".关于迭代器说法错误的是");
				Main.jradio1.setText("<html>A.迭代器是取出集合元素的方式");
				Main.jradio2.setText("<html>B.迭代器的hasNext()方法返回值是布尔类型");
				Main.jradio3.setText("<html>C.List集合有特有迭代器");
				Main.jradio4.setText("<html>D.next()方法将返回集合中的上一个元素");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				Main.jradio3.addActionListener(judge);
				Main.jradio4.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="D")
					Main.count++;
			};break;
			case 4:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				
				Main.pan.setLayout(new GridLayout(4, 1));
				Main.label.setText("<html>"+j+".一个类可以实现多接口");
				Main.jradio1.setText("<html>A.对");
				Main.jradio2.setText("<html>B.错");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="A")
					Main.count++;
			};break;
			case 5:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.check1);
				Main.pan.add(Main.check2);
				Main.pan.add(Main.check3);
				Main.pan.add(Main.check4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+j+".下列标识符不合法的有?");
				Main.check1.setText("A.new");
				Main.check2.setText("B.$Usdollars");
				Main.check3.setText("C.1234");
				Main.check4.setText("D.car.taxi");
				
				JudgeCheck judge=new JudgeCheck();
				Main.check1.addItemListener(judge);
				Main.check2.addItemListener(judge);
				Main.check3.addItemListener(judge);
				Main.check4.addItemListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer[0]==true&&judge.answer[1]==false&&judge.answer[2]==true&&judge.answer[3]==true)
					Main.count+=2;
			};break;
			case 6:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.add(Main.jradio3);
				Main.pan.add(Main.jradio4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+j+".实现下列哪个接口，可以启用比较功能");
				Main.jradio1.setText("<html>A.Runnable接口");
				Main.jradio2.setText("<html>B.Iterator接口");
				Main.jradio3.setText("<html>C.Serializable接口");
				Main.jradio4.setText("<html>D.Comparator接口");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				Main.jradio3.addActionListener(judge);
				Main.jradio4.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="D")
					Main.count++;
			};break;
			case 7:{
				Main.pan.removeAll();
				
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.setLayout(new GridLayout(4, 1));
				
				Main.label.setText("<html>"+j+".Unicode码与ASCII码相同。");
				Main.jradio1.setText("<html>A.对");
				Main.jradio2.setText("<html>B.错");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="B")
					Main.count++;
			};break;
			case 8:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.check1);
				Main.pan.add(Main.check2);
				Main.pan.add(Main.check3);
				Main.pan.add(Main.check4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+j+".以下哪几个能使用throw抛出?");
				Main.check1.setText("A.Error");
				Main.check2.setText("B.Throwable");
				Main.check3.setText("C.Exception");
				Main.check4.setText("D.RuntimeException");
				
				JudgeCheck judge=new JudgeCheck();
				Main.check1.addItemListener(judge);
				Main.check2.addItemListener(judge);
				Main.check3.addItemListener(judge);
				Main.check4.addItemListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				if(judge.answer[0]==true&&judge.answer[1]==true&&judge.answer[2]==true&&judge.answer[3]==true)
					Main.count+=2;
			};break;
			case 9:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.add(Main.jradio3);
				Main.pan.add(Main.jradio4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+j+".ArrayList和Vector的区别说法正确的是");
				Main.jradio1.setText("<html>A.ArrayList是线程安全的，Vector是线程不安全");
				Main.jradio2.setText("<html>B.ArrayList是线程不安全的，Vector是线程安全的");
				Main.jradio3.setText("<html>C.ArrayList底层是数组结构，Vector底层是链表结构");
				Main.jradio4.setText("<html>D.ArrayList底层是链表结构，Vector底层是数组结构");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				Main.jradio3.addActionListener(judge);
				Main.jradio4.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="B")
					Main.count++;
			};break;
			case 10:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.setLayout(new GridLayout(4, 1));
				
				Main.label.setText("<html>"+j+".抽象方法没有方法体。");
				Main.jradio1.setText("<html>A.对");
				Main.jradio2.setText("<html>B.错");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="B")
					Main.count++;
			};break;
			case 11:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.check1);
				Main.pan.add(Main.check2);
				Main.pan.add(Main.check3);
				Main.pan.add(Main.check4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+j+".javax.Servlet的包中，属于类的是");
				Main.check1.setText("A.Servlet");
				Main.check2.setText("B.GenericServlet");
				Main.check3.setText("C.ServletException");
				Main.check4.setText("D.ServletContext");
				
				JudgeCheck judge=new JudgeCheck();
				Main.check1.addItemListener(judge);
				Main.check2.addItemListener(judge);
				Main.check3.addItemListener(judge);
				Main.check4.addItemListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer[0]==false&&judge.answer[1]==true&&judge.answer[2]==true&&judge.answer[3]==false)
					Main.count+=2;
			};break;
			case 12:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.add(Main.jradio3);
				Main.pan.add(Main.jradio4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+j+".对于HashMap集合说法正确的是");
				Main.jradio1.setText("<html>A.底层是数组结构");
				Main.jradio2.setText("<html>B.底层是链表结构");
				Main.jradio3.setText("<html>C.可以存储null值和null键");
				Main.jradio4.setText("<html>D.不可以存储null值和null键");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				Main.jradio3.addActionListener(judge);
				Main.jradio4.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="C")
					Main.count++;
			};break;
			case 13:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.setLayout(new GridLayout(4, 1));
				
				Main.label.setText("<html>"+j+".package语句必须放在程序的第一句。");
				Main.jradio1.setText("<html>A.对");
				Main.jradio2.setText("<html>B.错");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="A")
					Main.count++;
			};break;
			case 14:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.check1);
				Main.pan.add(Main.check2);
				Main.pan.add(Main.check3);
				Main.pan.add(Main.check4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+j+".哪几种声明防止方法覆盖？");
				Main.check1.setText("A.final void methoda() {}");
				Main.check2.setText("B.void final methoda() {}");
				Main.check3.setText("C.static void methoda() {}");
				Main.check4.setText("D.final abstract void methoda() {}");
				
				JudgeCheck judge=new JudgeCheck();
				Main.check1.addItemListener(judge);
				Main.check2.addItemListener(judge);
				Main.check3.addItemListener(judge);
				Main.check4.addItemListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer[0]==true&&judge.answer[1]==false&&judge.answer[2]==true&&judge.answer[3]==false)
					Main.count+=2;
			};break;
			case 15:{
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.add(Main.jradio1);
				Main.pan.add(Main.jradio2);
				Main.pan.add(Main.jradio3);
				Main.pan.add(Main.jradio4);
				Main.pan.setLayout(new GridLayout(6, 1));
				Main.label.setText("<html>"+j+".将集合转成数组的方法是");
				Main.jradio1.setText("<html>A.asList()");
				Main.jradio2.setText("<html>B.toCharArray()");
				Main.jradio3.setText("<html>C.toArray()");
				Main.jradio4.setText("<html>D.copy()");
				
				JudgeRadio judge=new JudgeRadio();
				Main.jradio1.addActionListener(judge);
				Main.jradio2.addActionListener(judge);
				Main.jradio3.addActionListener(judge);
				Main.jradio4.addActionListener(judge);
				
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				
				if(judge.answer=="C")
					Main.count++;
			};break;
			case 16:{
				long end=System.nanoTime();
				long time = end-start;
				time/=10e8;
				Main.pan.removeAll();
				Main.pan.add(Main.label);
				Main.pan.setLayout(new GridLayout(1, 1));
				Main.label.setText("                          你的成绩为："+Main.count+"分    所花的时间为："+ time + "秒");
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
			};break;
			}
			Main.pan.repaint();
			Main.group.clearSelection();
			Main.check1.setSelected(false);
			Main.check2.setSelected(false);
			Main.check3.setSelected(false);
			Main.check4.setSelected(false);
		}
	}
	
}
