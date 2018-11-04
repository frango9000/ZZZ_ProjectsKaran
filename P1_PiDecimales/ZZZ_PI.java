/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * https://github.com/karan/Projects-Solutions
 */
package P1_PiDecimales;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author NarF
 */
public class ZZZ_PI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigDecimal b1 = new BigDecimal(22.0);
	    BigDecimal b2 = new BigDecimal(7.0);
		
		System.out.println("To how many decimal places do you want to print PI?");
		int n = input.nextInt();
		
		if(n < 32627)
			System.out.println(""+calcPI(n).toString()+"");
		else
			System.out.println("Limit exceeded !!!");
    }
    
    public static BigDecimal calcPI(int n) {
        
        BigDecimal big0 = new BigDecimal(1.0);
	BigDecimal big1 = new BigDecimal(1.0);
        BigDecimal big2 = new BigDecimal(3.0);
        BigDecimal increase = new BigDecimal(2.0);
        
        for (int f = 1; f <= n+30; f++) {
            if (isPair(f)) {
                big0 = big0.add(big1.divide(big2,n*5,BigDecimal.ROUND_UP));
            } else {
                big0 = big0.subtract(big1.divide(big2,n*5,BigDecimal.ROUND_UP));
            }
            big2.add(increase);
        }
        return big0;
    }

    public static boolean isPair(int n) {
        return (n % 2 == 0);
    }
}
