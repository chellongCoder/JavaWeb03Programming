/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @authoroc chellong
 */
public class Main {
    private static String docHangChuc(int chuc) {
        switch (chuc) {
            case 1:return "mười";  
            case 2:return "hai";
            case 3:return "ba";
            case 4:return "bốn";
            case 5:return "năm";
            case 6:return "sáu";
            case 7:return "bảy";
            case 8:return "tám";
            case 9:return "chín";
            default:
                return "none";
        }
    }
    private static String docHangDonVi(int chuc, int donVi) {
       switch (donVi) {
            case 0:return chuc==1 ? "" : "mươi";
            case 1:return chuc==1 ? "một" : "mươi mốt";  
            case 2:return chuc==1 ? "hai" : "mươi hai";
            case 3:return chuc==1 ? "ba" : "mươi ba";
            case 4:return chuc==1 ? "bốn" : "mươi bốn";
            case 5:return chuc==1 ? "năm" : "mươi năm";
            case 6:return chuc==1 ? "sáu" : "mươi sáu";
            case 7:return chuc==1 ? "bảy" : "mươi bảy";
            case 8:return chuc==1 ? "tám" : "mươi tám";
            case 9:return chuc==1 ? "chín" : "mươi chín";
            default:
                return "none";
        } 
    }
    public static void main(String[] args) {
        int n;
        System.out.println("nhap n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("cách đọc của n: " + docHangChuc(n/10) + " " + docHangDonVi(n/10, n%10));
    }
    
}
