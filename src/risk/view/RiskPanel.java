package risk.view;

import risk.controller.RiskController;
import javax.swing.*;
import java.awt.*;

public class RiskPanel extends JPanel
{
	private RiskController appController;
	private JButton executeButton;
	private JTextArea convoArea;
	private JTextField commandField;
	private SpringLayout appLayout;
	private JLabel commandLabel;
	
	
	
	public RiskPanel(RiskController appController)
	{
		super();
		this.appController = appController;
		
		convoArea = new JTextArea(10, 15);
		commandField = new JTextField(20);
		commandLabel = new JLabel("Type here to command your troops");
		appLayout = new SpringLayout();
		executeButton = new JButton("Execute");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
		
	}
	
	private void setupPanel()
	{
		this.setBackground( new Color (158, 117, 46));
		this.setLayout(appLayout);
	
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
