package day02;

import java.util.Scanner;

public class 变量数据类型键盘输入 {
    public static void main(String[] args) {
//  变量：数据类型 变量名=数据值；一条语句可以定义多个变量,使用前一定要赋值
        int a, b, c = 10;
        System.out.println(c);
//  字节是最小存储单元，一个字节有八个比特位

//  基本数据类型：整数、浮点数、字符、布尔
//  整数：byte1、short2、int4、long8
//  浮点数：float4、double8
//  取值范围大小关系：byte<short<int<long<float<double>char<boolean
//  字符：char2
//  布尔：boolean1
//  long类型数据必须以L结尾，大小写都可以
        long d = 10L;
//  浮点数类型数据必须以f结尾，大小写都可以
        float e = 10.0f;
//  标识符命名规则：由数字字母下划线美元符$构成
//  命名：appleYear,AppleYear

//  键盘录入：
        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
//      接受键盘录入的整数
        int num1 = sc.nextInt();
//      接受键盘录入的小数
        double num2 = sc.nextDouble();
//      接受键盘录入的文本字符串
        String num3 = sc.next();

        System.out.println(num1);

    }


}
