package command;

import command.exceptions.InsufficentFundsException;

public class Account { 
    private int amount;

    public Account(int amount){
        this.amount = amount;
    }

    public Boolean deposit(int amount) {
        this.amount = this.amount + amount;
        System.out.println("Depositing..." + " :: Amount: " + amount + " :: New Balance: " + this.amount);
        return true;
    }
    
    public Boolean withdraw(int amount) throws InsufficentFundsException {
        if (this.amount - amount < 0) {
            System.out.println("Withdrawing..." + " :: Failed :: New Balance: " + this.amount);
            throw new InsufficentFundsException();
        }

        this.amount = this.amount - amount;
        System.out.println("Withdrawing..." + " :: Amount: " + amount + " :: New Balance: " + this.amount);
        return true;
    }
}