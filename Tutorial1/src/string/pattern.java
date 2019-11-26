package string;

public class pattern 
{
	public static void main(String args[])
	{
		int min = 1;
		int max = 4;
		for(int i = 1; i<=4; i++) 
		{
			for(int j = 1; j<=4; j++) 
			{
              if(i == min || i==max)
               {
				System.out.print( "$" + " ");
               }
              else if(j == min)
              {
  				System.out.print( "$" + " ");   

              }
            else if(j == max)
              {
  				System.out.print( "$" + " "); 

              }
              else
              {
            	  System.out.print(" ");
    				{
      					System.out.print( " "); 
    				}
              }
			 
			}
				System.out.println();
		}

	}
}
