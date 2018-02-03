import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework12 {

    public static void main(String [] args){

        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        DecimalFormat pattern0dot00 = new DecimalFormat("0.00");


        double investmentAmount, monthlyInterestRate, annualInterestRate;
        int years;
        double amount;

        System.out.print("Enter investment amount:  ");
        investmentAmount = keyboard1.nextDouble();

        System.out.print("Enter annual interest rate:  ");
        annualInterestRate = (keyboard2.nextDouble()/100);
        System.out.println();

        System.out.println("Years          Future Value");

        for( years = 1; years <= 30; years++){
            amount = futureInvestmentValue(investmentAmount, (annualInterestRate/12), years);
            System.out.println(years + "          " + pattern0dot00.format(amount));

        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        double futureInvestmentAmount;
        return futureInvestmentAmount = investmentAmount * (Math.pow((1+monthlyInterestRate), (years *12)));
    }
}
