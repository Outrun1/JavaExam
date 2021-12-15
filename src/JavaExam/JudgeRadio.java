package JavaExam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JudgeRadio implements ActionListener
{
	public String answer;
	public void actionPerformed(ActionEvent e) {
		answer= e.getActionCommand();
	}
}
