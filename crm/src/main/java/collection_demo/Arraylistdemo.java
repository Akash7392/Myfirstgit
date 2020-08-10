package collection_demo;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) 
	{
	
		ArrayList <String> ar = new ArrayList<String>();
		
		ar.add("first");
		ar.add("second");
		ar.add("third");
		ar.add("fourth");
	//	ar.remove("first");
	//	ar.remove(1);
	//	ar.removeAll(ar);
	    ar.set(1, "pyar");
	   boolean d= ar.contains("salman");
	   
	   ar.forEach(e -> System.out.println(e));
	    System.out.println(ar.size());
		System.out.println(ar.get(1));            ////////////to get the object from particular list retrieve
		
	  System.out.println(ar);
	  System.out.println(d);
	}
}
