import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void date1() {
        NextDayCalculator intdate= new NextDayCalculator(LocalDate.of(2018,1,1));
        LocalDate expected=LocalDate.of(2018,1,2);
        LocalDate result = intdate.date1();
        assertEquals(expected,result);
    }
    @Test
    void date6() {
        NextDayCalculator intdate= new NextDayCalculator(LocalDate.of(2018,1,31));
        LocalDate expected=LocalDate.of(2018,2,1);
        LocalDate result = intdate.date1();
        assertEquals(expected,result);
    }
    @Test
    void date5() {
        NextDayCalculator intdate= new NextDayCalculator(LocalDate.of(2018,4,30));
        LocalDate expected=LocalDate.of(2018,5,1);
        LocalDate result = intdate.date1();
        assertEquals(expected,result);
    }
    @Test
    void date4() {
        NextDayCalculator intdate= new NextDayCalculator(LocalDate.of(2018,2,28));
        LocalDate expected=LocalDate.of(2018,3,1);
        LocalDate result = intdate.date1();
        assertEquals(expected,result);
    }
    @Test
    void date3() {
        NextDayCalculator intdate= new NextDayCalculator(LocalDate.of(2020,2,29));
        LocalDate expected=LocalDate.of(2020,3,1);
        LocalDate result = intdate.date1();
        assertEquals(expected,result);
    }
    @Test
    void date2() {
        NextDayCalculator intdate= new NextDayCalculator(LocalDate.of(2018,12,31));
        LocalDate expected=LocalDate.of(2019,1,1);
        LocalDate result = intdate.date1();
        assertEquals(expected,result);
    }
}