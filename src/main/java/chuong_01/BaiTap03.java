/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong_01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap03 {
    public static void main(String[] args) {
        //khai bao bien
        double bk;
        double dt,cv;              
        //tao luong doc gia tri tu ban phim
        Scanner sc = new Scanner(System.in);
        //doc ban kinh tu ban phim
        System.out.print("Cho biet ban kinh:");
        bk = sc.nextDouble();
        //tinh toan dien tich, cv
        dt = Math.PI*bk*bk;
        cv = Math.PI * bk*2;
        //xuat ket qua
        System.out.println("Dien tich: " + dt);     
        System.out.println("Chu vi: " + cv);   
        System.out.println("======xuat co dinh danh======");
        System.out.printf("Dien tich: %.1f\n", dt);
        System.out.printf("Chu vi: %.1f",  cv);    
    }
 
}
