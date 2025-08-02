public class TestDate {
    public static void main(String[] args) {
        // create an object d1 to call method in Date class
        Date d1 = new Date(2025, 8, 2);
        //System.out.println(d1.toString());
        System.out.println(d1); // เรียกใช้ toString() อัตโนมัติ
        
        d1.setYear(2024);
        d1.setMonth(2);
        d1.setDay(23);
        System.out.println(d1); // เรียกใช้ toString() อัตโนมัติ

        System.out.println("Year is "+ d1.getYear());
        System.out.println("Month is "+ d1.getMonth());
        System.out.println("Day is "+ d1.getDay());

        d1.setDate(2023,1,25);
        System.out.println(d1); // เรียกใช้ toString() อัตโนมัติ

    }

    
}
