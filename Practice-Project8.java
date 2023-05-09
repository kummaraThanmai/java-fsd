
public class Stringsex {
	
	public static void main(String[] args) {
		
		String str1=new String("Hello java");
		System.out.println(str1.length());
		System.out.println(str1.substring(2)); //substring
		//String Comparison
		String str3="java";
		String str2="java";
		System.out.println(str3.compareTo(str2));

		
		System.out.println(str1.toLowerCase()); //toLowerCase
		
		
		
		String replace=str1.replace('j', 'l'); //replace
		System.out.println(replace);

		
		
		System.out.println(str2.equals(str3)); //equals
 
		
		//Creating StringBuffer 
		StringBuffer buffer=new StringBuffer("hello");
		buffer.append("java");
		System.out.println(buffer);

		
		
		//StringBuilder
	
		StringBuilder builder=new StringBuilder("good");
		builder.append("evening");
		System.out.println(builder);

		
				
		//conversion
		
		String str = "java"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer b = new StringBuffer(str); 
        b.reverse(); 
        System.out.println(b); 
          
        // conversion from String object to StringBuilder 
        StringBuilder bd = new StringBuilder(str); 
        bd.append("learning"); 
       
        System.out.println(bd);              		
	}
}




