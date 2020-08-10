package stringtest;

public class Test_strings {

	public static void main(String[] args) 
	{
		String s="I love selenium";
		String g = "i love selenium";
		
		String y = "i_love_selenium";
		
		String ty[]=y.split("_");
		
		for(int i=0; i<=ty.length; i++)
		{
			System.out.println("string status=" +ty[i] );
		}
		//boolean h=s.equalsIgnoreCase(g);
		
	//	boolean b=s.equals(g);
	//	System.out.println("string status=" +h );

}

}
