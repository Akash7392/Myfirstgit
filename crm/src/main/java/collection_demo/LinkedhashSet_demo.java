package collection_demo;

import java.util.LinkedHashSet;

public class LinkedhashSet_demo {

	public static void main(String[] args)
	{
		LinkedHashSet <String> lhs =new LinkedHashSet<String>();
		lhs.add("amrerika");
		lhs.add("paris");
		lhs.add("berlin");
		lhs.add("london");
		lhs.add("7");
		
		
		LinkedHashSet <String> lhs1 =new LinkedHashSet<String>();
		lhs1.add("8");
		lhs1.add("9");
		
		lhs.addAll(lhs1);
		
		
		
		System.out.println(lhs);

	}

}
