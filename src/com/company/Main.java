package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //q1
        /**int[] marks = new int[10];
        int fail=0;
        for (int n=0;n<10;n++){
            Scanner input= new Scanner(System.in);
            System.out.println("enter your marks: ");
            int stmarks= input.nextInt();

            if (stmarks<40){
                fail=fail+1;

            }
            marks[n]=stmarks;

        }
        System.out.println(Arrays.toString(marks));
        System.out.println(fail+" Students are failed");**/


        //q2
        /**int[]marks= new int[10];
        int tot;
        double[]marks= new double[10];
        double tot;
        int fail = 0;
        for (int n=0;n<10;n++){
            Scanner input= new Scanner(System.in);
            System.out.println("Enter your marks: ");
            int stmarks= input.nextInt();
            marks[n]=stmarks;

        }
        for (int i=0;i<10;i++){
            int latemarks= marks[i];
            double latemarks= marks[i];
            tot = latemarks-((latemarks*10)/100);
            marks[i]=tot;
            if (tot<40){
                fail= fail+1;

            }
            

        }

        System.out.println("Final marks = "+Arrays.toString(marks));

        System.out.println(fail+" students are failed");
        System.out.println(fail+" students are failed");
**/

        //q3
        /**double[] num= new double[100];
        for (int i=0;i<100;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("eneter a number: ");
            double number = input.nextDouble();

            num[i]=number;

        }
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        double num1=num[99];
        System.out.println(num1);**/

        //q4
        /**int[] array={1,2,3,4,5};
        int[] new_array=new int[array.length];
        for(int n=0;n<array.length-1;n++){
            new_array[n+1]=array[n];
          ? new_array[0]=array[array.length-1];
       /}/
        Sy/tem.out.println(Arrays.toString(new_array));**/

        //q5
        /**double[] num= new double[20];
        for (int n=0;n<20;n++){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            double numbers=input.nextDouble();

            num[n]= numbers;

        }
        System.out.println(Arrays.toString(num));
        Scanner input1= new Scanner(System.in);
        System.out.println("enter your i: ");
        int i = input1.nextInt();

        Scanner input2= new Scanner(System.in);
        System.out.println("enter your j: ");
        int j=input2.nextInt();

        double x=  num[i-1];
        double y=  num[j-1];

        num[i-1]=y;
        num[j-1]=x;

        System.out.println(Arrays.toString(num));**/











    }
}
