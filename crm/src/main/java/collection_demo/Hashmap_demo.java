package collection_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap_demo {

	public static void main(String[] args)
	
	{
		HashMap<String, String> mapd = new HashMap<String, String> ();
		mapd.put("100", "akash");
		mapd.put("101", "sele");
		mapd.put("102", "yesan");
		mapd.put("103", "bajaj");
		
		Set <String> set = mapd.keySet();
		
		for(String s : set)
		{
		   String value =mapd.get(s);
			
		   System.out.println(s +"  "+value);
		}
		
//		for(Map.Entry<String, String> data : mapd.entrySet())
//		{
//			
//			System.out.println("key is ="+data.getKey()+"    " +"value is="+data.getValue());
//			
//		}
		
		
	//	mapd.replace("103","junya");	
		mapd.replace("103", "bajaj", "hamara");
	//	mapd.remove("103","bajaj");
		//mapd.clear();
		
	//	System.out.println(mapd.values());
		
		System.out.println(mapd);
		

	}

}
