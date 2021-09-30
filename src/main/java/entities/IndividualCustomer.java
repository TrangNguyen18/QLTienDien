package entities;

import java.util.Scanner;

public class IndividualCustomer extends Customer {
    protected double preNumber, currentNumber;

    public IndividualCustomer() {
    }

    public IndividualCustomer(double preNumber, double currentNumber) {
        this.preNumber = preNumber;
        this.currentNumber = currentNumber;
    }

    public void input(Scanner sc) {
        System.out.print("PreNumber = ");
        this.preNumber = sc.nextInt();
        System.out.print("CurrentNumber = ");
        this.currentNumber = sc.nextInt();
    }

    @Override
    public double calcBill() {
        double totalPrice = 0;
        double totalConsumption = this.currentNumber - this.preNumber;
        RetailElec[] array = RetailElec.getListRetailPrice();//lấy danh sách bảng giá điện
        for (int i = 0; i < array.length - 1; i++) {
            if (totalConsumption > array[i].max) {
                totalPrice += array[i].max * array[i].unitPrice;
            } else {
                totalPrice += (totalConsumption - array[i].min + 1) * array[i].unitPrice;
                break;
            }
        }
        return totalPrice;
    }
}
