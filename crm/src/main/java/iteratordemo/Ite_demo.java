package iteratordemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Ite_demo {

	public static void main(String[] args) {
	
		ArrayList <String> ar = new  ArrayList<String>();
		ar.add("Akash");
		ar.add("yes");
		ar.add("bajaj");
		ar.add("78");
		Iterator<String> ir = ar.iterator();
		
		
        while(ir.hasNext())
        {
		
        	
		System.out.println(ir.next());
	
        }
	}

}
