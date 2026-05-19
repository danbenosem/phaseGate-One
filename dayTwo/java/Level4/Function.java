import java.util.Scanner;

public class Function{


public static void main (String [] args){


System.out.println(add(1,2));

even(2);

System.out.println(square(2));

System.out.println(celsius(2));

System.out.println(rectangle(2,3));

prime(10);

System.out.println(interest(2,3,4));

System.out.println(maximum(2,3,4));


}

public static int add(int firstNum,int secondNum){


   return firstNum + secondNum;

}

 

public static void even(int number){


   if(number%2==0){
     System.out.println("it is even");
    
}else{
  System.out.println("it is not even");
}

}


public static int square(int number){


   return number*number;

}



public static double celsius(int number){

   

     double fah = (number * 9/5) + 32;

  return fah;




}

  
    
public static int rectangle(int length, int width){

   

     int area = length * width;

  return area;




}


public static void prime(int number){

   boolean isbool=true;

   for(int index=2; index<number; index++){
      
    if (number% index==0){
        isbool= false;
      System.out.println("not prime");
        break;
      
      
    }

   
   
}

   if (isbool==true){

  System.out.println("prime");
   }


}





public static double interest(double principal, double rate, double time){


double simple= (principal * rate * time)/100;

return simple;



}



public static int maximum(int firstNum, int secondNum, int thirdNum){

    int maximum=0;

    if(firstNum>maximum){

        maximum = firstNum;
    
}

  if(secondNum>maximum){

        maximum = secondNum;
    
}


  if(thirdNum>maximum){

        maximum = thirdNum;
    
}


return maximum;






}



  

  
























}
