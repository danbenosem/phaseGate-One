import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class TargetTwoTest{



    @Test
    public void TestThatNormalNUmbersWork(){

       int [] array= {8,-2,3,3,4,1,2} ;
        

        int[] expected= {8,-2,3,3,4,2};
    
        

        assertArrayEquals(TargetTwo.items(array,6),expected);




 }









}
