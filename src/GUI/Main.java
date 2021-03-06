/**
 * @author: Federico Franco
 * Clase principal con interfaz grafica interactiva
 */
package GUI;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();
        agregarProductos();
        generarAlmacen();
        setLocationRelativeTo(null );
    }

    /**
     * declaracion de variables
     */
    //VARIABLES
    private ArrayList<Producto>Lacteos =new ArrayList<Producto>();
    private ArrayList<Producto>Carnes =new ArrayList<Producto>();
    private ArrayList<Producto>Verduras =new ArrayList<Producto>();
    private DefaultListModel muestraListas= new DefaultListModel();
    private DefaultListModel compraListas= new DefaultListModel();
    private ArrayList<Producto>Almacen =new ArrayList<Producto>();
    static int TotalCompra;
    //VARIABLES
    
   
    //FUNCIONES
 
    /**
     * Funcion que agrega 4 elementos a cada array hardcodeados
     */
    public void agregarProductos(){
        
        Lacteos.add(new Producto("Leche", 400, 30));
        Lacteos.add(new ProductoPerecedero("Queso", 230, 45,"22/10/2019"));
        Lacteos.add(new ProductoPerecedero("Yogurt", 160, 16,"12/8/2019"));
        Lacteos.add(new ProductoPerecedero("Crema", 48, 10,"14/8/2019"));
        Carnes.add(new Producto("Lomo", 400, 400));
        Carnes.add(new Producto("Ribs", 250, 250));
        Carnes.add(new Producto("Vacio", 150,380));
        Carnes.add(new Producto("Pollo", 423, 120));
        Verduras.add(new Producto("Lechuga", 300,30));
        Verduras.add(new Producto("Tomate", 300,36));
        Verduras.add(new Producto("Repollo", 300,20));
        Verduras.add(new ProductoPerecedero("Palta", 300,20,"17/5/2019"));
    }
    
    public void generarAlmacen(){
        for(int i=0;i<Lacteos.size();i++){
            Almacen.add(Lacteos.get(i));
        }
        for(int i=0;i<Carnes.size();i++){
            Almacen.add(Carnes.get(i));
        }
        for(int i=0;i<Verduras.size();i++){
            Almacen.add(Verduras.get(i));
        }
    }
    
    public Integer buscarProducto(String n){
        int posi=-1;
        for(int i=0;i<Almacen.size();i++){
            String aux=Almacen.get(i).getNombreProducto();
            if(n.equals(aux))posi=i;
        }
        return posi;
        
    }
    
    public void prodPerecedero(){
        int posicion=-1;
        String aux=ListaMuestra.getSelectedValue();
        for(int i =0;i<Almacen.size();i++){
            String nom=Almacen.get(i).getNombreProducto();
            if(aux.equals(nom)){
                posicion=i;
            }
        }//fin recorrer
        
        if(posicion>=0){
            if(Almacen.get(posicion) instanceof ProductoPerecedero){
                JOptionPane.showMessageDialog(null, "Este producto tiene aplicado un 10%\n"
                        + "Ya que es un producto perecedero");
            }else{
                JOptionPane.showMessageDialog(null, "Este producto no tiene descuentos.");
            }
        }
    }
    
    
    //FUNCIONES
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Combo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaMuestra = new javax.swing.JList<>();
        lbl1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Compra = new javax.swing.JList<>();
        stock = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supermercado");
        setMinimumSize(new java.awt.Dimension(1030, 530));
        getContentPane().setLayout(null);

        Combo.setBackground(new java.awt.Color(0, 0, 0));
        Combo.setForeground(new java.awt.Color(255, 255, 255));
        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lacteos", "Carnes", "Verduras"}));
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });
        getContentPane().add(Combo);
        Combo.setBounds(40, 120, 157, 26);

        ListaMuestra.setBackground(new java.awt.Color(0, 0, 0));
        ListaMuestra.setForeground(new java.awt.Color(255, 255, 255));
        ListaMuestra.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaMuestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMuestraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaMuestra);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 110, 110, 234);

        lbl1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("Categoria");
        getContentPane().add(lbl1);
        lbl1.setBounds(50, 69, 140, 30);

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText(">");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(480, 120, 80, 40);

        remove.setBackground(new java.awt.Color(0, 0, 0));
        remove.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 255));
        remove.setText("<");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        getContentPane().add(remove);
        remove.setBounds(480, 168, 80, 40);

        Compra.setBackground(new java.awt.Color(0, 0, 0));
        Compra.setForeground(new java.awt.Color(255, 255, 255));
        Compra.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(Compra);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(620, 110, 140, 230);

        stock.setEditable(false);
        stock.setBackground(new java.awt.Color(0, 0, 0));
        stock.setForeground(new java.awt.Color(255, 255, 255));
        stock.setText("0");
        getContentPane().add(stock);
        stock.setBounds(370, 120, 80, 40);
        stock.setHorizontalAlignment((int) CENTER_ALIGNMENT);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 530));
        jPanel1.setLayout(null);

        lbl3.setFont(lbl1.getFont());
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setText("Stock Disponible:");
        jPanel1.add(lbl3);
        lbl3.setBounds(350, 80, 130, 19);

        lbl4.setFont(lbl1.getFont());
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setText("Compra Actual:");
        jPanel1.add(lbl4);
        lbl4.setBounds(630, 80, 120, 19);

        total.setBackground(new java.awt.Color(0, 0, 0));
        total.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        total.setOpaque(true);
        jPanel1.add(total);
        total.setBounds(300, 390, 140, 40);

        lbl2.setFont(lbl1.getFont());
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("Productos");
        jPanel1.add(lbl2);
        lbl2.setBounds(230, 70, 110, 30);

        amount.setBackground(new java.awt.Color(0, 0, 0));
        amount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(amount);
        amount.setBounds(480, 230, 80, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(lbl3.getFont());
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 390, 240, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(lbl2.getFont());
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(660, 392, 200, 40);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(lbl3.getFont());
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Promociones");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(460, 390, 150, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        /**
         * Funcion que me permite ver que categoria elige el usuario y mostrar
         * de acuerdo a la categoria que elementos hay disponibles
         */
        int posi=Combo.getSelectedIndex();
        muestraListas.removeAllElements();
        //lacteos
        if(posi==0){
            
            //agrego todos los lacteos al default list model
            for(int i=0; i<Lacteos.size();i++){
                muestraListas.addElement(Lacteos.get(i).getNombreProducto());
            }
        }//fin lacteos
        
        //Carnes
        if(posi==1){
            
            //agrego todas las carnes que haya
            for(int i=0;i<Carnes.size();i++){
                muestraListas.addElement(Carnes.get(i).getNombreProducto());
            }
        }//fin carnes
        
        //Verduras
        if(posi==2){
          
          for(int i=0;i<Verduras.size();i++){
              muestraListas.addElement(Verduras.get(i).getNombreProducto());
          }
        }//fin verduras
        
        ListaMuestra.setModel(muestraListas);
    }//GEN-LAST:event_ComboActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        /**
         * Funcion para cuando clickean el boton de >
         */
        int cant=0;
        String aux= amount.getText();
        if(aux.equals("")){
            cant=1;
            
        }else{
            try{
                cant=Integer.parseInt(aux);
                
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido y entero");
                amount.setText("");
            }
            
        }//FIN ELSE
        
        if(cant>0){
            String prod=ListaMuestra.getSelectedValue();
            int precioUnitario=0;
            int stockDisponible=0;
            int precioFinal=0;
            int posicionProducto=-1;
            for(int i=0;i<Almacen.size();i++){
                String auxi=Almacen.get(i).getNombreProducto();
                if(auxi.equals(prod)){
                    precioUnitario=Almacen.get(i).getPrecioProducto();
                    stockDisponible=Almacen.get(i).getStockProducto();
                    posicionProducto=i;
                }
            }//fin recorrer lista almacen
            
            //filtro por si pide mas que la cantidad disponible
            if(stockDisponible<cant){
                JOptionPane.showMessageDialog(null, "No hay suficiente cantidad del producto");
            }else{
                precioFinal=precioUnitario*cant;
                Almacen.get(posicionProducto).setStockProducto(stockDisponible-cant);
                compraListas.addElement(prod+":"+cant);
                Compra.setModel(compraListas);
            }
            
            TotalCompra=TotalCompra+precioFinal;
            amount.setText("");
            
        }//end accion if cant > 0 

        
        
    }//GEN-LAST:event_addActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(TotalCompra>1000){
            add.setVisible(true);
            remove.setVisible(true);
            
            total.setBackground(Color.RED);
            lbl1.setForeground(Color.red);
            lbl2.setForeground(Color.red);
            lbl3.setForeground(Color.red);
            lbl4.setForeground(Color.red);
            ListaMuestra.setForeground(Color.red);
            stock.setForeground(Color.red);
            Compra.setForeground(Color.red);
            amount.setForeground(Color.red);
        }else{
            add.setVisible(true);
            remove.setVisible(true);
            
            total.setBackground(Color.green);
            lbl1.setForeground(Color.white);
            lbl2.setForeground(Color.white);
            lbl3.setForeground(Color.white);
            lbl4.setForeground(Color.white);
            ListaMuestra.setForeground(Color.white);
            stock.setForeground(Color.white);
            Compra.setForeground(Color.white);
            amount.setForeground(Color.white);
        }
        total.setText("$ "+TotalCompra);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ListaMuestraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMuestraMouseClicked
        /**
         * evento cuando se clickea un objeto de la lista
         */
        String aux=ListaMuestra.getSelectedValue();
        int lugar=buscarProducto(aux);
        stock.setText(String.valueOf(Almacen.get(lugar).getStockProducto()));
                
    }//GEN-LAST:event_ListaMuestraMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
         int cant=0;
        String aux= amount.getText();
        if(aux.equals("")){
            cant=1;
            
        }else{
            try{
                cant=Integer.parseInt(aux);
                
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido y entero");
                amount.setText("");
            }
            
        }//FIN ELSE
        
        if(cant>0){
            if(Compra.getSelectedIndex()== -1){
                JOptionPane.showMessageDialog(null, "Primero seleccione que item quiere quitar");
                amount.setText("");
                return;
            }
            int posiMarcada=Compra.getSelectedIndex();
            String [] prodMarcado=Compra.getSelectedValue().split(":");
            int precioDescontar=0;
            if(cant> Integer.parseInt(prodMarcado[1])){
                JOptionPane.showMessageDialog(null, "No hay suficioente cantidad");
                amount.setText("");
            }else{
                //calculo del valor a descontar al total de la compra
                int posiAlmacen=buscarProducto(prodMarcado[0]);
                precioDescontar=cant*Almacen.get(posiAlmacen).getPrecioProducto();
                int cantRestante=Integer.parseInt(prodMarcado[1])-cant;
                if(cantRestante !=0){
                    compraListas.remove(posiMarcada);
                    compraListas.add(posiMarcada,prodMarcado[0]+":"+cantRestante);
                }else{
                    compraListas.remove(posiMarcada);
                }
                
                //sumo la cantidad que saco de la lista de compra
                Almacen.get(posiAlmacen).setStockProducto(Almacen.get(posiAlmacen).getStockProducto()+cant);
                //resto el valor a descontar del total
                TotalCompra=TotalCompra-precioDescontar;
                Compra.setModel(compraListas);
            }
            
        }
        
    }//GEN-LAST:event_removeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /**
        * Boton que muestre todos los productos que son perecederos
        * y que les aplique un descuento ya que se vencen
        */
        prodPerecedero();
         
         
    }//GEN-LAST:event_jButton3ActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JList<String> Compra;
    private javax.swing.JList<String> ListaMuestra;
    private javax.swing.JButton add;
    private javax.swing.JTextField amount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JButton remove;
    private javax.swing.JTextField stock;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
