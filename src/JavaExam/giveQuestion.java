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
				
				Main.label.setText("<html>"+i+".��Java�ķ����ж���һ������Ҫ��const�ؼ��֡�");
				Main.jradio1.setText("<html>A.��");
				Main.jradio2.setText("<html>B.��");
				
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
				Main.label.setText("<html>"+i+".�����ĸ������ȷ������һ�����͵Ķ�ά���飿");
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
				Main.label.setText("<html>"+i+".����ѡ���У���ʾ���ݻ򷽷����Ա�ͬһ���е��κ��������������ʣ���ʹ�����ڲ�ͬ�İ���Ҳ���Ե����η���");
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
				Main.label.setText("<html>"+i+".���󷽷������ڳ������У����Գ������еķ����������ǳ��󷽷���");
				Main.jradio1.setText("<html>A.��");
				Main.jradio2.setText("<html>B.��");
				
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
				Main.label.setText("<html>"+i+".������Щ����java�ļ���������?");
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
				Main.label.setText("<html>"+i+".JavaǶ��ʽӦ�ÿ���ƽ̨����Ϊ:");
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
				
				Main.label.setText("<html>"+i+".�ӿ���������࣬���Խӿ�Ҳ���Լ̳У��ӽӿڽ��̳и��ӿڵ����г����ͳ��󷽷���");
				Main.jradio1.setText("<html>A.��");
				Main.jradio2.setText("<html>B.��");
				
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
				Main.label.setText("<html>"+i+".������Щ����ܹ���ȷ������5�����ַ�����");
				Main.check1.setText("A.String a[]=new String[5]; for(int i=0��i<5��a[i++]='');");
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
				Main.label.setText("<html>"+i+".ArrayList��ĵײ����ݽṹ��");
				Main.jradio1.setText("<html>A.����ṹ");
				Main.jradio2.setText("<html>B.����ṹ");
				Main.jradio3.setText("<html>C.��ϣ��ṹ");
				Main.jradio4.setText("<html>D.������ṹ");
				
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
				
				Main.label.setText("<html>"+i+".final���ε������������ࡣ");
				Main.jradio1.setText("<html>A.��");
				Main.jradio2.setText("<html>B.��");
				
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
				Main.label.setText("<html>"+i+".����˵���������");
				Main.check1.setText("A.������һ�ֶ���");
				Main.check2.setText("B.��������һ��ԭ����");
				Main.check3.setText("C.int number=[]={31,23,33,43,35,63}");
				Main.check4.setText("D.����Ĵ�С��������ı�");
				
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
				Main.label.setText("<html>"+i+".LinkedList����ص���");
				Main.jradio1.setText("<html>A.��ѯ��");
				Main.jradio2.setText("<html>B.��ɾ��");
				Main.jradio3.setText("<html>C.Ԫ�ز��ظ�");
				Main.jradio4.setText("<html>D.Ԫ����Ȼ����");
				
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
				
				Main.label.setText("<html>"+i+".���ǵ�ͬ�������У����෽�����ܱȸ��෽���ķ���Ȩ�޵͡�");
				Main.jradio1.setText("<html>A.��");
				Main.jradio2.setText("<html>B.��");
				
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
				Main.label.setText("<html>"+i+".������������interface����");
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
				Main.label.setText("<html>"+i+".Vector����ص���");
				Main.jradio1.setText("<html>A.�߳�ͬ��");
				Main.jradio2.setText("<html>B.�̲߳�ͬ��");
				Main.jradio3.setText("<html>C.��ɾ��");
				Main.jradio4.setText("<html>D.�ײ�������ṹ");
				
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
				Main.label.setText("                          ��ĳɼ�Ϊ��"+Main.count+"��    ������ʱ��Ϊ��"+ time + "��");
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
				
				Main.label.setText("<html>"+j+".���������ܴ�������");
				Main.jradio1.setText("<html>A.��");
				Main.jradio2.setText("<html>B.��");
				
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
				Main.label.setText("<html>"+j+".����˵���������");
				Main.check1.setText("A.���෽���п���this�����ñ�����෽��");
				Main.check2.setText("B.���෽���е��ñ�����෽��ʱ��ֱ�ӵ���");
				Main.check3.setText("C.���෽����ֻ�ܵ��ñ����е��෽��");
				Main.check4.setText("D.���෽���о��Բ��ܵ���ʵ������");
				
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
				Main.label.setText("<html>"+j+".���ڵ�����˵���������");
				Main.jradio1.setText("<html>A.��������ȡ������Ԫ�صķ�ʽ");
				Main.jradio2.setText("<html>B.��������hasNext()��������ֵ�ǲ�������");
				Main.jradio3.setText("<html>C.List���������е�����");
				Main.jradio4.setText("<html>D.next()���������ؼ����е���һ��Ԫ��");
				
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
				Main.label.setText("<html>"+j+".һ�������ʵ�ֶ�ӿ�");
				Main.jradio1.setText("<html>A.��");
				Main.jradio2.setText("<html>B.��");
				
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
				Main.label.setText("<html>"+j+".���б�ʶ�����Ϸ�����?");
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
				Main.label.setText("<html>"+j+".ʵ�������ĸ��ӿڣ��������ñȽϹ���");
				Main.jradio1.setText("<html>A.Runnable�ӿ�");
				Main.jradio2.setText("<html>B.Iterator�ӿ�");
				Main.jradio3.setText("<html>C.Serializable�ӿ�");
				Main.jradio4.setText("<html>D.Comparator�ӿ�");
				
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
				
				Main.label.setText("<html>"+j+".Unicode����ASCII����ͬ��");
				Main.jradio1.setText("<html>A.��");
				Main.jradio2.setText("<html>B.��");
				
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
				Main.label.setText("<html>"+j+".�����ļ�����ʹ��throw�׳�?");
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
				Main.label.setText("<html>"+j+".ArrayList��Vector������˵����ȷ����");
				Main.jradio1.setText("<html>A.ArrayList���̰߳�ȫ�ģ�Vector���̲߳���ȫ");
				Main.jradio2.setText("<html>B.ArrayList���̲߳���ȫ�ģ�Vector���̰߳�ȫ��");
				Main.jradio3.setText("<html>C.ArrayList�ײ�������ṹ��Vector�ײ�������ṹ");
				Main.jradio4.setText("<html>D.ArrayList�ײ�������ṹ��Vector�ײ�������ṹ");
				
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
				
				Main.label.setText("<html>"+j+".���󷽷�û�з����塣");
				Main.jradio1.setText("<html>A.��");
				Main.jradio2.setText("<html>B.��");
				
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
				Main.label.setText("<html>"+j+".javax.Servlet�İ��У����������");
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
				Main.label.setText("<html>"+j+".����HashMap����˵����ȷ����");
				Main.jradio1.setText("<html>A.�ײ�������ṹ");
				Main.jradio2.setText("<html>B.�ײ�������ṹ");
				Main.jradio3.setText("<html>C.���Դ洢nullֵ��null��");
				Main.jradio4.setText("<html>D.�����Դ洢nullֵ��null��");
				
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
				
				Main.label.setText("<html>"+j+".package��������ڳ���ĵ�һ�䡣");
				Main.jradio1.setText("<html>A.��");
				Main.jradio2.setText("<html>B.��");
				
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
				Main.label.setText("<html>"+j+".�ļ���������ֹ�������ǣ�");
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
				Main.label.setText("<html>"+j+".������ת������ķ�����");
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
				Main.label.setText("                          ��ĳɼ�Ϊ��"+Main.count+"��    ������ʱ��Ϊ��"+ time + "��");
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
