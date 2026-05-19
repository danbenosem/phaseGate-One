import java.util.Scanner;

public class LargestThree{


public static void main (String [] args){

    Scanner inputCollector= new Scanner(System.in);


    System.out.print("enter the  first number:");

  int firstNumber = inputCollector.nextInt();


 System.out.print("enter the  second number:");

  int secondNumber = inputCollector.nextInt();

 System.out.print("enter the  third number:");

  int thirdNumber = inputCollector.nextInt();


int maximum=0;

 if(firstNumber>secondNumber && firstNumber>thirdNumber){

  maximum= firstNumber;
System.out.printf("%d is the largest", maximum);
 

} 


else  if(secondNumber>firstNumber && secondNumber>thirdNumber){

  maximum= secondNumber;
System.out.printf("%d is the largest", maximum);
 

} 

else {

 maximum= thirdNumber;

System.out.printf("%d is largest", maximum);

}









}
















}
