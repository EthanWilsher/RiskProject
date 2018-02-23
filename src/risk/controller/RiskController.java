package risk.controller;

import risk.view.*;
import risk.model.*;

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
	
	public RiskDisplay getDisplay()
	{
		return display;
	}
	
	public void handleErrors(Exception error)
	{
		display.displayText(error.getMessage());
	}
	
	
}
