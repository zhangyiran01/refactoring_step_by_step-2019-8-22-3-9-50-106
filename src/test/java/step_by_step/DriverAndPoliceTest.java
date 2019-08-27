package step_by_step;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;

public class DriverAndPoliceTest {
    @Test
    void refactoring_step_by_step() {
        Driver driver = new Driver(20);
        Police police = new Police();

        boolean b = police.checkDriver(driver);

        Assertions.assertEquals(true,b);
    }
}

