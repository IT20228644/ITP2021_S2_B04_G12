package lk.sliit.hotel.entity.banquet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BanquetBill {
    @Id
    int billId;
    double advancePayment;
    double foodPrice;
    double otherPrices;
    double total;

    public BanquetBill(int banquetBillId, double advancePayment, double foodPrice, double otherPrice, double total) {
        this.billId = banquetBillId;
        this.advancePayment = advancePayment;
        this.foodPrice = foodPrice;
        this.otherPrices = otherPrice;
        this.total = total;
    }

    public BanquetBill() {

    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public double getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(double advancePayment) {
        this.advancePayment = advancePayment;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

