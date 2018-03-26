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
	
	
	
	public String collectResponse(String question)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, question, windowTitle, JOptionPane.PLAIN_MESSAGE, icon, null, "");
		
		return answer;
		
	}
	
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}


		public String getResponse(String questionAsked)
		{
			String response = "";
			
			response += JOptionPane.showInputDialog(null, questionAsked);
			
			return response;
			
		}
}

	

