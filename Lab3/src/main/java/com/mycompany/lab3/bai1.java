/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra ");
        int N = sc.nextInt();

        boolean ok = true;
        if (N < 2) {
            ok = false; // số < 2 không phải số nguyên tố
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    ok = false;
                    break;
                }
            }
        }

        if (ok) {
            System.out.println(N + " la so nguyen to");
        } else {
            System.out.println(N + " khong phai la so nguyen to");
        }
    }
}
