package risk.controller;

import risk.view.*;
import risk.model.*;
import risk.controller.*;

public class RiskController
{
	private RiskDisplay display;
	private Risk risk;
	private RiskFrame appFrame;
	
	
	
	public RiskController()
	{
		
		display = new RiskDisplay();
		appFrame = new RiskFrame(this);
		
		
	}
	
	public void start()
	{
		display.displayText("Welcome Conqueror");
		
	}
	
	public String interactWithRisk (String input)
	{
		String riskSays = "";
		
		if(risk.quitChecker(input))
		{
			close();
		}
	
		riskSays += risk.processConversation(input);
		
		return riskSays;
		
	}
	
	public Risk getRisk()
	{
		
		return risk;
	}
	
	private void close()
	{
		display.displayText("Goodbye");
		System.exit(0);
	}
	
	public RiskDisplay getDisplay()
	{
		return display;
	}
	
	public void handleErrors(Exception error)
	{
		display.displayText(error.getMessage());
	}
	
	
}
