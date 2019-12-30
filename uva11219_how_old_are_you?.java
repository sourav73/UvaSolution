//Problem link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2160
import java.util.Scanner;

public class Main {
    public static String age(String currentDate,String birthDate){
        int currentDay=Integer.parseInt(currentDate.substring(0,2));
        int currentMonth=Integer.parseInt(currentDate.substring(3,5));
        int currentYear=Integer.parseInt(currentDate.substring(6));
        int birthDay=Integer.parseInt(birthDate.substring(0,2));
        int birthMonth=Integer.parseInt(birthDate.substring(3,5));
        int birthYear=Integer.parseInt(birthDate.substring(6));

        int year=currentYear-birthYear;
        if(currentMonth<birthMonth)
            year--;
        else if(currentMonth==birthMonth){
            if(currentDay<birthDay)
                year--;
        }

        if(year<0)
            return " Invalid birth date";
        else if(year > 130)
            return " Check birth date";
        else
            return " " + year;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int i=1;i<=testCase;i++){
            String currentDate = in.next();
            String birthDate = in.next();
            System.out.println("Case #"+i+":"+age(currentDate,birthDate));
        }
        in.close();
    }
}
