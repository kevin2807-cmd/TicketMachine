public class Ekonomi extends Ticket{
    public Ekonomi(String planeName, double basePrice, String route){
        super(planeName, basePrice, route);
    }

    @Override
    public double calculateFare(){
        return getBasePrice() * 0.9;
    }

    @Override
    public String getClassName(){
        return "Ekonomi";
    }

    @Override
    public String getBenefits(){
        return "Max baggage = 25kg, Seat = Standard";
    }
}