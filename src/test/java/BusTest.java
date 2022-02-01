import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private Person person2;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("George Square", 1);
        person = new Person();
        person2 = new Person();
        busStop = new BusStop("Govanhill");
        busStop.addToQueue(person);

    }

    @Test
    public void hasDestination() {
        assertEquals("George Square", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bus.getCapacity());
    }

    @Test
    public void passengerListStartsEmpty() {
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canAddPassengerIfHasCapacity() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void cannotAddPassengerIfNoCapacity() {
        bus.addPassenger(person);
        bus.addPassenger(person2);
        assertEquals(1, bus.getPassengerCount());
        assertEquals(person, bus.getPassengers().get(0));
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        assertEquals(true, bus.removePassenger(person));
        assertEquals(0, bus.getPassengerCount());

    }

    @Test
    public void canPickUp() {
        bus.pickUp(busStop, person);
        assertEquals(person, bus.getPassengers().get(0));
        assertEquals(0, busStop.getQueueCount());
    }

}
