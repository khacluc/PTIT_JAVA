/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 29, 2018.
	* @version 1.0
	*/
package manage;

import java.util.Scanner;

public class KhachHang {
	private String maKH, hoTen;
	private int namSinh;
	private double tongLuong;
	
	public KhachHang() {
		
	}
	
	public KhachHang(String maKH) {
		super();
		this.maKH = maKH;
	}

	public KhachHang(String maKH, String hoTen, int namSinh, double tongLuong) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.tongLuong = tongLuong;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getTongLuong() {
		return tongLuong;
	}

	public void setTongLuong(double tongLuong) {
		this.tongLuong = tongLuong;
	}
	
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("input ma khach hang.");
		maKH = input.nextLine();
		System.out.println("input ho ten khach hang.");
		hoTen = input.nextLine();
		System.out.println("input nam sinh khach hang.");
		namSinh = Integer.parseInt(input.nextLine());
		System.out.println("input luong khach hang.");
		tongLuong = Double.parseDouble(input.nextLine());
	}
	
	public void hienthiTT() {
		System.out.println("ma khach hang: "+ getMaKH());
		System.out.println("ho ten khach hang: "+ getHoTen());
		System.out.println("nam sinh khach hang: "+ getNamSinh());
		System.out.println("luong khach hang: "+ getTongLuong());
	}
		

}
