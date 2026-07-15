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
public class BaiTap10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //khai bao mang
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cho biet so phan tu (n>0):");
        n= sc.nextInt();
        //cap phat mang co n phan tu
        a =new int[n];
        //goi phuong thuc nhap mang
        nhapMang(a);    
        int sum = tinhTong(a); //goi phuong thuc tinh tong
        
        //tim gia tri lon nhat
        int max = timMax(a);        
        //tim gia tri nho nhat
        int min = timMin(a);
        //dem so chan
        int dem_chan = demChan(a);
        //tinh gia tri trung binh
        double tb = tinhTB(a);
        
        System.out.println("=========KET QUA=========");
        System.out.println("Tong mang:" + sum);
        System.out.println("Gia tri lon nhat:" + max);
        System.out.println("Gia tri nho nhat:" + min);
        System.out.println("So luong phan tu chan:" + dem_chan);
        System.out.println("Gia tri trung binh cua mang:" + tb);
        
    }
    
    //=======phuong thuc nhap mang
    public static void nhapMang(int[] a)
    {
        Scanner sc = new Scanner(System.in);
        //====nhap gia tri cac phan tu cua mang
        for(int i=0;i<a.length;i++)
        {
            System.out.print("Nhap a[" + i +"]:");
            a[i]= sc.nextInt();
        }
    }
    //=======phuong thuc tinh tong mang
    public static int tinhTong(int[] a)
    {
       //tinh tong mang
        int s=0;
//        for(int i=0;i<a.length;i++)
//        {
//           s += a[i];  //s=s+a[i]
//        }
//        
          for(int x : a){
             s+= x;
          }
        return s;
    }
    
   //=======phuong thuc tim max 
    public static int timMax(int[] a)
    {
        int max=a[0];        
        for(int i=1;i<a.length;i++)
        {
           if(max<a[i]) 
             max = a[i];
        }
        return max;
    }
    
    //=======phuong thuc tim min 
    public static int timMin(int[] a)
    {
        int min=a[0];        
        for(int i=1;i<a.length;i++)
        {
           if(min>a[i]) 
             min = a[i];
        }
        return min;
    }
    
    //=======phuong thuc dem so chan 
    public static int demChan(int[] a)
    {
        int dem=0;        
        for(int i=0;i<a.length;i++)
        {
           if(a[i]%2==0)
               dem++;
        }
        return dem;
    }
    
      //=======phuong thuc tinh trung binh cong
    public static double tinhTB(int[] a)
    {
        int s=0;        
        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
        }
        return (double)s/a.length;
    }   
    
}
