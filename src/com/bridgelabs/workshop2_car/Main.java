package com.bridgelabs.workshop2_car;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TataCar<String> tataCar = new TataCar<>();
        System.out.println(tataCar.acceleration("Accelerated applied and the speed is 60km/hr"));
        System.out.println(tataCar.breaking("Break applied"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number tata car details needs to be uploaded");
        int n = sc.nextInt();
         for(int i = 0; i < n ; i++) {
             System.out.println("Name of the brand");
             String brand = sc.next();
             System.out.println("Name of the model");
             String model = sc.next();
             System.out.println("Name of the top speed");
             String topSpeed = sc.next();
             System.out.println("Name of the fuel type");
             String fuelType = sc.next();
             tataCar.addCarDetails(brand,model,topSpeed,fuelType,n);
             System.out.println(tataCar.tatacars.get(i));;
         }
    }
}
