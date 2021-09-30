import entities.BusinessCustomers;
import entities.IndividualCustomer;
import entities.Customer;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 4;
        Customer[] arrCustomers = new Customer[n];
        for (int i = 0; i < n-1; i++) {
            // type = 1 --> Indi Cus
            // type = 2 --> Business Cus
            System.out.print("user type = ");
            // type =1 --> ngưởi sử dụng điện sinh hoạt
            // type = 2 --> người sử dụng điện kinh doanh
            int type = scanner.nextInt();
            if(type ==1){
                IndividualCustomer c1= new IndividualCustomer();
                c1.input(scanner);
                System.out.format("%,.2f\n",c1.calcBill());
            }
            else {
                BusinessCustomers b1= new BusinessCustomers();
                b1.input(scanner);
                System.out.format("%,.2f\n",b1.calcBill());
            }
        }
    }

}
