//wap to find area
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("enter height=");
        int a1=s1.nextInt();
        System.out.println("enter base=");
        int b1=s1.nextInt();
        float area;
        area=0.5f*a1*b1;
        System.out.println("area is="+ area);

    }
}
