package com.xiaoyu.day01;

import java.util.Random;
import java.util.Scanner;

public class 利用AI示例 {
    public static void main(String[] args){

    // 彩票中奖案例，生成一个七位的随机数表示彩票号码，键盘录入一个七位数表示用户购买的彩票，如果用户购买的彩票与随机数相同，就恭喜用户中奖，否则就提示用户未中奖。

        // 1.生成一个七位的随机数表示彩票号码
        Random random = new Random();
        int lotteryNumber = random.nextInt(9000000) + 1000000;
        System.out.println("本期中奖号码为：" + lotteryNumber);

        Scanner scanner = new Scanner(System.in);

        // 2.键盘录入一个七位数表示用户购买的彩票
        System.out.print("请输入您购买的七位彩票号码：");
        int userNumber = scanner.nextInt();

        // 3.判断用户购买的彩票是否与随机号码相同
        if (userNumber == lotteryNumber) {
            System.out.println("恭喜您中奖了！");
        } else {
            System.out.println("很遗憾，您未中奖。");
        }

        scanner.close();
    }
}