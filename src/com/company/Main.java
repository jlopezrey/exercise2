package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World");
        int[] highTemp = {45,29,10, 22, 41,28, 33} ;
        int[] probPrecipitation = { 95, 60, 25, 5, 0, 75, 90};
        int temp = 32;
        int highPrecipitation = 50;
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"};

        for (int i = 0; i< days.length; i++) {
            if(highTemp[i]<=temp){
                if(probPrecipitation[i]>highPrecipitation){
                    System.out.println( "The high temperature for "+days[i] +" is " + highTemp[i] +" degrees fahrenheit with "+probPrecipitation[i]+"% probability of precipitation");}

            }


        }
    }
}
