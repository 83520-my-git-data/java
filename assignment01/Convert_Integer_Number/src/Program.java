/*
 Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())
 */





import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		
		int num;
		
		System.out.println("Java test: ");
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		
		System.out.println("Given number : "+num);
		
		System.out.println("Binary Equivalent : "+Integer.toBinaryString(num));
		
		System.out.println("Octal Equivalent : "+Integer.toOctalString(num));
		
		System.out.println("Hexadecimal equivalent : "+Integer.toHexString(num));		
		
		
		sc.close();

	}

}
