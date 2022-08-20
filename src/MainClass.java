import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws ParseException {
        ArrayList<Buses> bus = new ArrayList<>();
        ArrayList<Booking> book = new ArrayList<>();
        bus.add(new Buses(1,4,false));

        bus.add(new Buses(2,2,true));

        bus.add(new Buses(3,3,false));
        for (Buses b: bus)
            System.out.println(b);

        int option = 1;

        Scanner scan = new Scanner(System.in);
        while(option == 1 || option == 3){


        System.out.println("Enter 1 to book and 2 to exit for cancellation 3");
       option = scan.nextInt();

       if (option == 1){

          Booking booking = new Booking(bus.size());

          if (booking.isAvailable(book,bus)){

              book.add(booking);
              System.out.println("note your booking no for future reference :"+booking.bookingN0);
              System.out.println("your booking confirmed");
          }

          else
              System.out.println("all seates are booked try another date or bus");
       }

       if (option == 3){
           System.out.println("enter the booking number");
           String num = scan.next();
           if(Booking.isDeleted(num,book)){
               System.out.println("done");
           }else {
               System.out.println("Enter valid number");
           }



            }
    }
    }


}
