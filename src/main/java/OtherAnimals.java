import org.sql2o.Connection;

import java.util.List;

public class OtherAnimals extends Animal implements AnimalManagement {

    public OtherAnimals(String name, String type){
        this.name = name;
        this.type = type;
    }
    public static List<OtherAnimals> all(){
        try(Connection conn=DB.sql2o.open()){
            String sql = "SELECT * FROM animals WHERE type=:type";
            return conn.createQuery(sql)
                    .addParameter("type", "other animal")
                    .executeAndFetch(OtherAnimals.class);
        }
    }

}
