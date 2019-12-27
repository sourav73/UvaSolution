//Problem link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1012

import java.util.Scanner;

public class Main {
    public static int displacement(int velocity,int time){
        return 2*(velocity*time);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int velocity=in.nextInt();
            int time=in.nextInt();
            System.out.println(displacement(velocity,time));
        }
    }
}
