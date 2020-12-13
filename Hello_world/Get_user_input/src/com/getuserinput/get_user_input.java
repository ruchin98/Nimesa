package com.getuserinput;

import java.util.Scanner;
import com.getdata.get_data;

public class get_user_input {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("");
            System.out.println("Please enter the option 1: to get temperature | 2: to get wind_speed | 3: to get pressure | 0: to terminate the program");
            int opt;
            opt = sc.nextInt();
            sc.nextLine();
            if(opt == 1)
            {
                System.out.println("Please enter the datetime in 'yyyy-mm-dd hh:mm:ss' ");
                String s = sc.nextLine();
                get_data.get_temp(s);
            }
            else if(opt == 2)
            {
                System.out.println("Please enter the datetime in 'yyyy-mm-dd hh:mm:ss' ");
                String s = sc.nextLine();
                get_data.get_windSpeed(s);
            }
            else if(opt == 3)
            {
                System.out.println("Please enter the datetime in 'yyyy-mm-dd hh:mm:ss' ");
                String s = sc.nextLine();
                get_data.get_pressure(s);
            }
            else if(opt == 0)
            {
                System.out.println("The Program has been terminated");
                break;
            }
            else {
                System.out.println("Invalid option, please try again");
            }
        }

    }
}
