package collection_demo;

import java.util.LinkedList;

public class LinkedList_demo {

	public static void main(String[] args)
	{
		
		LinkedList <String>ll= new LinkedList<String>();
		ll.add(null);
		ll.add("fir");
		ll.add("sec");
		ll.add("third");
		ll.add("fou");   //////Adding of object
		ll.add("fourth");   /// to add to duplicate
		//ll.remove();       // will remove first one object
		// ll.remove("fourth");  // will remove only last one fourth
	    // 	ll.set(4, "laila");   ///to replace the object		
		ll.add(2, "love");  // at at index 2 ("third") and element "third" will shift to right.
		
		System.out.println(ll.size());   //////counting of object  
		System.out.println(ll);
	

	}

}
