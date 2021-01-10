import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    LocalDateTime ldt;

    public Gigasecond(LocalDate moment) {
        ldt = moment.atTime(0, 0, 0);
    }

    public Gigasecond(LocalDateTime moment) {
        ldt = moment;
    }

    public LocalDateTime getDateTime() {
        return ldt.plusSeconds(1000000000);
    }
}
