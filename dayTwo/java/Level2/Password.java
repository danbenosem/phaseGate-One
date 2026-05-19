import java.util.Scanner;

public class Password{


public static void main (String [] args){

    Scanner inputCollector= new Scanner(System.in);


    System.out.print("enter the password:");

   String password = inputCollector.nextLine();

 if(password.equals("admin123")){

System.out.println("Validated");

} else{

System.out.println("Not Validated");

}










}
















}
