public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric()
  {
    return electric;
  }

  public boolean isDiscountApplied()
  {
    return discountApplied;
  }

  public void printCar()
  {
    System.out.println("License Plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nPassenger: " + getPassengers() + "\nElectric? " + electric + "\nDiscount applied? " + discountApplied);
  }

  public boolean dropOffPassengers(int numOut)
  {
    if (numOut >= getPassengers())
    {
      return false;
    }
    else
    {
      setPassengers(getPassengers() - numOut);
      return true;
    }
  }

  public void applyDiscount()
  {
    if (discountApplied == false && isElectric() == true)
    {
      setTollFee(getTollFee() * 0.5);
      discountApplied = true;
    }
  }
}