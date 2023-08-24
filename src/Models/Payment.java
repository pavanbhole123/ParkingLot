package Models;

import java.time.LocalDateTime;

public class Payment extends baseModel{
    private int amount;
    private PaymentMode paymentMode;
    private LocalDateTime exittime;
    private String tansactionNo;
    private Bill bill;
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getExittime() {
        return exittime;
    }

    public void setExittime(LocalDateTime exittime) {
        this.exittime = exittime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getTansactionNo() {
        return tansactionNo;
    }

    public void setTansactionNo(String tansactionNo) {
        this.tansactionNo = tansactionNo;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
