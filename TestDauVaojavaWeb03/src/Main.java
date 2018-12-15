
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chellong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
//                    int number;
//        Scanner out = new Scanner(System.in);
//        System.out.println("nhap so : ");
//        number = out.nextInt();
//        if(Main.ktraSoNguyenTo(number)) {
//            System.out.println(number + " la so nguyen to!");
//        } else {
//            System.out.println(number + " khong phai so nguyen to!");
//        }
            String path = "DATA.INP";
            int content = Integer.parseInt(Main.docFile(path));
            System.out.println("content" + content);
            int i = 0;
            int sum = 0;
            int count = 0;
            while(true) {
                if(Main.ktraSoNguyenTo(i)) {
                    sum = sum+i;
                    System.out.println("i = " + i);
                    count++;
                }
                i++;
                if(count == content) {
                    break;
                }
            }
            System.out.println("Tong " + content + " so nguyen to dau tien la: " + sum);
            
        } catch (Exception ex) {
            
        }
    }

    private static boolean ktraSoNguyenTo(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String docFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String content = sc.next();
        return content;
    }

}
