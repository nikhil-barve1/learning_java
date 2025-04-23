class TestCommandLineArguments{
	public static void main(String args[]){
		int age;
		String name;
		double amount;
		
		age = Integer.parseInt(args[0]);
		name = args[1];
		amount = Double.parseDouble(args[2]);
		
		System.out.println("Age: "+ age);
		System.out.println("Name: "+ name);
		System.out.println("Amount: "+ amount);
	}
}
