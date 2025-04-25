class TestAssignmentOperators {
	public static void main(String args[]){
		int a = 4;
		int var = a;
		
		
		System.out.println("var using =:" + var);
		System.out.println("var using +=:" + (var += a));
		System.out.println("var using -=:" + (var -= a));
		System.out.println("var using *=:" + (var *= a));
		System.out.println("var using /=:" + (var /= a));
		System.out.println("var using %=:" + (var %= a));
	}
}