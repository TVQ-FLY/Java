package Cau1;

import java.util.Scanner;

public class BankAccount extends CustomerInfo{

    public BankAccount(String customerName, String customerAdd, String accountNo, String s) {
        super(customerName);
    }

    private CustomerInfo info;
    private String accountNo;
    private double accountBalance;
    private double withdrawNum;
    private double depositNum;
    private double accountInterest;

    public BankAccount(String customerName, String customerAdd, String accountNo, double accountBalance) {
        super(customerName);
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public void inputData() {
        Scanner in = new Scanner(System.in);
        info.inputData();
        System.out.println("Account No: ");
        accountNo = in.nextLine();
        System.out.println("Account Balance");
        accountBalance = in.nextDouble();
    }

    public void doWithdraw() {
        accountBalance -= withdrawNum;
    }

    public void doDeposit() {
        accountBalance += depositNum;
    }

    public double computeMonthInterest() {
        return accountBalance * 0.67;
    }

    public void transferMoney(double number) {
        accountBalance -= number;
    }

    public void receiveMoney(double number) {
        accountBalance += number;
    }

    public void display() {
        System.out.println("Account No: " +accountNo);
        System.out.println("\t+ Account Balance: " +accountBalance);
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getWithdrawNum() {
        return withdrawNum;
    }

    public void setWithdrawNum(double withdrawNum) {
        this.withdrawNum = withdrawNum;
    }

    public double getDepositNum() {
        return depositNum;
    }

    public void setDepositNum(double depositNum) {
        this.depositNum = depositNum;
    }

    public double getAccountInterest() {
        return accountInterest;
    }

    public void setAccountInterest(double accountInterest) {
        this.accountInterest = accountInterest;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNo='" + accountNo + '\'' +
                ", accountBalance=" + accountBalance +
                ", withdrawNum=" + withdrawNum +
                ", depositNum=" + depositNum +
                ", accountInterest=" + accountInterest +
                '}';
    }
}
