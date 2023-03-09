public class CreditPaymentService {
    public double calculate(double amountOfCredit, double annualPercentage, double months) {

        double monthlyInterestRate = (annualPercentage / 12 / 100);

        double annuityRatio = (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, months))) / (Math.pow(1 + monthlyInterestRate, months) - 1);

        double annuityContribution = (amountOfCredit * annuityRatio);

        return annuityContribution;
    }
}
