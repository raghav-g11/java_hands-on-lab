package alg_datastr;

public class financial_forecasting {
    static double forecast(double amount, double rate, int years) {
        if (years == 0) return amount;
        return forecast(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double result = forecast(10000.0, 0.10, 5);
        System.out.printf("₹%.2f%n", result);
    }
}
