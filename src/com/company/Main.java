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
        int fail = 0;
        for (int n=0;n<10;n++){
            Scanner input= new Scanner(System.in);
            System.out.println("Enter your marks: ");
            int stmarks= input.nextInt();
            marks[n]=stmarks;

        }
        for (int i=0;i<10;i++){
            int latemarks= marks[i];
            tot = latemarks-((latemarks*10)/100);
            marks[i]=tot;
            if (tot<40){
                fail= fail+1;

            }
            

        }

        System.out.println("Final marks = "+Arrays.toString(marks));
        System.out.println(fail+" students are failed");**/

        //q3


    }
}
