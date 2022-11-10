//create a program in which user is asked for marks in a respected way//
//matriculation, intermediate and test score where output would be the cpn//
import java.util.*;
class cpn{
public static void main(String[]arg)
{
int matriculation;
int intermediate;
int testresult;
double cpn;
Scanner obj=new Scanner(System.in);
System.out.println("Enter matriculation marks:");
matriculation=obj.nextInt();

System.out.println("Enter intermediate marks:");
intermediate=obj.nextInt();
System.out.println("Enter test marks:");
testresult=obj.nextInt();
cpn=(matriculation/850)*10 +(intermediate/1100)*30 +(testresult /100)*60;
System.out.println("cpn is:"+(cpn));
}}