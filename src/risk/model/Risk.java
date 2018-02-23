package risk.model;

public class Risk
{

	
	
	
	
	
	
	
	
	
	
	public boolean lengthChecker(String input)
	{
		boolean validLength = false;
		
		if (input != null && input.length() > 2)
		{
			validLength = true;
		}
		
		return validLength;
	}
	
}
