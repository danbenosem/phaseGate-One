import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 

public class LikeTest {

    @Test
    public void testThatItShowsForEmptyOutput() {
    
    String [] array ={""};
       
     String expected= " no one likes this";


    String actual = Like.Like(array);


   assertEquals(expected,actual);
}

  @Test
    public void testThatItShowsForOneOutput() {
    
    String [] array ={"dan"};
       
     String expected= "dan likes this";


    String actual = Like.Like(array);


   assertEquals(expected,actual);
}


   



}
