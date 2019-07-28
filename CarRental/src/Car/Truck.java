package Car;
import Car.*;

public class Truck
{
    public static void main(String args[])
    {
        Car2 four = new Car2();
        four.Insert(4, "低栏车", 30, 4);
        four.Show();
        Car2 five = new Car2();
        five.Insert(5, "高栏车", 47, 20);
        five.Show();
        Car2 six = new Car2();
        six.Insert(6, "厢式车", 80, 20);
        six.Show();
    }
}