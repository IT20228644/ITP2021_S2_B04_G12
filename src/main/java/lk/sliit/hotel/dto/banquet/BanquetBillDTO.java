package lk.sliit.hotel.dto.banquet;

public class BanquetBillDTO {

    private int billId;
    private double total;
    private double foodPrice;
    private double otherPrices;
    private double advancePayment;

    public BanquetBillDTO(int banquetBillId) {
        this.billId = banquetBillId;
    }

//    public int getBillId() {
//        return billId;
//    }
//
//    public void setBillId(int billId) {
//        this.billId = billId;
//    }


    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public double getOtherPrices() {
        return otherPrices;
    }

    public void setOtherPrices(double otherPrices) {
        this.otherPrices = otherPrices;
    }

    public double getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(double advancePayment) {
        this.advancePayment = advancePayment;
    }

    @Override
    public String toString() {
        return "BanquetBillDTO{" +
                "banquetBillId=" + billId +
                ", total=" + total +
                ", foodPrice=" + foodPrice +
                ", otherPrices=" + otherPrices +
                ", advancePayment=" + advancePayment +
                '}';
    }
}
