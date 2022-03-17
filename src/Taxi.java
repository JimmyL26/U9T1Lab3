public class Taxi extends Car{
    double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected)
    {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi()
    {
        printCar();
        System.out.println("Total Fare Collected: " + fareCollected);
    }
}
