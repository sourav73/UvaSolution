//Problem link: (odd sum) https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1724
import java.util.Scanner;

public class Main {
    public static int oddSum(int startingRange,int endingRange){
        int sum=0;
        for(int i=startingRange;i<=endingRange;i++){
            if(i%2==1)
                sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase=in.nextInt();
        for(int i=1;i<=testCase;i++){
            int startingRange=in.nextInt();
            int endingRange=in.nextInt();
            System.out.println("Case "+i+": "+oddSum(startingRange,endingRange));
        }
        in.close();
    }
}
