//  A program which shows your variables store even/odd number//
import java.util.Scanner;
class evenodd{
public static void main(String[]arg){
int number;
Scanner obj=new Scanner(System.in);
System.out.println("Enter any number to check weather even or odd:");
number=obj.nextInt();
if(number%2==0)
{
System.out.println("Given Number is Even");
}
else
{
System.out.println("given number is odd");
}}}