import java.util.List;

import java.util.ArrayList;
public class RentalManager
{
    private List<Vehicle> vehicles;
    public RentalManager()
    {
        vehicles = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle)
    {
        vehicles.add(vehicle);
    }
    public void listAvailableVehicles()
    {
        for(int i =0;i<vehicles.size();i++)
        {
            if(vehicles.get(i).isRented() == false)
            {
               System.out.println(vehicles.get(i).getBrand());
               System.out.println(vehicles.get(i).getId());
               System.out.println(vehicles.get(i).getBaseDailyRate());
            }
        }
    }
    public void rentVehicle(String id,int days)
    {
        for (int i = 0;i<vehicles.size(); i++)
        {
            if(vehicles.get(i).getId().equals(id))
            {
                if(vehicles.get(i).isRented())
                {
                    System.out.println("the car is already rented");
                }
                else
                {
                    vehicles.get(i).rent();
                    System.out.println("price:" + vehicles.get(i).calculateRentalFee(days));
                }
                return;

            }
        }
        System.out.println("There is no car matching what you typed");

    }
    public void returnVehicle(String id)
    {
        for (int i= 0;i<vehicles.size();i++)
        {
            if(vehicles.get(i).getId().equals(id))
            {
                vehicles.get(i).returnVehicle();
                System.out.println("The vehicle has been returned");
                return;
            }

        }
        System.out.println("There is no car matching what you typed");
    }

}
