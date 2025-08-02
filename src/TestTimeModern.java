public class TestTimeModern {
    public static void main(String[] args) {
        TimeModern t = new TimeModern(23, 59, 59);
        System.out.println("Starting time: " + t); // 23:59:59

        // Test nextSecond()
        TimeModern t2 = t.nextSecond();
        System.out.println("After adding 1 second: " + t2); // 00:00:00
        
        // Test method chaining
        TimeModern t3 = t2.nextSecond().nextSecond();
        System.out.println("After adding 3 more seconds (with chaining): " + t3); // 00:00:02

        //Getters
        System.out.println("Hour: "+ t3.getHour());
        System.out.println("Minute: "+ t3.getMinute());
        System.out.println("Second: "+ t3.getSecond());

        //Create new Time
        TimeModern t4 = t3.withTime(7, 30, 15);
        System.out.println("New time with withTime() "+ t4);
    }
   
}
