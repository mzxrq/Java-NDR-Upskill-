public interface DiscountPolicy {

    /*
     *  @param amount จำนวนเงินที่ต้องการคำนวณส่วนลด
     *  @param discount ส่วนลดของลูกค้า ไม่เป็นลบ อยู่ในช่วง
     */

     double applyDiscount(double amount);
}