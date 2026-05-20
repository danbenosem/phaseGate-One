import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class ParkingTest {

    @Test
    public void testThatYouCannotADD() {
    int [] array ={1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0};
     String expected = "slotnumber is occupied you can't add";
       
        assertEquals(expected, Parking.parkingLot(1,1,0,array));


}
     @Test
    public void testThatYouHaveNowOccupied() {
    int [] array ={1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0};
     String expected = "slotnumber 7 is now occupied";
       
        assertEquals(expected, Parking.parkingLot(7,1,0,array));

}

  @Test
    public void testThatItIsNoLongerOccupied() {
    int [] array ={1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0};
     String expected = "it is no longer occupied";
       
        assertEquals(expected, Parking.parkingLot(7,0,1,array));

}









}


