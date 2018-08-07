/*
 SOLID Design Principles.
 1. Single Responsibility Principle - The S in SOLID
 Single Responsibility Principle as described here-- https://dzone.com/articles/solid-design-principles-explained-the-single-respo

Is this principle realistic, in that, would you define a class for getters (get()) and a different class for setters (set()) for the same
kind of business object? Asked in the way of an example: 

Business Object: :Account. Simple requirements on the account object could be to set attributes like
 accoutNumber, name,  balance, status, numberOfDefaults, etc.

The question being asked is, if you want to be able set and get values from an :Account business object, would you define two Single
 Responsibility classes, e.g.  AccountInfoGetter and AccountInfoSetter; which would then house the relevant getter and setter methods?
*/

protected class Account{
    protected long accountNumber;
    protected String accountHolderName;
    protected float balance;
    protected float interestRate;
    protected short numberOfDefaults;
}
 // All setters are given minimal logic, no parameter tests.
protected class AccountInfoSetter{
   
    protected void setAccNumber(Accout acc, long accNumber){
        acc.accNumber = accNumber;
    }
    protected void setAccHolderName(Account acc, String accHolderName){
        acc.accountHolderName = accHolderName;
    }
    protected void setBalance(Account acc, float newBalance){
        acc.balance = newBalance;
    }
    protected void setInterestRate(Account acc, float interestRate){
        acc.interestRate = interestRate;
    }
    protected void setNumberOfDefaults(Account acc, short numDefaults){
        acc.numberOfDefaults = numDefaults;
    }
}

protected class AccountInfoGetter {
    protected void getAccNumber(Accout acc){
        return acc.accNumber;
    }
    protected void setAccHolderName(Account acc){
        return acc.accountHolderName;
    }
    protected void setBalance(Account acc){
        return acc.balance;
    }
    protected void setInterestRate(Account acc){
        return acc.interestRate;
    }
    protected void setNumberOfDefaults(Account acc){
        return acc.numberOfDefaults;
    }
}