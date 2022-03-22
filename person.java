import java.util.Scanner;
public class person {
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;
    Scanner sc = new Scanner(System.in);
    public void nhapPersonID(){
        System.out.println("Hay nhap PersonID ");
        Scanner sc = new Scanner(System.in);
        PersonID = sc.nextLine();
        sc.close();
    }
    public void nhapPersonName() {
        System.out.println("Hay nhap PersonName ");
        Scanner sc = new Scanner(System.in);
        PersonName = sc.nextLine();
        sc.close();
    }
    public void nhapGender() {
        
        System.out.println("Hay nhap Gender ");
        Scanner sc = new Scanner(System.in);
        Gender = sc.nextBoolean();
        sc.close();
    }
    public void nhapAddress() {
        System.out.println("Hay nhap Address ");
        Scanner sc = new Scanner(System.in);
        Address = sc.nextLine();
        sc.close();
    }
    public void inPersonID() {
        System.out.println("PersonID cua ban la : " + PersonID);
    }
    public void inPersonName() {
        System.out.println("PersonName cua ban la : " + PersonName);
    }
    public void inGender() {
        System.out.println("Gender cua ban la : " + Gender);
    }
    public void inAddress() {
        System.out.println("Address cua ban la : " + Address);
    }
}