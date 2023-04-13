package com.example.toanvu.duanmau_hoanthien.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.toanvu.duanmau_hoanthien.ListBookActivity;
import com.example.toanvu.duanmau_hoanthien.ListHoaDonActivity;
import com.example.toanvu.duanmau_hoanthien.LuotSachBanChayActivity;
import com.example.toanvu.duanmau_hoanthien.R;
import com.example.toanvu.duanmau_hoanthien.ThongKeDoanhThuActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Quản lý cửa Hàng Sách");
    }

    public void viewThongKe(View view) {
        Intent thongke = new Intent(MainActivity.this,ThongKeDoanhThuActivity.class);
        startActivity(thongke);
    }

    public void viewsachbanchay(View view) {
        Intent sachBC = new Intent(MainActivity.this,LuotSachBanChayActivity.class);
        startActivity(sachBC);
    }

    public void viewHoaDon(View view) {
        Intent hoadon = new Intent(MainActivity.this,ListHoaDonActivity.class);
        startActivity(hoadon);
    }

    public void viewSach(View view) {
        Intent SACH = new Intent(MainActivity.this,ListBookActivity.class);
        startActivity(SACH);
    }

    public void viewTheLoai(View view) {
        Intent theloai = new Intent(MainActivity.this,ListTheLoaiActivity.class);
        startActivity(theloai);
    }

    public void viewNguoidung(View view) {
        Intent nguoidung = new Intent(MainActivity.this,ListNguoiDungActivity.class);
        startActivity(nguoidung);
    }
}
