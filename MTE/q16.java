import java.util.ArrayList;
import java.util.List;

class q16 {
    private List<String> availableFlights;
    private List<String> availableHotels;
    private List<String> bookedReservations;

    public q16() {
        availableFlights = new ArrayList<>();
        availableHotels = new ArrayList<>();
        bookedReservations = new ArrayList<>();
    }

    public void addFlight(String flight) {
        availableFlights.add(flight);
    }

    public void addHotel(String hotel) {
        availableHotels.add(hotel);
    }

    public void displayAvailableFlights() {
        System.out.println("Available Flights:");
        for (String flight : availableFlights) {
            System.out.println(flight);
        }
    }

    public void displayAvailableHotels() {
        System.out.println("Available Hotels:");
        for (String hotel : availableHotels) {
            System.out.println(hotel);
        }
    }

    public void bookReservation(String reservation) {
        bookedReservations.add(reservation);
        System.out.println("Reservation booked: " + reservation);
    }

    public void cancelReservation(String reservation) {
        if (bookedReservations.contains(reservation)) {
            bookedReservations.remove(reservation);
            System.out.println("Reservation canceled: " + reservation);
        } else {
            System.out.println("Reservation not found: " + reservation);
        }
    }
    public static void main(String[] args) {
        q16 travelAgency = new q16();

        // Adding some flights and hotels
        travelAgency.addFlight("Flight 1");
        travelAgency.addFlight("Flight 2");
        travelAgency.addHotel("Hotel A");
        travelAgency.addHotel("Hotel B");

        // Displaying available flights and hotels
        travelAgency.displayAvailableFlights();
        travelAgency.displayAvailableHotels();

        // Booking a reservation
        travelAgency.bookReservation("Flight 1");
        travelAgency.bookReservation("Hotel A");

        // Displaying booked reservations
        System.out.println("Booked Reservations:");
        for (String reservation : travelAgency.bookedReservations) {
            System.out.println(reservation);
        }

        // Canceling a reservation
        travelAgency.cancelReservation("Flight 1");

        // Displaying booked reservations after cancellation
        System.out.println("Booked Reservations after Cancellation:");
        for (String reservation : travelAgency.bookedReservations) {
            System.out.println(reservation);
        }
    }
}
