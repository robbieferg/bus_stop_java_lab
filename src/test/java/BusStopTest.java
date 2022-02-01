import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop("Govanhill");
        person = new Person();
    }

    @Test
    public void hasName() {
        assertEquals("Govanhill", busStop.getName());
    }

    @Test
    public void queueStartsEmpty() {
        assertEquals(0, busStop.getQueueCount());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addToQueue(person);
        assertEquals(1, busStop.getQueueCount());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addToQueue(person);
        busStop.removeFromQueue(person);
        assertEquals(0, busStop.getQueueCount());
    }




}
