package JavaExam;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class Main{
	public JFrame frame = new JFrame("单机版Java简易机考程序");
	
	public Container cont = frame.getContentPane();
	
	public static JRadioButton jradio1 = new JRadioButton("A.");
	public static JRadioButton jradio2 = new JRadioButton("B.");
	public static JRadioButton jradio3 = new JRadioButton("C.");
	public static JRadioButton jradio4 = new JRadioButton("D.");
	public static JCheckBox check1 = new JCheckBox("A.");
	public static JCheckBox check2 = new JCheckBox("B.");
	public static JCheckBox check3 = new JCheckBox("C.");
	public static JCheckBox check4 = new JCheckBox("D.");
	public static JLabel label=new JLabel("初始文字");
	public JButton button=new JButton("提交");
	
	public static JPanel pan = new JPanel();
	public static ButtonGroup group = new ButtonGroup();
	public static int count = 0;
	Main() 
	{
		this.frame.setLocationRelativeTo(null);
		
		button.setBounds(150,185,80,28);
		pan.add(label);
		//定义排版样式
		pan.setLayout(new GridLayout(6, 1));
		jradio1.setActionCommand("A");
		jradio2.setActionCommand("B");
		jradio3.setActionCommand("C");
		jradio4.setActionCommand("D");
		
		group.add(jradio1);
		group.add(jradio2);
		group.add(jradio3);
		group.add(jradio4);
			
		frame.add(this.button);
		cont.add(pan);
		this.frame.setSize(400, 250);
		
		giveQuestion q=new giveQuestion();
		Thread t1 = new Thread(q);
		Thread t2 = new Thread(q);
		t1.setName("zhang");
		t2.setName("li");
		if(Math.random()<0.5)
			t2.start();
		else
			t1.start();

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.interrupt();
				t2.interrupt();
			}
		});
		this.frame.setVisible(true);//设置可见
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//设置关闭
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main();
			}
		});
		
	}
	
}
