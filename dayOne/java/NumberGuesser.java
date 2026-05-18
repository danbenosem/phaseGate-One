import java.util.Random;
import java.util.Scanner;
public class NumberGuesser{



public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    Random random= new Random();
 
int randomNum= random.nextInt(101);
 int number=0;
int score=0;

System.out.print("guess the random number");
 randomNum= random.nextInt(101);

int user;
 while (number<6){

 

  user= sc.nextInt();



if (user<randomNum){
    System.out.println("number is lower");
   
   number++;

} else if (user> randomNum){
    System.out.println("number is higer");
  
  number++;
}
else if (user==randomNum){
    System.out.println("it is correct");
    score++;
    number++;
    break;
}

else if (user> 100|| user<1){
    System.out.println(" ERROR");
    
}
else{
 System.out.println("not a number");
 number++;

}

if (number==5){
    break;
}


System.out.println("guess the random number");


 




}

    if (number==1){
    System.out.printf("Final summary is correct number:%d , attempts number: %d%n, ", randomNum, number);
   System.out.print("Rating: Lengendary");
} else   if (number==2){

 System.out.printf("Final summary is correct number:%d , attempts number: %d%n, ", randomNum, number);
   System.out.print("Rating: Excellent");

} else   if (number==3|| number ==4){
 System.out.printf("Final summary is correct number:%d , attempts number: %d%n, ", randomNum, number);
   System.out.print("Rating: Good");

} else   if (number==5){

 System.out.printf("Final summary is correct number:%d , attempts number: %d%n, ", randomNum, number);
   System.out.print("Rating: Close");
}else {
    System.out.printf("Final summary is correct number:%d , attempts number: %d%n, ", randomNum, number);
   System.out.print("Rating: Better Luck");

}

















}
}
