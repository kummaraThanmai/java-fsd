package maps;

import java.util.*;

public class Mapsex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashmap
				Map<Integer,String> hash=new HashMap<Integer,String>();      
			      hash.put(100,"anu");    
			      hash.put(200,"amu");    
			      hash.put(300,"alu");   
			      for(Map.Entry m:hash.entrySet()) {
			    	  System.out.println(m.getKey()+" "+m.getValue());
			      }
			      
			  		//Tree Map
			  				Map<Integer,String> tm=new TreeMap<Integer,String>();      
			  			      tm.put(800,"anju");    
			  			      tm.put(500,"mouni");    
			  			      tm.put(700,"kathe");   
			  			      for(Map.Entry t:tm.entrySet()) {
			  			    	  System.out.println(t.getKey()+" "+t.getValue());
			  			      }


	}

}
