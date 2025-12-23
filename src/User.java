public class User {
    private String name;
    private int age;

    public User(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setValue(String name,int age ){
        this.name=name;
        this.age=age;
    }

    public String getValue(){
        return "Name: " + name + ". Age: " + age;
    }
}
