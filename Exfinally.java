class Exfinally
{
	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			int b=0;
			int hasil=a/b;
		}
		catch(Exception e){
			System.out.println("Error : "+e.getMessage());
		}
		finally{
			System.out.println("Finished");
		}
	}	
}