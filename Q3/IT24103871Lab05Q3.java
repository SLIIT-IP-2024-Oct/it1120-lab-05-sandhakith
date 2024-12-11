import java.util.Scanner;

public class IT24103871Lab05Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int stdate, endate, resdays;
        double dis = 1.0, withdis, tot;

        System.out.print("Enter Start date (1-31): ");
        stdate = input.nextInt();
        System.out.print("Enter End date (1-31): ");
        endate = input.nextInt();

        if (stdate > endate) {
            System.out.println("Start date should be lower than End date");
            return;
        }
        if ((stdate > 31 || stdate < 1) || (endate > 31 || endate < 1)) {
            System.out.println("Dates should be between 1-31");
            return;
        }

        double roomperday = 48000.0;
        resdays = endate - stdate;

        if (resdays < 3) {
            System.out.println("No Discount. You reserved room for " + resdays + " days");
            dis = 0.0;
        } else if (resdays == 3 || resdays == 4) {
            System.out.println("Reserved days: " + resdays);
            dis = 0.1;
        } else if (resdays >= 5) {
            System.out.println("Reserved days: " + resdays);
            dis = 0.2;
        }

        tot = roomperday * resdays;
        withdis = tot * dis;
        tot = tot - withdis;

        System.out.println("Total Amount = " + tot);
    }
}