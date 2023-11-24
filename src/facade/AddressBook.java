package facade;

public class AddressBook {
    String firstLine;

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public void clearAll() {
        this.firstLine = "__REMOVED__";
    }
}
