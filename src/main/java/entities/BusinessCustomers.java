package entities;

import java.lang.management.ThreadInfo;
import java.util.Scanner;

public class BusinessCustomers extends Customer {
    protected int lowNumber, midNumber, highNumber,sourceType;

    public BusinessCustomers() {
    }

    public BusinessCustomers(int lowNumber, int midNumber, int highNumber) {
        this.lowNumber = lowNumber;
        this.midNumber = midNumber;
        this.highNumber = highNumber;
    }

    public void input(Scanner sc) {
        System.out.print("sourceType = ");
        this.sourceType= sc.nextInt();// xác định customer sử dụng nguồn điện :  lớn hơn 22kv, từ 6 đến 22kv, dưới 6kv
        System.out.print("LowNumber = ");
        this.lowNumber = sc.nextInt();
        System.out.print("MidNumber = ");
        this.midNumber = sc.nextInt();
        System.out.print("HighNumber = ");
        this.highNumber = sc.nextInt();
    }

    @Override
    public double calcBill() {
        BusinessElec[] arrayBusiness = BusinessElec.getListBusinessPrice(this.sourceType);//lấy bảng giá điện cho Business Customer
        return ((this.lowNumber * arrayBusiness[0].pricePerLevel) + (this.midNumber * arrayBusiness[1].pricePerLevel) + (this.highNumber * arrayBusiness[2].pricePerLevel));
    }
}
