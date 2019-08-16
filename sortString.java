package Session7.Assignment2;


public class sortString {

	public static void main(String[] args) {

		String x = "my name is ABC";


		System.out.println("Your Original String is: " + x);
		System.out.println();
		String[] splitString = x.split( " " );

		System.out.print("Your Sorted String is: ");
		for ( String s : splitString ) 
		{		
			System.out.print( s +", ");
		}
	}

}
