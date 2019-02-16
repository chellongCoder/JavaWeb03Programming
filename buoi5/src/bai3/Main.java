/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author chellong
 * http://mathafou.free.fr/exe_en/exedioph3.html
 */
public class Main {
    public static void main(String[] args) {
        int x,y,z;
        for (int k = 0; k <= 15; k++) {
            for (int m = 0; m <= 2*k; m++) {
                x = 2*k - m;
                y = 15 - k - 2*m;
                if(y<0) continue;
                z = m;
                System.out.println("x=" +x+", y="+y+", z=" + z);
            }
        }
    }
}
