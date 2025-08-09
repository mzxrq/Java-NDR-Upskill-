public class PercentageDiscountPolicy implements DiscountPolicy {
    /*
     * applyDiscount คำนวณส่วนลดตามเปอร์เซ็นต์ที่กำหนด
     * this class applies a percentage-based discount to a given amount.
     */
    private int Percent;
    public PercentageDiscountPolicy(int percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Percent must be between 0 and 100.");
        }
        this.Percent = percent;
    }
    
    @Override
    public double applyDiscount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be non-negative.");
        }
        return amount * (1 - Percent / 100.0);
    }

    public int getPercent() {
        return Percent;
    }

    @Override
    public String toString() {
        return Percent + "%";
    }
}
