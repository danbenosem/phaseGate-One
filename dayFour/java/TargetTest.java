import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class TargetTest{



    @Test
    public void TestThatNormalNUmbersWork(){

        int [] array=  {8,-2,4};
        

        int[] expected= {8,-2};
    
        

        assertArrayEquals(Target.array(array,6),expected);




 }



    @Test
    public void TestThatPOsitiveNUmbersWork(){

        int [] array=  {8,4,2};

        int[] expected= {8,2};
    
        

        assertArrayEquals(Target.array(array,10),expected);




 }






}
