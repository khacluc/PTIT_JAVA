/*
	* (Copyright 2018 Fresher Acadamy. 
	* 
	* @author Blue_NoWhere.
	* @date Aug 9, 2018.
	* @version 1.0
	*/

package arrayList.manage;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageKhachHang {
	public static void main(String[] args) {
		ArrayList<KhachHang> danhsach = new ArrayList<>();
		// KhachHang khachhang = new KhachHang();
		// danhsach.add(khachhang);
		System.out.println("-----menu manage khach hang-----");
		System.out.println("1. Nhap vao n khach hang");
		System.out.println("2. Hien thi thong tin khach hang");
		System.out.println("3. hien thi thong tin khach hang co tong luong lon hon x");
		System.out.println("4. exit");
		Scanner input = new Scanner(System.in);
		int choose;

		do {
			System.out.println("--------------------------");
			System.out.println("please choose: ");
			// ngoai le khi nhap lua chon khac interge
			try {
				choose = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				choose = 0;
				System.out.println("please interge input.");
			}

			// thuc hien bang ung dung
			switch (choose) {
			case 1:

				int n;
				System.out.println("---------------------");
				System.out.println("please input number: ");

				n = Integer.parseInt(input.nextLine());
				for (int i = 0; i < n; i++) {
					KhachHang khachhang = new KhachHang();
					khachhang.nhapTT();
					danhsach.add(khachhang);
				}
				break;
			case 2:
				// hien thi thong tin khach hang
				for (int i = 0; i < danhsach.size(); i++) {
					danhsach.get(i).hienThiTT();
				}
				break;
			case 3:
				// hien thi thong tin tong luong lon hon x
				int x;
				System.out.println("please input x: ");
				System.out.println("-----------------------");
				x = Integer.parseInt(input.nextLine());
				for (int i = 0; i < danhsach.size(); i++) {
					if (danhsach.get(i).getTongLuong() > x) {
						danhsach.get(i).hienThiTT();
					}
				}

				break;
			/*
			 * case 4:
			 * 
			 * break;
			 */

			default:
				break;
			}

		} while (choose != 4);

	}
}
