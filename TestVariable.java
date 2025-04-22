class TestVariable{
	//static int number = 10;
	//static String name = "Ram";

	int number = 10;
	String name = "Ram";
	
	public void display(){
		System.out.println("Number: " + number + "\nName: " + 		name);
	}	

	public static void main (String args[]){
		//int number = 10;
	 	//String name = "Ram";
		//System.out.println("Number: " + number + "\nName: " + 		name);
		
		TestVariable t1 = new TestVariable();
		t1.display();
	}
}