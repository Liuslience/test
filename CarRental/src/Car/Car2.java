package Car;

class Car2
{
    int Number;
    String Name;
    int Money;
    int CargoCapacity;

    public void Print()
    {
        System.out.println(this.Number+" "+this.Name+" "+this.Money+" "+this.CargoCapacity);
    }
    public void Show()
    {
        this.Print();
    }
    public void Insert(int number, String name, int money, int cargocapacity)
    {
        this.Number = number;
        this.Name = name;
        this.Money = money;
        this.CargoCapacity = cargocapacity;
    }
}
