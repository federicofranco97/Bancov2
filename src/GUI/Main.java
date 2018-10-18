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
        
        Lacteos.add(new Producto("Leche", 400, "22/12/2019", 30));
        Lacteos.add(new Producto("Queso", 230, "15/6/2019", 45));
        Lacteos.add(new Producto("Yogurt", 160, "13/7/2019", 16));
        Lacteos.add(new Producto("Crema", 48, "12/3/2019", 10));
        Carnes.add(new Producto("Lomo", 400, "22/12/2020", 400));
        Carnes.add(new Producto("Ribs", 250, "12/3/2019", 250));
        Carnes.add(new Producto("Vacio", 150,"13/7/2019",380));
        Carnes.add(new Producto("Pollo", 423, "28/3/2019",120));
        Verduras.add(new Producto("Lechuga", 300,"22/12/2020" ,30));
        Verduras.add(new Producto("Tomate", 300,"22/12/2020" ,36));
        Verduras.add(new Producto("Calabaza", 300,"22/12/2020" ,50));
        Verduras.add(new Producto("Repollo", 300,"22/12/2020" ,20));
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
        jButton1 = new javax.swing.JButton();
        stock = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(lbl3.getFont());
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 400, 240, 40);

        stock.setEditable(false);
        stock.setBackground(new java.awt.Color(0, 0, 0));
        stock.setForeground(new java.awt.Color(255, 255, 255));
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
        total.setBounds(630, 400, 190, 40);

        lbl2.setFont(lbl1.getFont());
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("Productos");
        jPanel1.add(lbl2);
        lbl2.setBounds(230, 70, 110, 30);

        amount.setBackground(new java.awt.Color(0, 0, 0));
        amount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(amount);
        amount.setBounds(480, 230, 80, 30);

        jLabel1.setText("Lac");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 170, 160, 40);

        jLabel2.setText("Carne");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 270, 160, 40);

        jLabel3.setText("Verdu");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 220, 160, 40);

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
        
    }//GEN-LAST:event_removeActionPerformed

 
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
