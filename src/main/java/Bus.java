import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.getPassengerCount() < this.getCapacity()) {
            this.passengers.add(person);
        }
    }

    public ArrayList<Person> getPassengers() {
        return passengers;
    }

    public boolean removePassenger(Person person) {
        return passengers.remove(person);
    }

    public void pickUp(BusStop busStop, Person person) {
        this.passengers.add(person);
        busStop.removeFromQueue(person);

    }
}
