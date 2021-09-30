package entities;

public class BusinessElec {
    protected int level;
    protected double pricePerLevel;

    public BusinessElec() {
    }

    public BusinessElec(int level, double pricePerLevel) {
        this.level = level;
        this.pricePerLevel = pricePerLevel;
    }

    public static BusinessElec[] getListBusinessPrice(int type) {// lấy bảng giá điện tính theo low/normal/high
        if (type == 1) {
            //Giá điện cấp điện áp 22kv
            return new BusinessElec[]{
                    new BusinessElec(0, 2.442),
                    new BusinessElec(1, 1.361),
                    new BusinessElec(2, 4.251)
            };
        }
        // Giá điện cấp điện áp từ 6kv đến 22kv
        if (type == 2) {
            return new BusinessElec[]{
                    new BusinessElec(0, 2.629),
                    new BusinessElec(1, 1.547),
                    new BusinessElec(2, 4.400) // cho phép user tạo thêm nhiều level và set các mức giá khác nhau
            };
        }
        // Giá điện cấp điện áp dưới 6kv
        return new BusinessElec[]{
                new BusinessElec(0, 2.666),
                new BusinessElec(1, 1.622),
                new BusinessElec(2, 4.587) // cho phép user tạo thêm nhiều level và set các mức giá khác nhau
        };
    }
}

