class Exfinal
{
	final int value=10;
	public static final int BOXWIDTH=6;
	static final String TITLE="Manager";
	public void tukarValue()
	{
		value=36;
	}
	public  void tampilValue()
	{
		System.out.println(value);
	}
	public static void main(String[] args) {
		Exfinal f=new Exfinal();
		f.tukarValue();
		f.tampilValue();
	}	
}