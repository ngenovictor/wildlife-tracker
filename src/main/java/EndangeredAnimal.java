import java.sql.Timestamp;

public class EndangeredAnimal extends Animal implements AnimalManagement{
    private String name;
    private int id;
    private String health;
    public static final String HEALTHY="healthy";
    public static final String ILL = "ill";
    public static final String OKAY = "okay";
    public static final String NEWBORN = "newborn";
    public static final String YOUNG = "young";
    public static final String ADULT = "adult";
    public Timestamp dayIdd;


    public EndangeredAnimal(String name){
        this.name = name;
    }

}
