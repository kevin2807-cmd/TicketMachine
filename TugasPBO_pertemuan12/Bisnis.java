public class Bisnis extends Ticket{
    public Bisnis(String planeName, double basePrice, String route){
        super(planeName, basePrice, route);
    }

    @Override
    public double calculateFare(){
        return getBasePrice() * 1.25;
    }

    @Override 
    public String getClassName(){
        return "Bisnis";
    }

    @Override
    public String getBenefits(){
        return "Max baggage = 35Kg, Seat = Premium, Food & Drink = Free";
    }
}
