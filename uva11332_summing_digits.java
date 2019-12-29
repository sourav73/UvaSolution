//Problem link:https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2307
package com.company;

import java.util.Scanner;

public class Uva11332 {
    public static void summingDigit(long n){
        long sum=0;
        while(true) {
                while (n!=0) {
                    sum=sum+n%10;
                    n=n/10;
                }
                if(sum/10==0)
                    break;
                else{
                    n=sum;
                    sum=0;
                }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int n=in.nextInt();
            if(n==0)
                break;
            else
            summingDigit(n);
        }
    }
}
