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
		this.add(executeButton);
		this.add(convoArea);
		this.add(commandField);
		this.add(commandLabel);
		convoArea.setEnabled(false);
		convoArea.setEditable(false);
	
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.SOUTH, convoArea, -6, SpringLayout.NORTH, commandLabel);
		appLayout.putConstraint(SpringLayout.EAST, convoArea, 428, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, commandField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, convoArea, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, convoArea, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, commandLabel, -51, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, commandField, 6, SpringLayout.SOUTH, commandLabel);
		appLayout.putConstraint(SpringLayout.EAST, commandLabel, -26, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, executeButton, 0, SpringLayout.NORTH, commandField);
		appLayout.putConstraint(SpringLayout.EAST, executeButton, -34, SpringLayout.WEST, commandField);
	}
	
	private void setupListeners()
	{
		
	}

}
