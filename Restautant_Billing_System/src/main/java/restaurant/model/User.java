package restaurant.model;

public class User {
    private String name;
	private long mob;

    public User(String name,long mob){
        this.name=name;
        this.mob=mob;
    }
    public String getName(){
        return name;
    }
    public long getMob(){
        return mob;
    }
}
