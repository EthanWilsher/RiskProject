package risk.controller;

import risk.model.*;
import risk.view.*;
import java.util.Scanner;

public class Story
{
	private RiskDisplay popup;
	
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		popup = new RiskDisplay();
		
		
		System.out.println("Welcome to this conquest");
		System.out.println(" ");
		System.out.println("You start your journey ");
		popup.getResponse("do you head east or west");
		
		
	}

}
