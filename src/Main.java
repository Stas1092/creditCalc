public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double amountOfCredit = 1000000;
        double annualPercentage = 9.99;
        double year = 1;  // Введите количество месяцев в соответствии с 1 год = 12, 2 года = 24, 3 года = 36;
        double months = (year * 12);

        double annuityContribution = service.calculate(amountOfCredit, annualPercentage, months);
        System.out.println((int) annuityContribution);
    }
}