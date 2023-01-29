package domain;

public class Customer {

    static private int ID;

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        if (ID > 0) {
            Customer.ID = ID;
        }
    }

    public static boolean isIsNew() {
        return isNew;
    }

    public static void setIsNew(boolean isNew) {
        Customer.isNew = isNew;
    }

    public static float getTotal() {
        return total;
    }

    public static void setTotal(float total) {
        if (total > 0) {
            Customer.total = total;
        }
    }
    static private boolean isNew = true;
    static private float total = 1000.0F;

    public Customer() {
        ID = 1;
        isNew = true;
        total = 1000.0F;
    }

    public void displayCustomerInfo() {
        System.out.println("ID is " + ID);
        System.out.println("Does status is new? " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
