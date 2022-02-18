import java.util.Scanner;
public class app40 {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner (System.in);
        int ngay=scan.nextInt();
        switch (ngay) {
        case 0:System.out.println("Chu nhat");
                break;
        case 1:System.out.println("Thu 2");
                break;
        case 2:System.out.println("Thu 3");
                break;
        case 3:System.out.println("Thu 4");
                break;
        case 4:System.out.println("Thu 5");
                break;
        case 5:System.out.println("Thu 6");
                break;
        case 6:System.out.println("thu 7");
                break;
        default:System.out.println("Khong phai ngay trong tuan");
                break;
        }
        scan.close();
        }
    }