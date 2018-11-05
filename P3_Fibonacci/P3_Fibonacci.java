/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3_Fibonacci;

import java.util.Scanner;

/**
 *
 * @author NarF
 */
public class P3_Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fiba = 1;
        int fibb = 0;
        int fib;
        for (int i = 1; i <= n; i++) {
            fib = fiba + fibb;

            fibb = fiba;
            fiba = fib;
            System.out.println(i + ": " + fib);
        }
    }
}
