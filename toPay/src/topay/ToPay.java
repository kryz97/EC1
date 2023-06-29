package topay;
import javax.swing.JOptionPane;

public class ToPay {

    public static void main(String[] args) {
        Bill bill = new Bill();
        
        int menu = 0;
        double total=0;
        JOptionPane.showConfirmDialog(null,"1: Ingresar informacion del cliente y la factura\n"+
                "2.Calcular el monto a pagar y pagos a 6 meses\n"+"3.Salir");
        
        while (menu!=3){
            JOptionPane.showConfirmDialog(null,"1: Ingresar informacion del cliente y la factura\n"+
                "2.Calcular el monto a pagar y pagos a 6 meses\n"+"3.Salir");
            menu = Integer.parseInt(JOptionPane.showInputDialog("Digite el menu a entrar"));
            switch (menu){
                case 1:
                    JOptionPane.showConfirmDialog(null, "Ingrese la informacion del cliente");
                    bill.setCxName(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
                    bill.setCxId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente")));
                    bill.setBillNum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la factura")));
                    bill.setAmount(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la factura")));
                    bill.setMonth(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura")));
                    bill.setYear(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la factura")));
                    bill.setStatus(Integer.parseInt(JOptionPane.showInputDialog("El estado de la factura es paga\n 1.Yes\n 0.No")));
                    if (bill.getStatus()==0){
                        total = total+bill.getAmount();
                    }
                    break;
                
                case 2:
                    double paying = total+(total*0.05);
                    double payingMonth = (total+(total*0.05))/6;
                    JOptionPane.showConfirmDialog(null,"Cliente: "+bill.getCxName()+"\nCedula: "+bill.getCxId());
                    JOptionPane.showConfirmDialog(null,"Total a pagar con un interes del 5% es: "+paying);
                    for (int i =1; i<=6; i++){
                        JOptionPane.showConfirmDialog(null, "Total a pagar por mes es: "+payingMonth+
                                "En los sigientes meses: "+(bill.getMonth()+i));
                    }
                    break;
                    
                case 3:
                    break;
                     
            }  
        }
        
    }
    
}
