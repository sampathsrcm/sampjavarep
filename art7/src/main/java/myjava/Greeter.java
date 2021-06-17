package myjava;

public class Greeter {
	
	
	public Greeter() {
	
		
	}


	 public String greet(String someone) {
		 
		 if (someone == null ) {
			 System.out.println("The variable is null");
		 } else {
		 
		 System.out.println("someone in greeter" + someone);
		//return String.format("Hello , %s!",someone);
		 }
		 return someone;
		 
	 }
}
