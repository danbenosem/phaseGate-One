import java.util.Arrays;
import java.util.ArrayList;
public class TargetTwo{



public static int [] items(int [] array, int number){

int sum=0;

ArrayList<Integer> items= new ArrayList<>(); 

    for(int index=0; index<array.length; index++){

        for(int index2=index+1; index2<array.length; index2++){
                
                sum= array[index]+ array[index2];
                if(sum==number){
                        


                        
            
                    items.add(array[index]);
                   items.add(array[index2]);
                     
                   
                        break;

         }//if1
   
  
          }//for2
     

    }//for1


int size = items.size();
int []nArr= new int[size];
for(int index=0; index<nArr.length; index++){

  nArr[index]=items.get(index);

}

return nArr;



}//public




















}
