package observer;

import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class ITService {
    private Date date;
    private List<Computer> computers = new ArrayList<>();

    public void addObserver(Computer computer) {
        this.computers.add(computer);
    }

    public void removeObserver(Computer computer) {
        this.computers.remove(computer);
    }

    public void setDate(Date date) {
        this.date = date;

        for (Computer computer : this.computers) {
            computer.update(this.date);
        }
    }
}