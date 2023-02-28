public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double a = 1000000;
        double b = 9.99;
        double c = 12;  // Введите количество месяцев в соответствии с 1 год = 12, 2 года = 24, 3 года = 36;

        double mp = service.calculate(a, b, c);
        System.out.println((int) mp);
    }
}