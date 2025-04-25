class TestBitwiseOperators{
	public static void main(String args[]){
		int a = 12, b = 25, c = 35, d = 2;
		int andResult, orResult, xorResult, notResult, leftShiftResult, rightShiftResult;
		
		andResult = a & b;
		orResult = a | b;
		xorResult = a ^ b;
		notResult = ~ c;
		leftShiftResult = d<<1; // to shift by 1 digit
		rightShiftResult = d>>1;		

		System.out.println("AND Result : " + andResult);
		System.out.println("OR Result : " + orResult);
		System.out.println("XOR Result : " + xorResult);
		System.out.println("NOT Result : " + notResult);
		System.out.println("Left Shift Result : " + 			leftShiftResult);
		System.out.println("Right Shift Result : " + 			rightShiftResult);
	}
}

/*
Output:

AND Result : 8
OR Result : 29
XOR Result : 21
NOT Result : -36
Left Shift Result : 4
Right Shift Result : 1

*/
