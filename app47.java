import java.util.Scanner;
public class app47 {
    public static void main(String[] args) throws Exception {
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);     
        do {
         System.out.println("Nhập vào số nguyên bất kỳ: ");
           number = scanner.nextInt();
           sum += number;
       } while (sum < 100); 
         System.out.println("Tổng các số nguyên vừa nhập = "+sum);
            scanner.close();
    }
        }