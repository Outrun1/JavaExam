package JavaExam;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;

public class JudgeCheck implements ItemListener
{
	public boolean answer[] = new boolean[4];
	JudgeCheck()
	{
		for(int i=0;i<4;i++)
			answer[i]=false;
	}
	public void itemStateChanged(ItemEvent e) {
		JCheckBox check=new JCheckBox();
		check=(JCheckBox)e.getItemSelectable();
		String find = check.getText();
		if(check.isSelected())
		{
			if(find.charAt(0)=='A')
				answer[0]=true;
			else if(find.charAt(0)=='B')
				answer[1]=true;
			else if(find.charAt(0)=='C')
				answer[2]=true;
			else if(find.charAt(0)=='D')
				answer[3]=true;
		}
		else
		{
			if(find.charAt(0)=='A')
				answer[0]=false;
			else if(find.charAt(0)=='B')
				answer[1]=false;
			else if(find.charAt(0)=='C')
				answer[2]=false;
			else if(find.charAt(0)=='D')
				answer[3]=false;
		}
		
	}
}