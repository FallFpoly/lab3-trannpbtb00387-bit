/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. In 1 bang nhan");
            System.out.println("2. In toan bo 9 bang nhan");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Chuong trinh ket thuc!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Nhap so muon in bang nhan: ");
                    int x = sc.nextInt();
                    System.out.println("Bang nhan " + x);
                    for (int i = 1; i <= 10; i++) {
                        System.out.printf("%d x %d = %d\n", x, i, x * i);
                    }
                    System.out.println();
                    break;

                case 2:
                    for (int i = 1; i <= 9; i++) {
                        System.out.println("Bang nhan " + i);
                        for (int j = 1; j <= 10; j++) {
                            System.out.printf("%d x %d = %d\n", i, j, i * j);
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Lua chon khong hop le, vui long thu lai!");
            }
        }

        sc.close();
    }
}
