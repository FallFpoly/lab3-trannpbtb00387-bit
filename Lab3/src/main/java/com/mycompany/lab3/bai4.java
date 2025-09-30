/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
class SinhVien {
    String hoten;
    double diem;

    // Phương thức nhập
    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        sc.nextLine(); // tránh lỗi khi nhập chuỗi
        this.hoten = sc.nextLine();
        System.out.print("Nhap diem: ");
        this.diem = sc.nextDouble();
    }

    // Xác định học lực
    public String hocLuc() {
        if (diem < 5) return "Yeu";
        else if (diem < 6.5) return "Trung binh";
        else if (diem < 7.5) return "Kha";
        else if (diem < 9) return "Gioi";
        else return "Xuat sac";
    }

    // Xuất thông tin
    public void xuat() {
        System.out.println("Ho ten: " + hoten + " | Diem: " + diem + " | Hoc luc: " + hocLuc());
    }
}
public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];

        // Nhập thông tin từng sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhap sinh vien thu " + (i + 1) + " ---");
            sv[i] = new SinhVien();
            sv[i].nhap(sc);
        }

        // Xuất danh sách ban đầu
        System.out.println("\n===== DANH SACH SINH VIEN =====");
        for (SinhVien s : sv) {
            s.xuat();
        }

        // Sắp xếp tăng dần theo điểm (thuật toán nổi bọt - Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sv[j].diem > sv[j + 1].diem) {
                    SinhVien temp = sv[j];
                    sv[j] = sv[j + 1];
                    sv[j + 1] = temp;
                }
            }
        }

        // Xuất danh sách sau khi sắp xếp
        System.out.println("\n===== DANH SACH SAU KHI SAP XEP TANG DAN THEO DIEM =====");
        for (SinhVien s : sv) {
            s.xuat();
        }

        sc.close();
    }
}
