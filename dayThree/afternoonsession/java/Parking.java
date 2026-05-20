import java.util.Scanner;

public class Parking{



  

public static String parkingLot(int slotnumber,int add,int remove, int [] array){

 String status ="";

for(int index=0; index<array.length; index++){
    
    if(array[slotnumber]==0 && add==1){
        array[slotnumber]=1;
        status+="slotnumber "+slotnumber+" is now occupied";
        break;

     }else if(array[slotnumber]==1 && add==1){
       status+= "slotnumber is occupied you can't add";
        break;
     }

    if(array[remove]==1){
   array[slotnumber]=0;
   status+="it is no longer occupied";
    break;
}


 }
    




return status;

}












}
