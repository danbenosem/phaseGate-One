

import java.util.Arrays;


import java.util.ArrayList;
public class Duplicate{

public static void main( String [] args ){

int [] array1 = {9,5,1,9,4,5,1,7};

int[] array2= items(array1);

for (int number:array2){

    System.out.print(number);
};

}



public static int [] items(int [] array){

int sum=0;

ArrayList<Integer> items= new ArrayList<>(); 

    for(int index=0; index<array.length; index++){

        for(int index2=index; index2<array.length; index2++){
                
                
                if(array[index]==array[index2]){
                        

                       if (array[index]!=items.get(index2)){
                        
            
                    items.add(array[index]);
                       
                   }
                     
                   
                        

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
