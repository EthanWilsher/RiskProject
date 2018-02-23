package risk.view;

import javax.swing.*;

public class RiskDisplay
{
	private ImageIcon icon;
	private String windowTitle;
	
	public RiskDisplay()
	{
		icon = new ImageIcon(getClass().getResource("images/Danny.jpg"));
		windowTitle = "Danny says Conquer";
		
	}
	
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null,  message, windowTitle, JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
	public String collectResponse(String question)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, question, windowTitle, JOptionPane.PLAIN_MESSAGE, icon, null, "");
		
		return answer;
		
	}
	
}
