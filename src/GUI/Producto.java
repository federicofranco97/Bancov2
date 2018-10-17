
/**
 * @author: Federico Franco
 * Clase que define al producto con los atributos, constructor
 * getters y setters correspondientes
 */
package GUI;


public class Producto {
    private String nombreProducto;
    private int stockProducto;
    private String vencimiento;
    private int precioProducto;

    public Producto(String nombre,int stock,String venc,int precio){
        this.nombreProducto=nombre;
        this.stockProducto=stock;
        this.vencimiento=venc;
        this.precioProducto=precio;
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

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    
}
