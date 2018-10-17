/**
 * @author: Federico Franco
 * Clase principal con interfaz grafica interactiva
 */
package GUI;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();
       
        agregarProductos();
        setLocationRelativeTo(null );
    }

    /**
     * declaracion de variables
     */
    //VARIABLES
    ArrayList<Producto>Lacteos =new ArrayList<Producto>();
    ArrayList<Producto>Carnes =new ArrayList<Producto>();
    ArrayList<Producto>Verduras =new ArrayList<Producto>();
    DefaultListModel muestraListas= new DefaultListModel();
    DefaultListModel stockListas= new DefaultListModel();
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
    
 
    
    
    
    //FUNCIONES
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Combo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaMuestra = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Stock = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 530));
        getContentPane().setLayout(null);

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lacteos", "Carnes", "Verduras"}));
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });
        getContentPane().add(Combo);
        Combo.setBounds(40, 120, 157, 26);

        ListaMuestra.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaMuestra);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 110, 110, 234);

        jLabel1.setText("Productos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 80, 110, 16);

        jLabel2.setText("Stock");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 80, 107, 16);

        jScrollPane2.setEnabled(false);
        jScrollPane2.setFocusable(false);

        Stock.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Stock.setFocusable(false);
        jScrollPane2.setViewportView(Stock);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(350, 110, 100, 234);

        jLabel3.setText("Categoria");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 80, 120, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        /**
         * Funcion que me permite ver que categoria elige el usuario y mostrar
         * de acuerdo a la categoria que elementos hay disponibles
         */
        int posi=Combo.getSelectedIndex();
        muestraListas.removeAllElements();
        stockListas.removeAllElements();
        //lacteos
        if(posi==0){
            
            //agrego todos los lacteos al default list model
            for(int i=0; i<Lacteos.size();i++){
                muestraListas.addElement(Lacteos.get(i).getNombreProducto());
                stockListas.addElement(Lacteos.get(i).getStockProducto());
            }
        }//fin lacteos
        
        //Carnes
        if(posi==1){
            
            //agrego todas las carnes que haya
            for(int i=0;i<Carnes.size();i++){
                muestraListas.addElement(Carnes.get(i).getNombreProducto());
                stockListas.addElement(Carnes.get(i).getStockProducto());
            }
        }//fin carnes
        
        //Verduras
        if(posi==2){
          for(int i=0;i<Verduras.size();i++){
              muestraListas.addElement(Verduras.get(i).getNombreProducto());
              stockListas.addElement(Verduras.get(i).getStockProducto());
          }
        }//fin verduras
        
        ListaMuestra.setModel(muestraListas);
        Stock.setModel(stockListas);
    }//GEN-LAST:event_ComboActionPerformed

 
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
    private javax.swing.JList<String> ListaMuestra;
    private javax.swing.JList<String> Stock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
