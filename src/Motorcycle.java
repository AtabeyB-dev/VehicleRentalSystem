public class Motorcycle extends Vehicle
{
    public  Motorcycle(String id,String brand,double baseDailyRate )
    {
        super(id,brand,baseDailyRate);
    }
    @Override
    public double calculateRentalFee(int days)
    {
        return (getBaseDailyRate() * days) * 0.8;
    }

}
