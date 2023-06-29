package topay;
import javax.swing.JOptionPane;

public class Bill {
    //Atributos
    public String cxName = "";
    public int cxId = 0;
    public int billNum = 0;
    public double amount = 0;
    public String month = "";
    public int year = 0;
    public boolean state = false;
    public int operation;


//Nombre del cliente
    public String getCxName() {
        cxName = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        return cxName;
    }

    public void setCxName(String cxName) {
        this.cxName = cxName;
    }

    
//Cedula del cliente
    public int getCxId() {
        cxId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente"));
        return cxId;
    }

    public void setCxId(int cxId) {
        this.cxId = cxId;
    }

    
//Numero de la factura
    public int getBillNum() {
        billNum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la factura"));
        return billNum;
    }

    public void setBillNum(int billNum) {
        this.billNum = billNum;
    }

    
//Total a pagar de la factura
    public double getAmount() {
        amount=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de la factura"));
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    
//Mes y Año de la factura
    public String getMonth() {
        month=JOptionPane.showInputDialog("Ingrese el mes de la factura");
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        year=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la factura"));
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
//Estado de la factura
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    
//Operacion
    public int getOperation() {
        operation = (amount ((40000*0.05)+40000)/6=7000);
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    
    
}