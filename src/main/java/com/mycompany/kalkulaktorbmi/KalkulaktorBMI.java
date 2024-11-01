 
package com.mycompany.kalkulaktorbmi;
import java.util.Scanner;
public class KalkulaktorBMI { 

    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            int jenisKelamin, hasil;
            float berat, tinggi, bmi, meter;
            double broca;
            System.out.println("Program Java Menghitung Berat Badan Ideal");
            System.out.println("1. pria");
            System.out.println("2. wanita");
            System.out.print("masukan jenis kelamin (1 atau 2):");
            jenisKelamin = input.nextInt(); 
            System.out.print("masukan berat badan(kg):");
            berat = input.nextFloat();
            System.out.print("masukan tinggi badan(cm):");
            tinggi = input.nextFloat();
            meter = tinggi / 100;
            bmi = (berat / (meter * meter));
            System.out.print("BMI = " + bmi +" " );
            if(bmi < 18.5){
                System.out.println ("kurus");
            }else if (bmi <= 22.9){
                System.out.println("normal");
            }else {
                System.out.println("obesitas");     
            }
            broca = switch (jenisKelamin) {
                case 1 -> (tinggi - 100)-(0.10 * (tinggi - 100));
                case 2 -> (tinggi - 100)- (0.15 * (tinggi - 100));
                default -> 0;
            };
            hasil = (int)broca;
            System.out.println("Berat badan ideal anda menurut broca = " + hasil + "kg");
        }
    }
}