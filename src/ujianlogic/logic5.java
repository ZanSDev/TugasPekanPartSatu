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
public class logic5 {
    public static void main(String[] args) {
        for (int y = 1; y < 10; y++) {
            for (int x = 1; x < 10; x++) {
                if (x == y || y == 1 || x == 1 || x == 9 || y == 9  ) {
                    System.out.print("+");
                }else if(x == y-(1) || x == y-(2) || x == y-(3) || x == y-(4) || x == y-(5) || x == y-(6) ) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
