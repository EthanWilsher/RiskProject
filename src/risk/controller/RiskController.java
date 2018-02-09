package risk.controller;

public class RiskController
{
	private RiskDisplay display;
	
	public RiskController()
	{
		display = new RiskDisplay();
	}
	
	public void start()
	{
		display.displayText("Welcome Conqueror");
		
	}
	
	
}
