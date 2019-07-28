package Car;

class Car1
{
    int Number;//租用数量
    String Name;//汽车名称
    int Money;//租车费用
    int PeopleNum;//载人数量

    public void Print()
    {
        System.out.println(this.Number+" "+this.Name+" "+this.Money+" "+this.PeopleNum);
    }//进行租车信息的展示
    public void Show()
    {
        this.Print();
    }
    public void Insert(int number, String name, int money, int peoplenum)
    {
        this.Number = number;
        this.Name = name;
        this.Money = money;
        this.PeopleNum = peoplenum;
    }//添加租车信息
}
