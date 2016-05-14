	class AddColor implements Shirt
	{
	
	String color; 	
 	protected Shirt plainshirtobject;
 	
 	public AddColor( Shirt sap, String col )
 	{
 		plainshirtobject = sap;
 		color = col;
 		
 	}	
 		
 	public String gettype()
 	{
 	 	return plainshirtobject.gettype() + " , " + color;
 	}
 	
 	public double getcost()
	{
		 return plainshirtobject.getcost()+200.0;
	}
 	
 	}
 	
 	
	
