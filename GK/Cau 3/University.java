import java.util.Scanner;

public class University {

    protected String uniname;
    protected String uniAddress;


    public University(String name,String address)
    {

        this.uniname = name;
        this.uniAddress = address;
    }

    public University(){}
    public void inputdataUniver()
    {

        Scanner uni = new Scanner(System.in);
        System.out.println("Nhap uniName : ");
        uniname = uni.nextLine();
        System.out.println("nhap uniAddress : ");
        uniAddress = uni.nextLine();
    }

    @Override
    public String toString() {
        return "University{" +
                "uniname='" + uniname + '\'' +
                ", uniAddress='" + uniAddress + '\'' +
                '}';
    }

    public void displayUni()
    {
        System.out.println("uniName : "+uniname);
        System.out.println("uniAddress : "+uniAddress);

    }

}
