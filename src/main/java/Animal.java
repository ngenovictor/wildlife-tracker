import org.sql2o.Connection;

import java.util.List;

public abstract class Animal{
    public int id;
    public String name;
    public String type;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void save(){
        try(Connection conn=DB.sql2o.open()){
            String sql = "INSERT INTO animals (name, type) VALUES (:name, :type)";
            this.id = (int) conn.createQuery(sql,true)
                    .addParameter("name",this.name)
                    .addParameter("type", this.type)
                    .executeUpdate()
                    .getKey();
        }
    }



}
