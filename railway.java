import java.util.Scanner;

class railway {
    int ticket_no;
    String source, destination, train_name, name;
    Scanner scan = new Scanner(System.in);

    void details() {
        System.out.print("Enter the name = ");
        name = scan.next();
        System.out.print("Enter the ticket number = ");
        ticket_no = scan.nextInt();
        System.out.print("Enter the source(from) = ");
        source = scan.next();
        System.out.print("Enter the destination(to) = ");
        destination = scan.next();
        train_name = "Coimbatore Express";
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Ticket Number : " + ticket_no);
        System.out.println("Train Name : " + train_name);
        System.out.println("Source  : " + source);
        System.out.println("Destination : " + destination);
    }

    public static void main(String[] args) {
        railway rail = new railway();
        rail.details();
        rail.display();
    }
}
