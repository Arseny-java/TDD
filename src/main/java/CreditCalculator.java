
public class CreditCalculator {
    private int credit;
    private double rate;
    private int time;

    public CreditCalculator(int credit, double rate, int time) {
        this.credit = credit;
        this.rate = rate;
        this.time = time;
    }

    public int paymentCalculator() {


        return 0;
    }

    public int refundAmount(int payment) {

        return payment;
    }

    public int overpaymentCalc(int sum) {

        return sum;
    }
}
