package Cau1;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class MainApp {
    private Hashtable<String, BankAccount> accountList;

    public MainApp() {
        accountList = new Hashtable<>();

        BankAccount acc1 = new BankAccount("Hoang Ngoc Giang", "Ha Tinh", "36729", 880340);
        BankAccount acc2 = new BankAccount("Phan Thi Cuc", "NA", "22222", 2842001);
        BankAccount acc3 = new BankAccount("Hoang Ngoc Giang 2", "Ha Tinh", "4457297", 380340);
        BankAccount acc4 = new BankAccount("Hoang Ngoc Giang 3", "Ha Tinh", "9867298", 480340);

        accountList.put(acc1.getAccountNo(), acc1);
        accountList.put(acc2.getAccountNo(), acc2);
        accountList.put(acc3.getAccountNo(), acc3);
        accountList.put(acc4.getAccountNo(), acc4);
    }

    public void display() {
        Enumeration<BankAccount> values = accountList.elements();
        while (values.hasMoreElements()) {
            BankAccount acc = values.nextElement();
            acc.display();
            System.out.println("\t+ Account Name: " +acc.getName());
            System.out.println("\t+ Account Address: " +acc.getAdd());
        }
    }

    public void transferSimulation(String accNo1, String accNo2, double transferNumber) {
        Enumeration<String> keys = accountList.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            if (key.equals(accNo1)) {
                //accountList.get(key).setAccountBalance(accountList.get(key).getAccountBalance() - transferNumber);

                if (accountList.get(key).getAccountBalance() < transferNumber) {
                    System.out.println("ERROR so du tai khoan khong du de thuc hien giao dich");
                    break;
                }
//                BankAccount acc = accountList.get(key);
//                acc.transferMoney(transferNumber);
//                accountList.remove(key);
//                accountList.put(acc.getAccountNo(), acc);
                accountList.get(key).transferMoney(transferNumber);
                accountList.get(key).display();
            }
            if (key.equals(accNo2)) {
                //accountList.get(key).setAccountBalance(accountList.get(key).getAccountBalance() + transferNumber);
//                BankAccount acc = accountList.get(key);
//                acc.receiveMoney(transferNumber);
//                accountList.remove(key);
//                accountList.put(acc.getAccountNo(), acc);
                accountList.get(key).receiveMoney(transferNumber);
                accountList.get(key).display();
            }
        }
    }

    public void withDrawSimulation(String accNo, double transferNumber) {
        Enumeration<String> keys = accountList.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            if (key.equals(accNo)) {
                if (accountList.get(key).getAccountBalance() < transferNumber) {
                    System.out.println("So du tai khoan khong du de thuc hien giao dich!");
                    break;
                }
                accountList.get(key).transferMoney(transferNumber);

            } else System.out.println("Tai khoan khong ton tai");
        }
    }

    public void depositSimulation(String accNo, double transferNumber) {
        Enumeration<String> keys = accountList.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            if (key.equals(accNo)) {
                if (accountList.get(key).getAccountBalance() < transferNumber) {
                    System.out.println("So du tai khoan khong du de thuc hien giao dich!");
                    break;
                }
                accountList.get(key).receiveMoney(transferNumber);
                accountList.get(key).display();
            }
        }
    }




    public static void main(String[] args) {
        MainApp ma = new MainApp();
        System.out.println("\n\n-----In danh sach tai khoan-----");
        ma.display();

        System.out.println("\n\n-----Chon 2 tai khoan de chuyen tien-----");
        ma.transferSimulation("22222", "36729", 100000);

        System.out.println("\n\n-----Chon 1 tai khoan de rut tien-----");
        ma.depositSimulation("22222", 500000);

        System.out.println("\n\n-----Chon 1 tai khoan de nop tien-----");
        ma.depositSimulation("22222", 100000);
    }
}
