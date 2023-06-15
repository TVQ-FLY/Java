import java.util.Scanner;

public class Lecturer {
    protected String lecid;
    protected String lecname;
    protected String lecAddress;

    public Lecturer(String id,String name,String Address)
    {
        this.lecid = id;
        this.lecname = name;
        this.lecAddress = Address;
    }

    public Lecturer()
    {}

    public void inputdataLec()
    {
        Scanner lec = new Scanner(System.in);
        System.out.println("Nhap ID : ");
        lecid = lec.nextLine();
        System.out.println("nhap Name : ");
        lecname = lec.nextLine();
        System.out.println("nhap address : ");
        lecAddress = lec.nextLine();
    }

    public void displayLec()
    {
        System.out.println(" ID : "+lecid);
        System.out.println("Name : "+lecname);
        System.out.println("Address : "+lecAddress);
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lecid='" + lecid + '\'' +
                ", lecname='" + lecname + '\'' +
                ", lecAddress='" + lecAddress + '\'' +
                '}';
    }

    public void setLecname(String lecname) {
        this.lecname = lecname;
    }

    public String getLecname() {
        return lecname;
    }
}

