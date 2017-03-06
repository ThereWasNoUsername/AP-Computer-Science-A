package Unit11.InstructionalExamples;


//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class ArrayTools
{
	//instance variables and constructors could be present, but are not necessary
	
	//sumSection will return the sum of the numbers 
	//from start to stop, not including stop
	public static int sumSection(int[] numArray, int start, int stop)
	{
		int sum=0;
		for(int i = start; i < stop; i++) {
			sum += numArray[i];
		}
		return sum;
	}
	
	//countVal will return a count of how many times val is present in numArray
	public static int countVal(int[] numArray, int val)
	{
		int count=0;
		for(int n : numArray) {
			if(n == val) {
				count++;
			}
		}
		return count;
	}
}