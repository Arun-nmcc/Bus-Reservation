import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    String bookingN0 = "";
 static int i;
    Date date;

    public Booking(int size) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter passenger name: ");
        passengerName  = scan.next();
        System.out.println(size);
        do{
        System.out.println("enter bus number: ");
        busNo = scan.nextInt();

        if ((busNo > size) || busNo <= 0)
            System.out.println("this bus not available");
        }while(busNo > size || busNo <= 0);
        System.out.println("Enter the date dd/MM/yyyy");
        String dates = scan.next();
       SimpleDateFormat prarse = new SimpleDateFormat("dd/MM/yyyy");
       date = prarse.parse(dates);
    }
    public static boolean isDeleted(String num, ArrayList<Booking> book) {

        for (Booking check:book) {

            String c = check.bookingN0;

         if (c.equals(num))

              return book.remove(check);



        }

        return false;
    }

    public boolean isAvailable(ArrayList<Booking> book, ArrayList<Buses> bus) {
        int capacity = 0;
        for (Buses buses: bus) {

            if (buses.getBusNo() == busNo){

                capacity = buses.getCapacity();
            }

        }

        int count = 0;

        for (Booking b:book) {
            if (b.busNo == busNo && b.date.equals(date)){
                count++;
            }

        }
        if (count < capacity){
            bookingN0 = ""+busNo+""+ ++i;
        }
        return count<capacity?true:false;
    }

}
