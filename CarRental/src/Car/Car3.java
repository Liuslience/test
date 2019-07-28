package Car;

class Car3
{
    int Number;
    String Name;
    int Money;
    int PeopleNum;
    int CargoCapacity;

    public void Print()
    {
        System.out.println(this.Number+" "+this.Name+" "+this.Money+" "+this.PeopleNum+" "+this.CargoCapacity);
    }
    public void Show()
    {
        this.Print();
    }
    public void Insert(int number, String name, int money, int peoplenum, int cargocapacity)
    {
        this.Number = number;
        this.Name = name;
        this.Money = money;
        this.PeopleNum = peoplenum;
        this.CargoCapacity = cargocapacity;
    }
}
