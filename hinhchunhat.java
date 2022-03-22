import java.util.Scanner;
public class hinhchunhat {
    int chieudai;
    int chieurong;
    int C,S;
    Scanner sc = new Scanner(System.in);
    public void Nhapkichthuoc(){
        System.out.println("nhap chieu dai:");
            chieudai=sc.nextInt();
        System.out.println("nhap chieu rong:");    
            chieurong=sc.nextInt();
    }
    public int ChuVi(){
        C=(chieudai+chieurong)*2;
        return C;
    }

    public int DienTich(){
        S=chieudai*chieurong;
        return S;
    }
}
