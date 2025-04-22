class TestDataTypes{
byte b = 120;
short s = 21346;
int i = 60124;
long l = 1234568910;
float f = 5.5f;
double d = 1234.1234;
char c = 'a';
boolean b1 = true;

public void display(){
System.out.println("byte b = " + b + 
"\nshort s = " + s +
"\nint i = " + i +
"\nlong l = " + l +
"\nfloat f = " + f +
"\ndouble d = " + d +
"\nchar c = " + c +
"\nboolean b1 = " + b1);
}

public static void main(String args[]){
TestDataTypes td1 = new TestDataTypes();
td1.display();
}
}

/*
Output - 
byte b = 120
short s = 21346
int i = 60124
long l = 1234568910
float f = 5.5
double d = 1234.1234
char c = a
boolean b1 = true
*/

