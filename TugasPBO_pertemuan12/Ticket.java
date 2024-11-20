abstract class Ticket{
    private String planeName;
    private double basePrice;
    private String route;

    public Ticket(String planeName, double basePrice, String route){
        this.planeName = planeName;
        this.basePrice = basePrice;
        this.route = route;
    }

    public String getRouteInfo(){
        return route;
    }

    public String getPlaneName(){
        return planeName;
    }

    public double getBasePrice(){
        return basePrice;
    }

    public abstract double calculateFare();

    public abstract String getClassName();

    public abstract String getBenefits();

    public void ticketInfo(){
        System.out.println("===================Ticket details===================");
        System.out.println("Plane Name \t\t\t = " + getPlaneName());
        System.out.println("Class \t\t\t\t = " + getClassName());
        System.out.println("Route \t\t\t\t = " + getRouteInfo());
        System.out.println("Benefits \t\t\t = " + getBenefits());
        System.out.println("BasePrice \t\t\t = " + getBasePrice());
        System.out.println("FinalPrice \t\t\t = " + calculateFare());
    }
}






