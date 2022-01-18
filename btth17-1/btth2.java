import java.util.Scanner;
public class btth2 {
    private static Scanner p = new Scanner(System.in);
    public static void main(String [] arg){
        float a,b,c;
        System.out.println("nhap he so bac 2 a: ");
        a = p.nextFloat();
        System.out.println("nhap he so bac 1 b: ");
        b = p.nextFloat();
        System.out.println("nhap he so tu do c: ");
        c = p.nextFloat();
        btth2.giaiPTBac2(a,b,c);
    }
    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return ;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
