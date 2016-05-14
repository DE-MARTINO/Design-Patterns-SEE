	class printText implements Shirt
 	{
 	protected Shirt plainshirtobject;
 	String text;
 	public printText( Shirt sap, String txt )
 	{
 		plainshirtobject = sap;
 		text = txt;
 		
 	}	
 		
 	public String gettype()
 	{
 	 	return plainshirtobject.gettype() + " , " + text;
 	}
 	
 	public double getcost()
	{
		 return plainshirtobject.getcost()+50.0;
	}
 	
 	}
 	
 	
