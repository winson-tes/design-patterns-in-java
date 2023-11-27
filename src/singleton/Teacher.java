package singleton;

public class Teacher {
    private String name;

    private static Teacher instance = new Teacher();
 
    private Teacher(){}
 
    public static Teacher getInstance(){
       return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
 
    public void doSomething(){
       System.out.println(this.name);
    }
}
