package hw4;

import java.io.*;
import java.util.*;

public class Console {
    public static void main(String[] args) throws IOException {
        System.out.println("欢迎使用租车系统");
        System.out.println("你是否要租车：1=是   0=否");
        /*InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);*/
        Scanner scan = new Scanner(System.in);
        int input =  Integer.parseInt(scan.next());
        if (input != 1)
            return;
        System.out.println("您可租车的类型及其价目表\n" +
                "序号：1  汽车名称:奥迪A4 租金500/天 容量：最多载人4人 \n" +
                "序号：2  汽车名称:马自达6 租金400/天 容量：最多载人4人 \n" +
                "序号：3  汽车名称:皮卡雪6 租金450/天 容量：最多载人4人，最多载货2吨\n" +
                "序号：4  汽车名称:金龙 租金800/天 容量：最多载人20人 \n" +
                "序号：5  汽车名称:松花江 租金400/天 容量：最多载货4吨 \n" +
                "序号：6  汽车名称:依维柯 租金1000/天 容量：最多载货20吨 \n" +
                "请输入您要租汽车的数量：");

        int carNum = Integer.parseInt(scan.next());
        System.out.println("请输入您要租车的序号和天数");
        ArrayList<Order> order = new ArrayList<>(carNum);
        int carType = 0, rentDay = 0, totalPrice = 0;
        Vehicle[] vehicle = new Vehicle[6];
        vehicle[0] = new paxCar(1, "奥迪A4", 500, 4);
        vehicle[1] = new paxCar(2, "马自达6", 400, 4);
        vehicle[2] = new paxNcargoCar(3, "皮卡雪6", 450, 4, 2);
        vehicle[3] = new paxCar(4, "金 龙 ", 800, 20);
        vehicle[4] = new cargoCar(5, "松花江 ", 400, 4);
        vehicle[5] = new cargoCar(6, "依维柯 ", 1000, 20);

        for (int i = 0; i < carNum; i++) {
            if (scan.hasNext()) {
                String str0 = scan.next();
                carType = Integer.parseInt(str0);
            }
            if (scan.hasNext()) {
                String str1 = scan.next();
                rentDay = Integer.parseInt(str1);
            }
            order.add(new Order(carType, rentDay));

            totalPrice += rentDay * vehicle[carType].rent;
        }
        scan.close();

        System.out.println("您的账单：");
        for (int i = 0; i < carNum; i++) {
            carType = order.get(i).carType;
            rentDay = order.get(i).rentDay;
            System.out.println(vehicle[carType - 1].toString() + "\t" + rentDay + "天");
        }
        System.out.println("总价格：" + totalPrice + "元");
    }
}
