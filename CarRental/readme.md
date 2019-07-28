#技术文档
##类的介绍
###Car1、2、3以及PassengerCar、Truck、PickupTruck
* 
	class Car1
	{
	    int Number;
	    String Name;
	    int Money;
	    int PeopleNum;
	
	    public void Print()
	    {
	        System.out.println(this.Number+" "+this.Name+" "+this.Money+" "+this.PeopleNum);
	    }
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
	    }
	}
* 主要为定义汽车数量、价格、载货量、载人量等基本属性，以及添加属性、展示属性的方法
###Monitor模块
* 接收来自键盘的用户的数据输入
* 进行数据的存储
* 对最终租车的结果进行计算
* 打印最终的结果并等待用户结束租车
###Client
* 调用各个模块，是程序运行