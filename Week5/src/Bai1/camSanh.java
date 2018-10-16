
package Bai1;


public class camSanh extends quaCam
{
    
    public camSanh(String giaBan, int soLuong, String nguonGoc, int ngayNhap, String doNgot) {
        super(giaBan, soLuong, nguonGoc, ngayNhap, doNgot);
    }
    
    @Override
    public void nhap(){
        super.Nhap();
    }
    
    @Override
    public void xuat(){
        super.Xuat();
    }
}
