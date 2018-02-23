package risk.view;

import javax.swing.*;
import risk.controller.*;

public class RiskFrame extends JFrame
{

	private RiskController appController;
	private RiskPanel appPanel;
	
	public RiskFrame(RiskController appController)
	{
		super();
		this.appController = appController;
		appPanel = new RiskPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500, 500);
		this.setTitle("Conquest");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
	

}
