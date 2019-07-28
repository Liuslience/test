package Car;
import Car.*;

public class Client
{
    public static void main(String args[])
    {
        int[] CarNumber = new int[8];
        int[] CarDay = new int[8];
        System.out.println("Welcomg!");
        PassengerCar.main(args);
        Truck.main(args);
        PickupTrucks.main(args);
        Monitor.Deal(CarNumber, CarDay);
        /*
        调用各个模块
         */
    }
}
