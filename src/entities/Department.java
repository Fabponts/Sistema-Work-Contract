package entities;

public class Department {
    //Attributes
    private String name;

    //Constructors
    public Department(){
    }
    public Department(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
