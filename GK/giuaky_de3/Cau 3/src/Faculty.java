import java.util.ArrayList;
import java.util.Scanner;

public class Faculty extends University{

    protected String facid;
    protected String facname;

    private ArrayList<Lecturer> LecturerList = new ArrayList<>();

    public Faculty()
    {
        Lecturer l1 = new Lecturer("l1","can bo 1","tp vinh");
        Lecturer l2 = new Lecturer("l2","can bo 2","ha tinh");
        Lecturer l3 = new Lecturer("l3","can bo 3","thanh hoa");

        LecturerList.add(l1);
        LecturerList.add(l2);
        LecturerList.add(l3);
    }

    public void displayLecList()
    {
        for (int i= 0; i < LecturerList.size();i++)
        {
            System.out.println(LecturerList.get(i).toString());
        }
    }

    public void themLec(String id,String name,String Address)
    {
        Lecturer lec = new Lecturer(id,name,Address);
        LecturerList.add(lec);
    }

    public void initFaculty()
    {
        for (int i = 1;i < 2;i++)
        {
            Lecturer lec = new Lecturer();
            lec.inputdataLec();
            LecturerList.add(lec);
        }
    }


    public ArrayList<Lecturer> timkiemten(String ten)
    {
        ArrayList<Lecturer> Listtimkiem = new ArrayList<>();
        for (int i = 0; i < LecturerList.size();i++)
        {
            if (LecturerList.get(i).getLecname().equals(ten))
            {
                Listtimkiem.add(LecturerList.get(i));
            }
        }
        return Listtimkiem;
    }

    
}
