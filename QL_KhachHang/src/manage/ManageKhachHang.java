/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Jul 29, 2018.
	* @version 1.0
	*/

package manage;

import java.util.Scanner;

public class ManageKhachHang {

	public static void main(String[] args) {
		KhachHang[] khachhang = null;
		System.out.println("1. Moi ban nhap vao thong tin khach hang.");
		System.out.println("2. tim kiem thong tin tong luong khach hang.");
		System.out.println("3. ket thuc.");
		
		int choose;
		
		
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Moi ban chon.");
			
			try {
				choose = Integer.parseInt(input.nextLine());
				if (choose < 1 || choose > 3) {
					System.out.println(" moi ban nhap lai.");
				}
			} catch (NumberFormatException e) {
				choose = 0;
				System.out.println("lua chon phai nguyen va lon hon 0 nho hon 3.");
			}
			
			switch (choose) {
			case 1:
				int n;
				System.out.println("moi ban nhap vao so luong khach hang.");
				n = Integer.parseInt(input.nextLine());
				khachhang = new KhachHang[n];
				for (int i = 0; i < khachhang.length; i++) {
					khachhang[i]= new KhachHang();
					khachhang[i].nhapTT();
				}
				break;
			case 2:
				int x;
				System.out.println("moi ban nhap vao tong luong muon tim.");
				x = Integer.parseInt(input.nextLine());
				for (int i = 0; i < khachhang.length; i++) {
					if (khachhang[i].getTongLuong() >= x) {
						khachhang[i].hienthiTT();
					}
				}
				break;

			// default:
			// break;
			}
		} while (choose != 3);

	}

}
