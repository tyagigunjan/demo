package string;

public class ascii {

	public static void main(String args[])
	{
		char c;  //Character Variable Declaration
		for(int i = 65; i<=67; i++) 
		{
			for(int j = 65; j<=i; j++) 
			{
				 c =(char)j; //Converting ASCII value to Character
				System.out.printf( c + " ");
			}
				System.out.println();
		}

	}
}
