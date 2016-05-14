	import java.util.*;
	class Customer
	{
		public static void main( String[] args )
		{
		  			
			Scanner in = new Scanner(System.in);
			System.out.println( "               ~~~~~WELCOME !! ~~~~~ \n                Happy Shopping.. :) \n \n" );
			
			Shirt s = null ;
		    int wish,type,cust ;
		    String str;
			
			System.out.println( "What type of shirt do you want? \n Enter 1 for COLLARED and 2 for V-Shirt " );
			
	try {
			type = in.nextInt();
			while ( type > 3 || type < 1)
			{
			if( type == 1 || type == 2 )
			 {
			switch ( type )
			{
				case 1 : s = new collaredTShirt(); break;
				case 2 : s = new V_Shirt(); break;
				
			}
			
			System.out.println( "Do you want to customize? \n Enter 1 for yes and 2 for no " );
			cust = in.nextInt();
			if( cust == 1 )
			{
			
				do
				{
				
				System.out.println( "1>Add a Picture , 2> Add Color , 3> Print a text , 4)EXIT");
				wish = in.nextInt();
				switch ( wish )
				{
					case 1 : System.out.println( "Enter Picture name");
							 str = in.next();
							 s = new AddPicture(s , str); break;
							 
				   case 2 : System.out.println( "Enter Color");
							 str = in.next();
				 			 s = new AddColor(s , str); break;
				   case 3 : System.out.println( "Enter Text");
				 			 str = in.next();
							 s = new printText(s , str); break;
				default : break;
							 
					          
				}
				
				
				}
				while( wish > 0 && wish < 4 );
			}
			
			
			System.out.println( s.gettype());
			System.out.println( s.getcost());
			System.out.println( " Thank you! Hope to see you again. BYE. \n \n " );
		}
			else 
			System.out.println( " Sorry Wrong choice! BYE. " );
			}
			}
	catch( Exception e )
	{
			System.out.println("Invalid entry.Please check again.");
	}
		}
	}
	
	

