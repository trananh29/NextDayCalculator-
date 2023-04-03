import java.time.LocalDate;

public class NextDayCalculator {
    LocalDate date;
    public LocalDate date1() {
        return this.date.plusDays(1);
    }

    public NextDayCalculator(LocalDate date) {
        this.date = date;
    }

    public NextDayCalculator() {
    }
}
