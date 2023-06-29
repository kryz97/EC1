
package topay;

import javax.swing.JOptionPane;

public class Bill {
    //Atributos
    public String cxName = "";
    public int cxId = 0;
    public int billNum = 0;
    public int amount = 0;
    public int month = 0;
    public int year = 0;
    public boolean state = false;

    /**
     *
     * @return
     */
   
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
    public int getAmount() {
        amount=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de la factura"));
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
//Mes y Año de la factura
    public int getMonth() {
        JOptionPane.showConfirmDialog(null, " 1.Enero\n 2.Febrero\n 3.Marzo\n"
                + " 4.Abril\n 5.Mayo\n 6.Junio\n 7.Julio\n 8.Agosto\n 9.Septiembre\n"
                + " 10.Ocutbre\n 11.Noviembre\n 12.Diciembre");
        month=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura"));
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
    
    
}
