package observer;

import java.util.Date;

public class MacComputer implements Computer {
    private Date date;

    @Override
    public void update(Object date) {
        this.setDate((Date) date);
    } 

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}