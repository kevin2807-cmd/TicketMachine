public class FirstClass extends Ticket{
    public FirstClass(String planeName, double basePrice, String route){
        super(planeName, basePrice, route);
    }

    @Override
    public double calculateFare(){
        return getBasePrice() * 1.5;
    }

    @Override
    public String getClassName(){
        return "FirstClass";
    }

    @Override 
    public String getBenefits(){
        return "Max baggage = 50Kg, Seat = VIP seat, Food & Drink = Free, Snack = Free, TV, Wifi";
    }
}