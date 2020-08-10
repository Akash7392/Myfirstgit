package iteratordemo;

public class Enhance_for_loop_demo {

	public static void main(String[] args)
	{
		String [] [] st = { {"akash","bantya","bantya3"} ,
				{"akash1","akash2","akash3"},
				{"junay1","junay1","junay1"}};
		
		for(String i[] : st )
		{
			for(String k : i  )
				
			{
				System.out.print("   "+k);
				
			}
		
		System.out.println();
		}
	}

}
