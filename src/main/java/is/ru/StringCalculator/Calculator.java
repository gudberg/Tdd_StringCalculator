package is.ru.StringCalculator;
import java.util.ArrayList;

public class Calculator {
	public static void main(String [] args)
	{
		return;
	}

	public static int add(String text)
	{
		if(text.equals(""))//If the input is empty, then return 0
		{
			return 0;
		}
		else {
			if(text.contains(",") || text.contains("\n"))//If text contains comma or newline then split the values
			{
				return sum(delimiter(text)); //checked for delimiter and then inserted into the sum function
			}
				return 1;//if one value then return 1⁄
	  }
}

private static String[] delimiter(String numbers)
{
	String delimiter = ",|\n";

	if (numbers.startsWith("//")){
		int FindDelimiter = numbers.indexOf("//") + 2; //Skips the backslashes
		delimiter = delimiter + "|" + numbers.substring(FindDelimiter, FindDelimiter + 1);
		numbers = numbers.substring(FindDelimiter + 2); // Removes "//;\n" and takes the numbers
		return numbers.split(delimiter); //Split the numbers by its delimiter
	}
	else {
		return numbers.split(delimiter);
	}
}

	private static int toInt(String number)//Function that parses string to int
	{
		return Integer.parseInt(number);
	}

	private static int sum(String [] numbers)//Function that takes all the values in a string array
	{
			int total = 0;
			ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();
			for(String number : numbers)//Loops through array and adds the values in the array together
			{
				int eachNumber = toInt(number);
				if(eachNumber < 0)
				{
					negativeNumbers.add(eachNumber);
				}
				if(eachNumber > 1000)
				{
					continue;
				}
				total += eachNumber;
			}
			if(negativeNumbers.size() > 0) //If there is one negative number then exception is thrown
			{
				 throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
			}
			else{
				return total; //returns the sum
			}

		}
}
