import org.junit.Rule;
import org.junit.Test;
import org.sql2o.Connection;

import static org.junit.Assert.*;

public class OtherAnimalTest {
    @Rule
    public DatabaseRule databaseRule = new DatabaseRule();

    @Test
    public void OtherAnimal_instantiatesCorrectly_OtherAnimal(){
        OtherAnimals otherAnimal = new OtherAnimals("Zebra","other animal");
        assertTrue(otherAnimal instanceof OtherAnimals);
    }
    @Test
    public void getName_OtherAnimalInstantiatesWithName_String(){
        OtherAnimals otherAnimal = new OtherAnimals("Zebra","other animal");
        assertEquals("Zebra", otherAnimal.getName());
    }
    @Test
    public void save_createsRecordInDb_String(){
        OtherAnimals otherAnimal = new OtherAnimals("Zebra","other animal");
        otherAnimal.save();
        try(Connection conn = DB.sql2o.open()){
            String sql = "SELECT * FROM animals";
            OtherAnimals savedOtherAnimal = conn.createQuery(sql)
                    .executeAndFetchFirst(OtherAnimals.class);

            assertEquals("Zebra", savedOtherAnimal.getName());

        }
    }
    @Test
    public void all_returnsAllInstancesOfOtherAnimalsInDb_List(){
        OtherAnimals otherAnimal = new OtherAnimals("Zebra","other animal");
        otherAnimal.save();
        OtherAnimals secondOtherAnimal = new OtherAnimals("Zebra","other animal");
        secondOtherAnimal.save();
        assertEquals(2, OtherAnimals.all().size());
    }
}
