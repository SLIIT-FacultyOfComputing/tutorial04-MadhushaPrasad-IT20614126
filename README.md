
![logo](/Resources/tutelogo.png)

## <div align="center">Tutorial 02</div>

## Objectives : Abstract Classes and Interfaces




## Exercise 1 

```
interface IDisplay {
 void print(); // Print in one line
 void printDetails(); // Print in multiple Lines
}
interface IInput {
 void input();
}
```
i. Implement a class called Book with properties bookID, title, publisher which uses the interfaces IDisplay and IInput.

ii. Implement a class called Student with properties studentID, and name which uses the interfaces IDisplay and IInput.

iii. Create objects of the Book and Student in the main method.

iv. Create a variable of the IDisplay and IInput interfaces and call the printDetails() and input() methods respectively of Book and Student objects.

## Exercise 2 

**Q1.  Account class**

i. Implement an abstract class called Account. Have the following properties accountNo, name, balance.

ii.  Implement a Deposit() method to deposit money. The amount deposited should update the balance.

iii. Implement a constructor to get values to the Account class.

iv. Have an abstract method called calculateInterest() which returns a double value.

v.  Implement a method to display() the account details.

**Q2.  FixedDepositAccount class**

i. Implement a new class called FixedDepositAccount which extends the Account class.

ii. It should have a new property called interestRate and Interest.

iii. Write a setter and getter for the interestRate.

iv. Implement the calculateInterest() method assuming that the Balance has been held for the entire year. 
```interest = balance * interestRate/100;```


**Q3.SavingsAccount Class**
i. Implement a new class called SavingAccount which inherits the FixedDepositAccount class.

ii. Implement a withdraw() method that allows you to withdraw money from the SavingsAccount.

iii. Implement the calculateInterest() method assuming that the Balance has been held for the one Month. 
```Interest = balance * interestRate/100/12;```

**Q4. Create objects from the FixedDeposit and SavingAccount. Call the Deposit() and withdraw() methods (Only SavingsAccount have withdrawals)**
