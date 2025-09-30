/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3;

import java.util.Arrays;   
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        // Nhập các phần tử mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        // Sắp xếp mảng và xuất
        Arrays.sort(a);
        System.out.println("Mang sau khi sap xep tang dan:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Tìm phần tử nhỏ nhất
        int min = a[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println("Gia tri nho nhat trong mang: " + min);

        // Tính trung bình cộng các phần tử chia hết cho 3
        int tong = 0, dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                tong += a[i];
                dem++;
            }
        }

        if (dem > 0) {
            double tbc = (double) tong / dem;
            System.out.println("Trung binh cong cac phan tu chia het cho 3: " + tbc);
        } else {
            System.out.println("Khong co phan tu nao chia het cho 3.");
        }

        sc.close();
    }
}
