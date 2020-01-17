class ConcertTicketsTestDrive {
    public static void main(String[] args) {
        ConcertTickets concertOne = new ConcertTickets();
        concertOne.headline = "Drake";
        concertOne.price = 20;
        concertOne.date = "May 4, 7:00pm";
        concertOne.numOfTickets = 20;

        ConcertTickets concertTwo = new ConcertTickets();
        concertTwo.headline = "Lady Gaga";
        concertTwo.price = 20;
        concertTwo.date = "May 24, 9:30pm";
        concertTwo.numOfTickets = 30;

        ConcertTickets concertThree = new ConcertTicket bs();
        concertThree.headline = "The Weezers";
        concertThree.price = 10;
        concertThree.date = "May 5, 7:30pm";
        concertThree.numOfTickets = 20;

        ConcertTickets concertFour = new ConcertTickets();
        concertFour.headline = "Travis Scott";
        concertFour.price = 30;
        concertFour.date = "May 14, 7:30pm";
        concertFour.numOfTickets = 19;

        System.out.println(concertOne.getInfo());
        System.out.println(concertTwo.getInfo());
        System.out.println(concertThree.getInfo());
        System.out.println(concertFour.getInfo());
    }
}
