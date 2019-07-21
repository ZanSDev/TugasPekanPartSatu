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
public class logic3 {
    public static void main(String[] args) {
        for (int y = 1; y <=9; y++) {
            for (int x = 1; x <=9; x++) {
                if (x == 1 || x == 3 || x == 5 || x == 7 || x == 9) {
                    System.out.print("+ ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    
}
