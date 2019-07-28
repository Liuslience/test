package Car;
import Car.*;

public class PassengerCar
{

    public static void main(String args[])
    {
        Car1 one = new Car1();//创建新的对象
        one.Insert(1, "小轿车", 40, 4);//添加车辆信息
        one.Show();//展示车辆信息
        Car1 two = new Car1();
        two.Insert(2, "面包车", 65, 7);
        two.Show();
        Car1 three = new Car1();
        three.Insert(3, "大巴车", 180, 20);
        three.Show();
    }
}
