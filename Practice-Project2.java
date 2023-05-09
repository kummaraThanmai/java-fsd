
//default and private

package accessmodifiers;

 class defaultex {
	  void display() 
	     { 
	         System.out.println("default access"); 
	     } 
}
class privateex 
{ 
   private void display1() 
    { 
        System.out.println(" private access"); 
    } 
} 

class tester{

	public static void main(String[] args) {
		
				//default
				System.out.println("Dafault Access ");
				defaultex  obj1 = new defaultex (); 		  
		        obj1.display(); 
		      //private
				System.out.println("Private Access");
				privateex  obj2 = new privateex(); 
				//obj2.display1();

			}
	}



//protected and public

package protetedex;


class Animal {

		//protected method
		protected void display3() 
	    { 
	        System.out.println("animal--protected"); 
	    } 
		//public method
		public void display4() {
			System.out.println("animal--public"); 
			
		}

}
class Dog extends Animal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
		dog.display3();
		Animal dog1 = new Animal();
		dog1.display4();
		
}
}




