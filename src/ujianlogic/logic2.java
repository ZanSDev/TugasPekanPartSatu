/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianlogic;

/**
 *
 * @author zan
 */
public class logic2 {
    public static void main(String[] args) {
        for (int y = 1; y <= 5; y++) {
            for (int x = 1; x <= 5; x++) {
                if (x <= y) {
                    System.out.print(" " + x);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
