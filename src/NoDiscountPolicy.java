public class NoDiscountPolicy implements DiscountPolicy {
    /*
     * 3. NoDiscountPolicy class implements DiscountPolicy interface
     * This class applies no discount to the given amount.
     */
    @Override
    public double applyDiscount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be non-negative.");
        }
        return amount; // No discount applied, return the original amount
    }

    @Override
    public String toString() {
        return "No Discount";
    }
    
}
