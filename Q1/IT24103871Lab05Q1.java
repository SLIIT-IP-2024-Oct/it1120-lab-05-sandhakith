import java.util.Scanner;
public class IT24103871Lab05Q1{
public static void main (String [] args){
 Scanner input = new Scanner (System. in);

 int num1,num2,num3;

 System.out.print("insert num1 :");
 num1=input.nextInt();

System.out.print("insert num2 :");
num2=input.nextInt();

System.out.print("insert num3 :");
num3=input.nextInt();

System.out.println("input numbers are :"+num1+" "+num2+ " "+ num3+ "");

int large=num1;

if(num2>large){
    large=num2;
}
if(num3>large){
   large=num3;
}


int lowest=num1;

if(num2<lowest){
    lowest=num2;
}
if(num3<lowest){
    lowest=num3;
}


System.out.println("largest number is :"+ large);
System.out.println("lowest number is :"+ lowest);






}




}