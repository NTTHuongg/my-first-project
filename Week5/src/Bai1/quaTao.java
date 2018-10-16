/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author hp
 */
public class quaTao extends hoaQua
{
    
    public quaTao(String giaBan, int soLuong, String nguonGoc, int ngayNhap, String doNgot) {
        super(giaBan, soLuong, nguonGoc, ngayNhap, doNgot);
    }
    
    public void nhap(){
        super.Nhap();
    }
    
    public void xuat(){
        super.Xuat();
    }
}
