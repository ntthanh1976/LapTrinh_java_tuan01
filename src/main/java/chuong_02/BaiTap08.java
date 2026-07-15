/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuong_02;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double toan, ly,hoa;
        double dtb;
        String kq="";
        Scanner sc = new Scanner(System.in);
        //b1. doc gia tri 3 mon thi
        System.out.print("Cho biet diem toan:");
        toan= sc.nextDouble();
        
        System.out.print("Cho biet diem ly:");
        ly= sc.nextDouble();
       
        System.out.print("Cho biet diem hoa:");
        hoa= sc.nextDouble();
        
        //b2. tinh toan dtb
        dtb = (toan+ly+hoa)/3;
        //b3.Xep loai
        if(dtb>=9)
        {
            kq="Xuat sac";
        }else if(dtb>=8)
        {
            kq="Gioi";
        }else if(dtb>=6.5)
        {
           kq="Kha";           
        }else if(dtb>=5)
        {
           kq="Trung binh";
        }else
        {
           kq="Yeu";
        }
        //b4. Xuat ket qua
        System.out.println("=====================");
        System.out.println("DTB:" + dtb);
        System.out.println("Xep loai:" + kq);
    }
    
}
