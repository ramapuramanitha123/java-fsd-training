class NestedTryBlockException
{
	public static void main(String[] args)
	{


		try
		{
	                 try
                                  { 
                                               String str=null;
		                System.out.println(str.length());
			
			}
			catch(NullPointerException e)
			{
				System.out.println("NullPointerException");
			}
			catch(NumberFormatException e)
			{
				System.out.println("NumberFormatException ");
			}

			Float x=Float.parseFloat("28.xyz");
		}
		catch(NullPointerException e)
			{
				System.out.println("NullPointerException");
			}
			catch(NumberFormatException e)
			{
				System.out.println("NumberFormatException ");
			}
		
	}


}