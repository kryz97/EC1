package topay;
import javax.swing.JOptionPane;

public class Bill {
    //Atributos
    public String cxName = "";
    public int cxId = 0;
    public int billNum = 0;
    public double amount = 0;
    public int month = 0;
    public int year = 0;
    public int status = 0;

    
    public String getCxName() {
        return cxName;
    }

    public void setCxName(String cxName) {
        this.cxName = cxName;
    }

    public int getCxId() {
        return cxId;
    }

    public void setCxId(int cxId) {
        this.cxId = cxId;
    }

    public int getBillNum() {
        return billNum;
    }

    public void setBillNum(int billNum) {
        this.billNum = billNum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}