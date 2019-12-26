import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase=in.nextInt();
        int firstNumber,secondNumber;
        for(int i=0;i<testCase;i++){
            firstNumber=in.nextInt();
            secondNumber=in.nextInt();
            if(firstNumber>secondNumber)
                System.out.println(">");
            else if(firstNumber<secondNumber)
                System.out.println("<");
            else
                System.out.println("=");
        }
    }
}
