import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test //Test for at se om man kan gå øst med vores setEast metode.
    public void connect_To_East_Room(){
        Room room1 = new Room ("test1", "test2");
        Room room2 = new Room ("test3", "test4");
        room1.setEast(room2);
        assertEquals(room2,room1.getEast());
    }




}
