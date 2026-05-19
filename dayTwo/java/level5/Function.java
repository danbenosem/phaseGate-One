import java.util.Arrays;

public class Function{


public static void main (String [] args){



int [] array ={5,-9,3,-6,2,-11};

System.out.print(Arrays.toString(NegativeArray(array)));
 


  }



public static int [] NegativeArray(int [] array){

    
int [] newArr= new int[array.length];

for (int index=0; index<array.length; index++){

    if(array[index]<0){

        newArr[index]=0;
    }else{
       newArr[index]=array[index];
}
  
}

return newArr;




}

    

























}
