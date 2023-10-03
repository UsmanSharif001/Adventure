import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test //Test for at se om man kan gå øst med vores setEast metode.
    public void connect_To_East_Room(){
        Room usmanVærelse = new Room ("test1", "test2");
        Room room2 = new Room ("test3", "test4");
        usmanVærelse.setEast(room2);
        assertEquals(room2,room2);
    }

}


//    public void openCrate() {
//        assertTrue();
//    }
// assertfalse - forventer fejl f. eks at rykke til nord fra rum 1-2-3