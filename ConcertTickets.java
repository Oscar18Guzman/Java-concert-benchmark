import java.util.Scanner;

public class ConcertTickets {
    String headline;
    int price;
    String date;
    int numOfTickets;

    public String getInfo() {
        return ("Headline: " + headline + " |  price:  " + price + " |  Date:" + date + " |  Tickets remaining: "
                + numOfTickets);
    }

    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What movie: ");
        String first_name = input.next();
        if (first_name == headline) {
            System.out.println("ERRRR");
        }

        input.close();
    }

}