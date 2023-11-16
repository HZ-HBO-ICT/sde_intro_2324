import java.util.ArrayList;

public class Bus implements Enterable{

    private ArrayList<Human> seats;

    public Bus() {
        this.seats = new ArrayList<>();
    }

    public void enter(Human passenger) {

        this.seats.add(passenger);
    }

    @Override
    public Human leave() {
        return null;
    }

    public void report() {
        for (Human passenger :this.seats) {
            System.out.printf(passenger.name + ", ");
        }
        System.out.println("are on board of the bus.");
    }
}
