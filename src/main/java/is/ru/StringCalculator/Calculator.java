package is.ru.StringCalculator;

public class Calculator {
	public static void main(String [] args) {
		return;
	}
	public static int add(String text){
		if(text.equals(""))//If the input is empty, then return 0
		{
			return 0;
		}
		else {
			if(text.contains(","))//If text contains comma then split the values
			{
				String numbers [] = text.split(",|\n"); // insert the input into string array and split if there exist comma or new line
				return sum(numbers);
			}
				return 1;//if one value then return 1⁄
	  }
}

	private static int toInt(String number)//Function that parses string to int
	{
		return Integer.parseInt(number);
	}

	private static int sum(String [] numbers)//Function that takes all the values in a string array
	{
			int total = 0;
			for(String number : numbers)//Loops through array and adds the values in the array together
			{
				total += toInt(number);
			}
			return total; //returns the sum
		}
}
