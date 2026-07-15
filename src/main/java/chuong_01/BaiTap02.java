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
public class BaiTap02 {
    public static void main(String[] args) {
        //khai bao 2 bien de nhan gia tri 
        String hoten;
        int tuoi;
        //tao luong doc gia tri tu ban phim
        Scanner sc = new Scanner(System.in);
        //nhan gia tri tu ban phim
        System.out.print("Cho biet ho ten ban:");
        hoten = sc.nextLine();
        System.out.print("Cho biet tuoi:");
        tuoi = sc.nextInt();
        //xuat ket qua
        System.out.println("Chao ban: " + hoten + ". Nam nay ban :" + tuoi + " tuoi");        
        
    }
}
