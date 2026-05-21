import java.util.Arrays;
public class Target{

    




public static int [] array (int [] array, int number){

int sum=0;

int [] nArr= new int [2];

    for(int index=0; index<array.length; index++){

        for(int index2=index+1; index2<array.length; index2++){
                
                sum= array[index]+ array[index2];
                if(sum==number){
            
                    nArr[1]=array[index];
                    nArr[0]=array[index2];
                    break;

         }

          }
     

    }


return nArr;



}




















}
