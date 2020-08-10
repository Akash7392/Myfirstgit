package collection_demo;

import java.util.HashSet;

public class HashSet_demo {

	public static void main(String[] args)
	{
		HashSet <String> hs= new HashSet <String> ();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("fourth");
		hs.add("fourth");
		hs.add("7");
		hs.hashCode();
		
		HashSet <String> hs1= new HashSet <String> ();
		hs.add("first1");
		hs.add("second2");
		hs.add("third3");
		hs.add("fourth4");
		hs.add("fourth5");
		hs.addAll(hs1);
		
	
		System.out.println(hs);
    }

}
