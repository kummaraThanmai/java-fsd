package typecasting;

//implicit type casting

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte i = 50;
		short j = i;
		int k =j;
		long l =k;
		float m =l;
		double n = m;
		System.out.println("byte value:" +i);
		System.out.println("short value:" +j);
		System.out.println("int value:" +k);
		System.out.println("long value:" +l);
		System.out.println("float value:" +m);
		System.out.println("double value:" +n);
		

	}

}
//explicit type casting

package explicittypecasting;

public class Explicittypecasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d =75.0;
		float f =(float)d;
		long l = (long)f;
		int i = (int)l;
		short s =(short)i;
		byte b = (byte)s;
		System.out.println("double value:" +d);
		System.out.println("float value:" +f);
		System.out.println("long value:" +l);
		System.out.println("int value:" +i);
		System.out.println("short value:" +s);
		System.out.println("byte value:" +b);
		

	}

}

