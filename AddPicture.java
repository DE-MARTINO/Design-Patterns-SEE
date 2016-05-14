 	class AddPicture implements Shirt
 	{
 	protected Shirt plainshirtobject;
 	String pic;
 	public AddPicture( Shirt sap, String picture )
 	{
 		plainshirtobject = sap;
 		pic = picture;
 		
 	}	
 		
 	public String gettype()
 	{
 	 	return plainshirtobject.gettype() + " , " + pic;
 	}
 	
 	public double getcost()
	{
		 return plainshirtobject.getcost()+150.0;
	}
 	
 	}
 	
 	
