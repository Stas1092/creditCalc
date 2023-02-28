public class CreditPaymentService {
    public double calculate(double a, double b, double c) {

        double mps = (b / 12 / 100);

        double ka = (mps * (Math.pow(1 + mps, c))) / (Math.pow(1 + mps, c) - 1);

        double mp = (a * ka);

        return mp;
    }
}
