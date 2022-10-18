import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class NextDayCalculatorTest {

    @Test
    public void findNextDay() {
        Date toDay = new Date(2018,0,31);
        Date expected = new Date(2018,1,01);


        Date actual =NextDayCalculator.findNextDay(toDay);
        assertEquals(expected.toString(), actual.toString());

    }
}