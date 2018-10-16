/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class hoaQua {
    
    private String  giaBan;
    private int  soLuong;
    private String nguonGoc;
    private int ngayNhap;
    private String doNgot;

    public hoaQua(String giaBan, int soLuong, String nguonGoc, int ngayNhap, String doNgot) {
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nguonGoc = nguonGoc;
        this.ngayNhap = ngayNhap;
        this.doNgot = doNgot;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getDoNgot() {
        return doNgot;
    }

    public void setDoNgot(String doNgot) {
        this.doNgot = doNgot;
    }
    
    hoaQua(){}
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Giá bán: ");
        giaBan=sc.nextLine();
        System.out.print("Số lượng: ");
        soLuong=sc.nextInt();
        System.out.print("Nguồn gốc: ");
        nguonGoc=sc.nextLine();
        System.out.print("Ngày nhập: ");
        ngayNhap=sc.nextInt();
        System.out.print("Độ ngon ngọt: ");
        doNgot=sc.nextLine();        
    }
    
    public void Xuat(){
        System.out.println("\nGiá bán: " + giaBan );
        System.out.println("\nSố lượng: " + soLuong );
        System.out.println("\nNguồn gốc: " + nguonGoc );
        System.out.println("\nNgày nhập: " + ngayNhap );
        System.out.println("\nĐộ ngon ngọt: " + doNgot );        
    }
    
}
