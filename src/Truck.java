public class Truck  extends  Vehicle
{
    public Truck(String id,String brand,double basedailyrate)
    {
        super(id,brand,basedailyrate);
    }
    @Override
    public double calculateRentalFee(int days)
    {
        return (getBaseDailyRate() * days) * 1.5;
    }
}
