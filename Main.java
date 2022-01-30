import java.util.Scanner;
class Main {
public static void main (String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter first no. ");
int first = scan.nextInt();
System.out.print("Enter second no. ");
int second = scan.nextInt();
int temp = first;
first = second;
second = temp;
System.out.print("After swapping first no. is "+first+" Second no. is "+second);
scan.close();
}
}