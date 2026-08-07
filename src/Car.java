public class Car extends Vehicle
{
    public Car(String id, String brand, double baseDailyRate) {
        super(id, brand, baseDailyRate);
    }

    @Override
    public double calculateRentalFee(int days)
    {
        return getBaseDailyRate() * days;
    }
}
