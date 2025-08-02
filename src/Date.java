public class Date {
    // private int year,month,day;
    private int year; // variables name, not to be confused with parameters
    private int month;
    private int day;

    // Constructor (method that has the same name as the class)
    public Date(int year, int month, int day) { // parameters
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Setter and Getter methods
    // Setter ไว้กำหนดค่าให้กับ attributes
    public void setYear(int year) {
        this.year = year; 
    }

    public void setMonth(int month) {
        this.month = month; 
    }

    public void setDay(int day) {
        this.day = day; 
    }

    // Getter ไว้ดึงค่าของ attributes ออกมา (ส่งค่ากลับให้ object ที่เรียกใช้)
    public int getYear() {
        return this.year; 
    }

    public int getMonth() {
        return this.month; 
    }

    public int getDay() {
        return this.day; 
    }

    // toString() เป็น method ที่เรียกใช้ได้เลยผ่าน object
    public String toString() {
        return String.format("Date is %02d-%02d-%04d", this.day, this.month, this.year);
    } // %04d หมายถึง 4 หลัก, %02d หมายถึง 2 หลัก d = decimal

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

}