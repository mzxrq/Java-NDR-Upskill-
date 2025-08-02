public class TestDateModern {
    public static void main(String[] args) {
        // Create and print Date
        DateModern d1 = new DateModern(2025,2,8);
        System.out.println("Original Date: " + d1); // Should print "02/08/2025"

        // Use a chain of with nethods to create a modified copy
        DateModern d2 = d1.withDate(2012,12,23);
        System.out.println("New Date (from chain): " + d2); // Should print "12/23/2012"
        System.out.println("Year is " + d2.getYear()); // Should print 2012
        System.out.println("Month is " + d2.getMonth()); // Should print 12
        System.out.println("Day is " + d2.getDay()); // Should print 23

        // Show that original date is unchanged
        System.out.println("Original Date after chain: " + d1); // Should still print "02/08/2025"
    }
}
