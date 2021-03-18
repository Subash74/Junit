
public class Calculator {

	
	 int num1,num2;
	Calculator(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	int Add() {
		System.out.println("Adding 2 number");
		return num1 + num2;
	}
	
	int Sub() {
		System.out.println("Subtracting 2 number");
		return num1 - num2;
	}
	
	int Div() {
		System.out.println("Dividing 2 number");
		return num1 / num2;
	}
	/**
	 * check if the number are both less than 10
	 * @return
	 */
	boolean validate()
	{
		System.out.println("Validatng 2 number");
		if (num1<10 && num2<10)
			return true;
		else
		    return false;
	}
	void clearMemory ()
	{
		
	System.out.println("Clean the memory before method is run");
	}
	
	void reset()
	{
		System.out.println("Clean the memory after method is run");
	}
	void allocatememory() {
		System.out.println("Allocate the memory before any method is run ");
	}
	void releasememory() {
		System.out.println("Releases the memory after any method is run ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num1,num2;
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}

}
