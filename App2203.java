
public class App2203 {
    public static void main(String[] args) throws Exception {
        System.out.println("Bai_1");
        hinhchunhat hcn = new hinhchunhat();
        hcn.Nhapkichthuoc();
        System.out.println("chu vi hcn la: "+hcn.ChuVi());
        System.out.println("dien tich hcn la: "+hcn.DienTich());
        
        System.out.println("Bai_2");
        person ps = new person();
        ps.nhapPersonName();
        ps.nhapPersonID();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inPersonName();
        ps.inPersonID();
        ps.inGender();
        ps.inAddress();
        
        System.out.println("Bai_3");
        sinhvien sv = new sinhvien();
        sv.nhapMaSinhVien();
        sv.nhapHoTen();
        sv.nhapDiaChi();
        sv.nhapgioiTinh();
        sv.nhapNgaysinh();
        sv.inMaSinhVien();
        sv.inHoTen();
        sv.inDiaChi();
        sv.ingioiTinh();
        sv.inNgaySinh();
        
        System.out.println("Bai_4");
        ptbac2 pt2 = new ptbac2();
        pt2.nhapa();
        pt2.nhapb();
        pt2.nhapc();
        pt2.tinhdelta();
        pt2.indelta();
        pt2.giaiptb2();
    }
}
