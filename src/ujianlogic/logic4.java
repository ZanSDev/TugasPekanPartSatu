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
public class logic4 {
    public static void main(String[] args) {
        for (int y = 1; y < 10; y++) {
            for (int x = 1; x < 10; x++) {
                if(x == y || 10 - y == x || x == 5 || y == 5 ){
                    System.out.print("+ ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
