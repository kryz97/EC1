package topay;
import javax.swing.JOptionPane;

public class ToPay {

    public static void main(String[] args) {
        Bill bill = new Bill();
        
        JOptionPane.showConfirmDialog(null, "Bienvenido ingrese la informacion del cliente");
        bill.getCxName();
        bill.getCxId();

        int start =1;
        while (start!=2){
            bill.getBillNum();
            bill.getAmount();
            bill.getMonth();
            bill.getYear();
            
            start = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar otra factura 1.Yes 2.No"));
        }
        JOptionPane.showConfirmDialog(null,"El cliente "+bill.getCxName()+"\n Cedula "
        +bill.getCxId()+"\nDebe un total de "+bill.getAmount()+"\n Del mes "+bill.getMonth()+
                "\n del año"+bill.getYear());
    }
    
}
