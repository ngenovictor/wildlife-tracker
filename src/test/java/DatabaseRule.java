import org.junit.rules.ExternalResource;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DatabaseRule extends ExternalResource{
    @Override
    protected void before(){
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "kingkong", "m1@467net");
    }
    @Override
    protected void after(){
        try(Connection conn = DB.sql2o.open()){
            String sql = "DELETE FROM animals *";
            conn.createQuery(sql)
                    .executeUpdate();

        }
    }


}
