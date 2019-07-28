package Car;
import java.util.Scanner;

class Monitor {
    public static void Deal(int[] NumData, int[] DayData)
    {
        int MoneyCost = 0;
        int CargoVolume = 0;
        int ManVolume = 0;
        int TotalNum = 0;
        int[] CarMoney = new int[]{40, 65, 180, 30, 47, 80, 60, 60};
        double[] Cargo = new double[]{0, 0, 0, 1.5, 2.5, 4.5, 1, 3};
        int[] CarMan = new int[]{4, 7, 20, 0, 0, 0, 5, 2};
        for (int a = 0; a<=7; a++)
        {
            int b = a+1;
            System.out.println("请输入序号"+b+"的租用数量");
            NumData[a] = Listen();
            System.out.println("请输入序号"+b+"的租用天数");
            DayData[a] = Listen();
        }//接收来自客户的租车数量及天数
        for (int a = 0;a<=7;a++)
        {
            MoneyCost += NumData[a]*CarMoney[a]*DayData[a];
            ManVolume += NumData[a]*CarMan[a];
            CargoVolume += NumData[a]*Cargo[a];
            TotalNum += NumData[a];
        }//计算租车的结果
        for (int a = 0;a<=7;a++)
        {
            int b = a+1;
            System.out.println("序号为"+b+"的车租用数量为："+" "+NumData[a]+" "+"租用天数为："+" "+DayData[a]);
        }
        System.out.println("租车总花费为："+" "+MoneyCost+" "+"总载人量为："+" "+ManVolume+" "+"总载货量为："+" "+CargoVolume);
        /*
        进行最终信息的整合以及打印
         */
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextLine())
        {
            scan.close();
        }
    }
    public static int Listen()
    {
        int Accept1 = 0;
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        // nextInt方式接收字符串
        // 判断是否还有输入
        if (scan.hasNextLine())
        {
            Accept1 = scan.nextInt();
        }
//        scan.close();
        return Accept1;
    }
}