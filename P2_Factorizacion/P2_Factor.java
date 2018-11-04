/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2_Factorizacion;

import java.util.Scanner;

/**
 *
 * @author NarF
 */
public class P2_Factor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Num to Factor?");
        int n = input.nextInt();

        System.out.println(PrimeFactors.getPrimeFactors(n).toString());
    }
}
