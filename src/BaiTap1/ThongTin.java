package BaiTap1;

public class ThongTin {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.setName("Diệu Diệu");
        sinhVien.setAge(26);
        sinhVien.setBirthday("03-09-1997");
        sinhVien.setAddress("99B Núi Thành, Đà Nẵng");

        System.out.println(sinhVien.getName());
        System.out.println(sinhVien.getAge());
        System.out.println(sinhVien.getBirthday());
        System.out.println(sinhVien.getAddress());

        SinhVien sinhVien1 = new SinhVien("Dieu Dieu", 26, "03-09-1997", "99B Nui Thanh");

        System.out.println(sinhVien1.getName());
        System.out.println(sinhVien1.getAge());
        System.out.println(sinhVien1.getBirthday());
        System.out.println(sinhVien1.getAddress());
    }
}