public class Main {
    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        System.out.println("====University====");
        f1.inputdataUniver();
        System.out.println("====in Lecturer khoi tao====");
        f1.displayUni();
        f1.displayLecList();
        System.out.println("====them Lecturer====");
        f1.themLec("l4","can bo 4","hai phong");
        System.out.println("====in Lecturer list vua them====");
        f1.displayLecList();
        System.out.println("====Nhap Lecturer tu ban phim====");
        f1.initFaculty();
        System.out.println("====in Lecturer list vua them====");
        f1.displayLecList();
        System.out.println("====tim danh ba theo ten====");
    //        f1.displayLecList(f1.timkiemten("can bo 4"));
    }
}

