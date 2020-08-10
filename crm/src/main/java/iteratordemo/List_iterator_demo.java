package iteratordemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_iterator_demo {

	public static void main(String[] args)
	{
	   LinkedList <String> lst= new LinkedList <String> ();
	   lst.add("ak");
	   lst.add("pat");
	   lst.add("shash");
	   lst.add("hatti");
	   
	   System.out.println(lst);
	   ListIterator <String> litr =lst.listIterator();
	      
	   while(litr.hasNext())
	   
	   {
		   
		   String h=litr.next();
		   if(h.equals("pat"))
		   {
			   litr.remove();
			}
		   else if(h.equals("shash"))
		   {
			   litr.add("ritz");
		   }
		   
		   else if(h.equals("hatti"))
		   {
			   litr.set("kalajamun");
		   }
		   
		   }
	   System.out.println(lst);
	   litr.hasPrevious();
	   litr.remove();
	   System.out.println(lst);
	}

}
