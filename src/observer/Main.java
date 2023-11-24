package observer;

import java.util.Date;

class Main {
    public static void main(String[] args) {
        ITService observable = new ITService();
        WindowsComputer windowsComputerObserver = new WindowsComputer();
        MacComputer macComputerObserver = new MacComputer();

        observable.addObserver(windowsComputerObserver);
        observable.addObserver(macComputerObserver);

        observable.setDate(new Date());

        System.out.println("windows computer" + ',' + windowsComputerObserver.getDate());
        System.out.println("mac computer" + ',' + macComputerObserver.getDate());
    }
}