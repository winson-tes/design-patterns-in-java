package bridge;

public class Instagram implements Website {
    String name = "Instagram";

    @Override
    public String getName() {
        return name;
    }
}