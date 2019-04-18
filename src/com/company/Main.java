package com.company;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> temperatureList = new ArrayList<Double>();


        //Adding items to your ArrayList is simple and fun with the add method.
        temperatureList.add(40.5);
        temperatureList.add(33.9);
        temperatureList.add(37.8);
        temperatureList.add(15.3);
        temperatureList.add(25.6);

        for (Double temp:temperatureList) {
            System.out.println(temp);

        }

        int searchIndex = Collections.binarySearch(temperatureList, 39.8);
        Collections.shuffle(temperatureList);
        if(searchIndex >=0){
            System.out.println("Temperature found." + searchIndex);
        }else{
            System.out.println("Temperature not found." + searchIndex);
        }

    }


}
