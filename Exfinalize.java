class Exfinalize
{
	public void finalize() throws Throwable
	{
		System.out.println("Tester Object");
	}
	public static void main(String[] args) {
		Exfinalize f=new Exfinalize();
		f=null;
		System.gc();		
	}	
}