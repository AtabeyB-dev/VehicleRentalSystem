public abstract class Vehicle implements Rentable
{
    private String id;
    private String brand;
    private double baseDailyRate;
    private boolean rented;
    public Vehicle(String id, String brand,double baseDailyRate)
    {
        this.id= id;
        this.brand =brand;
        this.baseDailyRate = baseDailyRate;
        this.rented = false;
    }
    @Override
    public void rent()
    {
        rented = true;
    }

    @Override
    public void returnVehicle()
    {
        rented = false;
    }
    @Override
    public boolean isRented()
    {
        return rented;
    }
    public abstract double calculateRentalFee(int days);
    public String getId()
    {
        return id;
    }
    public String getBrand()
    {
        return brand;
    }
    public double getBaseDailyRate()
    {
        return baseDailyRate;
    }
}
