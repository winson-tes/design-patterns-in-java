package bridge;

public class Facebook implements Website {
    String name = "Facebook";

    @Override
    public String getName() {
        return name;
    }
}
