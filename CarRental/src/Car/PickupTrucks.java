package Car;
import Car.*;

public class PickupTrucks
{
    public static void main(String args[])
    {
        Car3 seven = new Car3();
        seven.Insert(7, "日式皮卡车", 60, 5, 1);
        seven.Show();
        Car3 eight = new Car3();
        eight.Insert(8, "美式皮卡车", 60, 2, 3);
        eight.Show();
    }
}