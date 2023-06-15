package Cau1;


public class CustomerInfo {
    private String customerName;
    private String customerAdd;

//    public CustomerInfo(String customerName) {
//        this.customerName = customerName;
//        this.customerAdd = customerAdd;
//    }


    public CustomerInfo(String customerName, String customerAdd) {
        this.customerName = customerName;
        this.customerAdd = customerAdd;
    }

    public void inputData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Customer Name: ");
        customerName = in.nextLine();
        System.out.println("Customer Address: ");
        customerAdd = in.nextLine();
    }


    public String getName() {
        return customerName;
    }

    public void setName(String customerName) {
        this.customerName = customerName;
    }

    public String getAdd() {
        return customerAdd;
    }

    public void setAdd(String customerAdd) {
        this.customerAdd = customerAdd;
    }
    public void display() {
        System.out.println("Name: " +customerName+ "; Address: " +customerAdd);
    }

    @Override
    public String toString() {
        return customerName+ "; " +customerAdd;
    }


}
