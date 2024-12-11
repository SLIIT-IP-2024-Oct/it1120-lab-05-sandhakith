import java.util.Scanner;
public class IT24103871Lab05Q2{
public static void main(String[]args){
 Scanner input= new Scanner (System.in);
int type;
 System.out.println("count of intoduced");
type=input.nextInt();
if (type>=0){
         switch(type){

            case 0 : System.out.println("No Prize");
            break;
            case 1 : System.out.println("Pen");
            break;
            case 2 : System.out.println("Umbrella");
            break;
            case 3 : System.out.println("Bag");
            break;
            case 4 : System.out.println("Travelling Chair");
            break;
            default : System.out.println("Headphone");
      

         }
        }
else
{System.out.println("Not Valid");}







}


}