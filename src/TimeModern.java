import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeModern {
    
    // ใช้ LocalTime เพื่อจัดการเวลา
    private LocalTime time;

    public TimeModern() {
        this.time = LocalTime.of(0, 0, 0); // กำหนดค่าเริ่มต้นเป็น 00:00:00
    }

    public TimeModern(int hour, int minute, int second) {
        this.time = LocalTime.of(hour, minute, second); // ใช้ LocalTime เพื่อสร้างเวลา
    }

    public int getHour() {
        return time.getHour();
    }

    public int getMinute() {
        return time.getMinute();
    }

    public int getSecond() {
        return time.getSecond();
    }

    public TimeModern withTime(int hour, int minute, int second) {
        this.time = LocalTime.of(hour, minute, second);
        return new TimeModern(hour, minute, second); // คืนค่า object นี้เพื่อใช้ method chaining
    }

    /*
     * สร้าง object ที่มีเวลาเพิ่มขึ้น 1 วินาทีจากเดิม
     * return object TimeModern ที่มีเวลาใหม่
     */

    public TimeModern nextSecond() {
        // call plusSeconds() ของ LocalTime เพื่อเพิ่มเวลา
        LocalTime newTime = this.time.plusSeconds(1);
        return new TimeModern(
            newTime.getHour(),
            newTime.getMinute(),
            newTime.getSecond()
        );
    }

    @Override
    public String toString() {
        // ใช้ DateTimeFormatter เพื่อจัดรูปแบบเวลา
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
