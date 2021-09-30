package entities;

public class RetailElec {
    protected int min, max;
    protected double unitPrice;

    public RetailElec() {
    }

    public RetailElec(int min, int max, double unitPrice) {
        this.min = min;
        this.max = max;
        this.unitPrice = unitPrice;
    }

    public static RetailElec[] getListRetailPrice() {//tạo bảng giá điện
        return new RetailElec[]
                {
                        new RetailElec(0, 50, 1.678),
                        new RetailElec(51, 100, 1.734),
                        new RetailElec(101, 200, 2.014),
                        new RetailElec(201, 300, 2.536),
                        new RetailElec(301, 400, 2.834),
                        new RetailElec(401, 20000000, 2.927),
                };
    }
}
