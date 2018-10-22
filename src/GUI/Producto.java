
/**
 * @author: Federico Franco
 * Clase que define al producto con los atributos, constructor
 * getters y setters correspondientes
 */
package GUI;

import javax.swing.JOptionPane;


public class Producto {
    private String nombreProducto;
    private int stockProducto;
    private int precioProducto;

    public Producto(String nombre,int stock,int precio){
        this.nombreProducto=nombre;
        this.stockProducto=stock;
        this.precioProducto=precio;
    }
    
    public Producto(){
        this.nombreProducto=JOptionPane.showInputDialog("Ingrese el nombre del producto");
        this.stockProducto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del producto"));
        this.precioProducto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto"));
    }
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

   

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    
}
