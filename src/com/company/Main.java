package com.company;

public class Main {
    // Think Java - Exercise 5.5                            Steps:

    public static void main(String[] args) {                //1
        boolean flag1 = isHoopy(202);                       //2
        boolean flag2 = isFrabjuous(202);                   //9
        System.out.println(flag1);                          //16
        System.out.println(flag2);                          //17
        if (flag1 && flag2) {                               //18
            System.out.println("ping!");                    //19
        }
        if (flag1 || flag2) {                               //20
            System.out.println("pong!");                    //21
        }
    }                                                       //22
    public static boolean isHoopy(int x) {                  //3
        boolean hoopyFlag;                                  //4
        if (x % 2 == 0) {                                   //5
            hoopyFlag = true;                               //6
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag;                                   //7
    }                                                       //8
    public static boolean isFrabjuous(int x) {              //10
        boolean frabjuousFlag;                              //11
        if (x > 0) {                                        //12
            frabjuousFlag = true;                           //10
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;                               //14
    }                                                       //15


}                                                           //24
