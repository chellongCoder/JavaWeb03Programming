/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Main {
    private static String docHangTram(int tram) {
        switch (tram) {
            case 1:return "một trăm";  
            case 2:return "hai trăm";
            case 3:return "ba trăm";
            case 4:return "bốn trăm";
            case 5:return "năm trăm";
            case 6:return "sáu trăm";
            case 7:return "bảy trăm";
            case 8:return "tám trăm";
            case 9:return "chín trăm";
            default:
                return "none";
        }
    }
    private static String docHangChuc(int chuc, int donVi) {
        switch (chuc) {
            case 0:return donVi==0 ? "" : "linh"; 
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
            case 0: return (chuc==0 || chuc==1) ? "" : "mươi"; 
            case 1:return "một";  
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
    public static void main(String[] args) {
        int n;
        System.out.println("nhap n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("cách đọc của n: " + docHangTram(n/10/10) + " " + docHangChuc(n/10%10, n%10%10) + " " + docHangDonVi(n/10%10, n%10%10));
    }
}
