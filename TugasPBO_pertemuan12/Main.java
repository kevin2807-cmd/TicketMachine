import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Ticket> tickets = new ArrayList<>();
        String route = "Jakarta - Surabaya";
        double basePriceGaruda = 2500000;
        double basePriceLion = 1700000;
        double basePriceCitilink = 2000000;

        tickets.add(new Bisnis("Garuda", basePriceGaruda, route));
        tickets.add(new Ekonomi("Garuda", basePriceGaruda, route));
        tickets.add(new FirstClass("Garuda", basePriceGaruda, route));

        
        tickets.add(new Bisnis("Lion", basePriceLion, route));
        tickets.add(new Ekonomi("Lion", basePriceLion, route));
        tickets.add(new FirstClass("Lion", basePriceLion, route));

        
        tickets.add(new Bisnis("Citilink", basePriceCitilink, route));
        tickets.add(new Ekonomi("Citilink", basePriceCitilink, route));
        tickets.add(new FirstClass("Citilink", basePriceCitilink, route));

        for(Ticket ticket : tickets){
            ticket.ticketInfo();
        }
    }
}