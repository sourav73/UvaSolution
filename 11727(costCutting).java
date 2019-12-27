//Problem link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2827
import java.util.Scanner;

public class Uva11727 {
    public static int stayingEmployee(int firstEmployeeSalary,int secondEmployeeSalary,int thirdEmployeeSalary){
        if((firstEmployeeSalary>secondEmployeeSalary && firstEmployeeSalary<thirdEmployeeSalary)
        || (firstEmployeeSalary<secondEmployeeSalary && firstEmployeeSalary>thirdEmployeeSalary)){
                return firstEmployeeSalary;
        }
        else if((secondEmployeeSalary>firstEmployeeSalary && secondEmployeeSalary<thirdEmployeeSalary) ||
                (secondEmployeeSalary<firstEmployeeSalary && secondEmployeeSalary>thirdEmployeeSalary))
            return secondEmployeeSalary;
        else
            return thirdEmployeeSalary;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase=in.nextInt();
        for(int i=1;i<=testCase;i++){
            int firstEmployeeSalary=in.nextInt();
            int secondEmployeeSalary=in.nextInt();
            int thirdEmployeeSalary=in.nextInt();
            System.out.println("Case "+i+": "+
                    stayingEmployee(firstEmployeeSalary,secondEmployeeSalary,thirdEmployeeSalary));
        }
    }
}
