package regularexpression;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regular {
	public static void main(String args[]) {
		Pattern p = Pattern.compile("home");
		Matcher m = p.matcher("home sweet home");
		while (m.find()) {
	      	System.out.println("Pattern found from " +m.start() + " to "+(m.end()-1));
		}

	}
	

}
