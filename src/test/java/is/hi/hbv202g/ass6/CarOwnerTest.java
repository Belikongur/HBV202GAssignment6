package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {


    public static final String DOE = "John Doe";
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car("Beetle");
    }

    @Test
    public void getName() {
        CarOwner carOwner = new CarOwner(DOE, car);
        assertEquals(DOE, carOwner.getName());
    }

}