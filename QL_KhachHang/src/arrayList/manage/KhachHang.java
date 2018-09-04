/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Aug 9, 2018.
	* @version 1.0
	*/
package arrayList.manage;

import java.util.Scanner;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private int namsinh;
	private double tongLuong;
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhachHang(String maKH, String hoTen, int namsinh, double tongLuong) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.namsinh = namsinh;
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
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public double getTongLuong() {
		return tongLuong;
	}
	public void setTongLuong(double tongLuong) {
		this.tongLuong = tongLuong;
	}
	
	// method nhap thong tin
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("please maKH: ");
		maKH = input.nextLine();
		System.out.println("please hoTen: ");
		hoTen = input.nextLine();
		System.out.println("please input namsinh: ");
		namsinh = Integer.parseInt(input.nextLine()); // chong troi lenh
		System.out.println("please input tongLuong");
		tongLuong = Double.parseDouble(input.nextLine());
		
	}
	
	// method hien thi thong tin
	public void hienThiTT() {
		System.out.println("-------------------------");
		System.out.println("maKH "+ getMaKH());
		System.out.println("hoTen "+ getHoTen());
		System.out.println("namsinh "+ getNamsinh());
		System.out.println("tongLuong "+ getTongLuong());
	}

}
