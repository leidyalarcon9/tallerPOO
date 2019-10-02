/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

import javax.swing.JOptionPane;
import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

/**
 *
 * @author Acosta
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    Producto p1, p2, p3, p4;
    Inventario invent;

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        llenar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbtn_producto1 = new javax.swing.JRadioButton();
        lbl_producto1 = new javax.swing.JLabel();
        lbl_cantidad1 = new javax.swing.JLabel();
        lbl_iva1 = new javax.swing.JLabel();
        lbl_precio1 = new javax.swing.JLabel();
        rbtn_producto2 = new javax.swing.JRadioButton();
        lbl_producto2 = new javax.swing.JLabel();
        lbl_cantidad2 = new javax.swing.JLabel();
        lbl_iva2 = new javax.swing.JLabel();
        lbl_precio2 = new javax.swing.JLabel();
        rbtn_producto3 = new javax.swing.JRadioButton();
        lbl_producto3 = new javax.swing.JLabel();
        lbl_cantidad3 = new javax.swing.JLabel();
        lbl_iva3 = new javax.swing.JLabel();
        lbl_precio3 = new javax.swing.JLabel();
        rbtn_producto4 = new javax.swing.JRadioButton();
        lbl_producto4 = new javax.swing.JLabel();
        lbl_cantidad4 = new javax.swing.JLabel();
        lbl_iva4 = new javax.swing.JLabel();
        lbl_precio4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_pedir = new javax.swing.JButton();
        btn_vender = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_ingresos = new javax.swing.JLabel();
        lbl_masVendido = new javax.swing.JLabel();
        lbl_menosVendido = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setToolTipText("");
        jPanel3.setName("Hola"); // NOI18N

        jLabel2.setText("Producto");

        jLabel3.setText("Cantidad");

        jLabel4.setText("IVA");

        jLabel5.setText("Precio");

        btnGrupo.add(rbtn_producto1);

        lbl_producto1.setBackground(new java.awt.Color(0, 0, 0));
        lbl_producto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_cantidad1.setBackground(new java.awt.Color(0, 0, 0));
        lbl_cantidad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_iva1.setBackground(new java.awt.Color(0, 0, 0));
        lbl_iva1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_precio1.setBackground(new java.awt.Color(0, 0, 0));
        lbl_precio1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGrupo.add(rbtn_producto2);

        lbl_producto2.setBackground(new java.awt.Color(0, 0, 0));
        lbl_producto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_cantidad2.setBackground(new java.awt.Color(0, 0, 0));
        lbl_cantidad2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_iva2.setBackground(new java.awt.Color(0, 0, 0));
        lbl_iva2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_precio2.setBackground(new java.awt.Color(0, 0, 0));
        lbl_precio2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGrupo.add(rbtn_producto3);

        lbl_producto3.setBackground(new java.awt.Color(0, 0, 0));
        lbl_producto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_cantidad3.setBackground(new java.awt.Color(0, 0, 0));
        lbl_cantidad3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_iva3.setBackground(new java.awt.Color(0, 0, 0));
        lbl_iva3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_precio3.setBackground(new java.awt.Color(0, 0, 0));
        lbl_precio3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGrupo.add(rbtn_producto4);

        lbl_producto4.setBackground(new java.awt.Color(0, 0, 0));
        lbl_producto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_cantidad4.setBackground(new java.awt.Color(0, 0, 0));
        lbl_cantidad4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_iva4.setBackground(new java.awt.Color(0, 0, 0));
        lbl_iva4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_precio4.setBackground(new java.awt.Color(0, 0, 0));
        lbl_precio4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbtn_producto1)
                                .addGap(9, 9, 9)
                                .addComponent(lbl_producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_cantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_iva1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbtn_producto2)
                                .addGap(9, 9, 9)
                                .addComponent(lbl_producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_cantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_iva2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_precio2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbtn_producto3)
                                .addGap(9, 9, 9)
                                .addComponent(lbl_producto3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_cantidad3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_iva3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_precio3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rbtn_producto4)
                                .addGap(9, 9, 9)
                                .addComponent(lbl_producto4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_cantidad4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_iva4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lbl_precio4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn_producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_iva1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn_producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_iva2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_precio2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn_producto3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_producto3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_iva3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_precio3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtn_producto4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_producto4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cantidad4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_iva4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_precio4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_pedir.setBackground(new java.awt.Color(153, 153, 153));
        btn_pedir.setText("Pedir Producto");
        btn_pedir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_pedir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedirActionPerformed(evt);
            }
        });

        btn_vender.setBackground(new java.awt.Color(153, 153, 153));
        btn_vender.setText("Vender Producto");
        btn_vender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_vender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venderActionPerformed(evt);
            }
        });

        jLabel10.setText("Operaciones");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pedir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_vender, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_vender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pedir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Ingresos");

        jLabel7.setText("Producto mas vendido");

        jLabel8.setText("Producto menos vendido");

        lbl_ingresos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_masVendido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_menosVendido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Calculos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_masVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_menosVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lbl_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(lbl_masVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(lbl_menosVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venderActionPerformed

        if (rbtn_producto1.isSelected()) {

            p1 = invent.vender(p1);
            lbl_cantidad1.setText(Integer.toString(p1.getCantidad()));
            lbl_ingresos.setText("$ " + Double.toString(invent.getIngresos()));

        } else if (rbtn_producto2.isSelected()) {

            p2 = invent.vender(p2);
            lbl_cantidad2.setText(Integer.toString(p2.getCantidad()));
            lbl_ingresos.setText("$ " + Double.toString(invent.getIngresos()));

        } else if (rbtn_producto3.isSelected()) {

            p3 = invent.vender(p3);
            lbl_cantidad3.setText(Integer.toString(p3.getCantidad()));
            lbl_ingresos.setText("$ " + Double.toString(invent.getIngresos()));

        } else if (rbtn_producto4.isSelected()) {

            p4 = invent.vender(p4);
            lbl_cantidad4.setText(Integer.toString(p4.getCantidad()));
            lbl_ingresos.setText("$ " + Double.toString(invent.getIngresos()));

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione uno de los productos");
        }

        switch (invent.masVendido(p1, p2, p3, p4)) {
            case 1:
                lbl_masVendido.setText(p1.getNombre());
                break;
            case 2:
                lbl_masVendido.setText(p2.getNombre());
                break;
            case 3:
                lbl_masVendido.setText(p3.getNombre());
                break;
            case 4:
                lbl_masVendido.setText(p4.getNombre());
                break;
            default:
                lbl_masVendido.setText("");
                break;
        }
        
        switch (invent.menosVendido(p1, p2, p3, p4)) {
            case 1:
                lbl_menosVendido.setText(p1.getNombre());
                break;
            case 2:
                lbl_menosVendido.setText(p2.getNombre());
                break;
            case 3:
                lbl_menosVendido.setText(p3.getNombre());
                break;
            case 4:
                lbl_menosVendido.setText(p4.getNombre());
                break;
            default:
                lbl_menosVendido.setText("");
                break;
        }       

    }//GEN-LAST:event_btn_venderActionPerformed

    private void btn_pedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedirActionPerformed

        if (rbtn_producto1.isSelected()) {

            p1 = invent.comprar(p1);
            lbl_cantidad1.setText(Integer.toString(p1.getCantidad()));
            lbl_ingresos.setText("$ " + Double.toString(invent.getIngresos()));

        } else if (rbtn_producto2.isSelected()) {

            p2 = invent.comprar(p2);
            lbl_cantidad2.setText(Integer.toString(p2.getCantidad()));
            lbl_ingresos.setText("$ " + Double.toString(invent.getIngresos()));

        } else if (rbtn_producto3.isSelected()) {

            p3 = invent.comprar(p3);
            lbl_cantidad3.setText(Integer.toString(p3.getCantidad()));
            lbl_ingresos.setText("$ " + Double.toString(invent.getIngresos()));

        } else if (rbtn_producto4.isSelected()) {

            p4 = invent.comprar(p4);
            lbl_cantidad4.setText(Integer.toString(p4.getCantidad()));
            lbl_ingresos.setText("$ " + Double.toString(invent.getIngresos()));

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione uno de los productos");
        }

    }//GEN-LAST:event_btn_pedirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    public void llenar() {
        // Instancia de objetos
        p1 = new Producto();
        p2 = new Producto();
        p3 = new Producto();
        p4 = new Producto();

        invent = new Inventario();

        // LLenar objetos
        p1.setNombre("Lapiz");
        p1.setCantidad(18);
        p1.setIva(16.0);
        p1.setPrecio(550.0);

        p2.setNombre("Apirina");
        p2.setCantidad(25);
        p2.setIva(12.0);
        p2.setPrecio(109.5);

        p3.setNombre("Borrador");
        p3.setCantidad(30);
        p3.setIva(16.0);
        p3.setPrecio(207.3);

        p4.setNombre("Pan");
        p4.setCantidad(15);
        p4.setIva(4.0);
        p4.setPrecio(150.0);

        // Llenar lbl
        lbl_producto1.setText(p1.getNombre());
        lbl_cantidad1.setText(Integer.toString(p1.getCantidad()));
        lbl_iva1.setText(Double.toString(p1.getIva()) + " %");
        lbl_precio1.setText("$ " + Double.toString(p1.getPrecio()));

        lbl_producto2.setText(p2.getNombre());
        lbl_cantidad2.setText(Integer.toString(p2.getCantidad()));
        lbl_iva2.setText(Double.toString(p2.getIva()) + " %");
        lbl_precio2.setText("$ " + Double.toString(p2.getPrecio()));

        lbl_producto3.setText(p3.getNombre());
        lbl_cantidad3.setText(Integer.toString(p3.getCantidad()));
        lbl_iva3.setText(Double.toString(p3.getIva()) + " %");
        lbl_precio3.setText("$ " + Double.toString(p3.getPrecio()));

        lbl_producto4.setText(p4.getNombre());
        lbl_cantidad4.setText(Integer.toString(p4.getCantidad()));
        lbl_iva4.setText(Double.toString(p4.getIva()) + " %");
        lbl_precio4.setText("$ " + Double.toString(p4.getPrecio()));

        lbl_ingresos.setText("$ " + Double.toString(invent.getIngresos()));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btn_pedir;
    private javax.swing.JButton btn_vender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_cantidad1;
    private javax.swing.JLabel lbl_cantidad2;
    private javax.swing.JLabel lbl_cantidad3;
    private javax.swing.JLabel lbl_cantidad4;
    private javax.swing.JLabel lbl_ingresos;
    private javax.swing.JLabel lbl_iva1;
    private javax.swing.JLabel lbl_iva2;
    private javax.swing.JLabel lbl_iva3;
    private javax.swing.JLabel lbl_iva4;
    private javax.swing.JLabel lbl_masVendido;
    private javax.swing.JLabel lbl_menosVendido;
    private javax.swing.JLabel lbl_precio1;
    private javax.swing.JLabel lbl_precio2;
    private javax.swing.JLabel lbl_precio3;
    private javax.swing.JLabel lbl_precio4;
    private javax.swing.JLabel lbl_producto1;
    private javax.swing.JLabel lbl_producto2;
    private javax.swing.JLabel lbl_producto3;
    private javax.swing.JLabel lbl_producto4;
    private javax.swing.JRadioButton rbtn_producto1;
    private javax.swing.JRadioButton rbtn_producto2;
    private javax.swing.JRadioButton rbtn_producto3;
    private javax.swing.JRadioButton rbtn_producto4;
    // End of variables declaration//GEN-END:variables
}