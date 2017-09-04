import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void Animal_instantiates_correctly(){
        Animal spottedAnimal = new Animal("zebra");
        assertTrue(spottedAnimal instanceof Animal);
    }
}
