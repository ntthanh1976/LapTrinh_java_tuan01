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
public class BaiTap9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cho biet cuu chuong n[2-9]:");
        n = sc.nextInt();
        System.out.println("=====BANG CUU CHUONG " + n + "=======");
        for(int i=1;i<=10;i++)
        {
            System.out.println(i + " x " + n +"=" + (i*n));
        }        
    }
    
}
