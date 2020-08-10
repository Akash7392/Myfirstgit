package iteratordemo;

import java.util.LinkedList;

public class Enhance_with_collection {

	public static void main(String[] args)
	{
	   LinkedList <String> st = new LinkedList <String> ();
	     st.add("akash");
	     st.add("akash1");
	     st.add("akash2");
	     st.add("akash3");
    
	
	for (Object s : st)
	{
		System.out.println(s);
	}

	}
}
