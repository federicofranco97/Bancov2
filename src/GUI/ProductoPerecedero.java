
package GUI;

import javax.swing.JOptionPane;


public class ProductoPerecedero extends Producto {
    private String vencimiento;
    
    public ProductoPerecedero(){
        super();
        this.vencimiento=JOptionPane.showInputDialog("Ingrese la fecha de vencimiento en formato\n"
                + "22/10/2018");
    }

    public ProductoPerecedero(String nom,int stock,int precio,String venc){
        super(nom, stock, precio);
        this.vencimiento=venc;
    }
    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }
    
    
    
    
    
}//fin de la clase
