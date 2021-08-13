package appConversorMonedas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Monedas extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    //variables
    public int divisaDos;
    public int divisaUno;
    public Double recibe;

    //constructor
    public Monedas() {
        this.setContentPane(fondo);

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txEntradaMoneda = new javax.swing.JTextField();
        divisa1 = new javax.swing.JComboBox<>();
        divisa2 = new javax.swing.JComboBox<>();
        btnConvertir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        txEntradaMoneda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txEntradaMoneda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txEntradaMoneda.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txEntradaMoneda.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txEntradaMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEntradaMonedaActionPerformed(evt);
            }
        });
        getContentPane().add(txEntradaMoneda);
        txEntradaMoneda.setBounds(40, 230, 120, 30);

        divisa1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        divisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COP", "USD", "EUR", "£", "C$" }));
        divisa1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        divisa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        divisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisa1ActionPerformed(evt);
            }
        });
        getContentPane().add(divisa1);
        divisa1.setBounds(210, 230, 70, 30);

        divisa2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        divisa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "£", "C$", "COP" }));
        divisa2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        divisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisa2ActionPerformed(evt);
            }
        });
        getContentPane().add(divisa2);
        divisa2.setBounds(370, 230, 70, 30);

        btnConvertir.setText("CONVERTIR");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConvertir);
        btnConvertir.setBounds(170, 310, 160, 40);

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        txaResultado.setBorder(null);
        txaResultado.setCaretColor(new java.awt.Color(255, 255, 255));
        txaResultado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txaResultado.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(txaResultado);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(110, 380, 270, 90);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido al conversor de monedas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-50, 80, 610, 80);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Digite el valor y seleccione la moneda que desea convertir");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 160, 460, 30);

        jLabel3.setText("A");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 230, 20, 30);

        setSize(new java.awt.Dimension(901, 658));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void divisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisa1ActionPerformed

    }//GEN-LAST:event_divisa1ActionPerformed

    private void divisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisa2ActionPerformed

    }//GEN-LAST:event_divisa2ActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        recibe = Double.parseDouble(txEntradaMoneda.getText());
        divisaUno = divisa1.getSelectedIndex();
        divisaDos = divisa2.getSelectedIndex();

        Operaciones op = new Operaciones();

        op.setRecibe(recibe);
        op.setDivisaUno(divisaUno);
        op.setDivisaDos(divisaDos);

        //Ejecutar metodo
        double total = op.converPesoADivisa();
        double total2 = op.converDivisaAPeso();

        double total3 = op.converUsdADivisa();
        double total4 = op.converDivisaAUsd();

        double total5 = op.converEurADivisa();
        double total6 = op.converDivisaAEur();

        double total7 = op.converLibADivisa();
        double total8 = op.converDivisaALib();

        double total9 = op.converDCADivisa();
        double total10 = op.converDivisaADC();

        //limpiamos el resultado
        txaResultado.setText("");
        //mostrando el valor convertido

        if (recibe == -1 || recibe == null || recibe <= 0) {
            txaResultado.append("Digite un número valido");
        } else if (recibe == total) {
            txaResultado.append("" + total);
        } else if (recibe == total2) {
            txaResultado.append("" + total2);
        } else if (recibe == total3) {
            txaResultado.append("" + total3);
        } else if (recibe == total4) {
            txaResultado.append("" + total4);
        } else if (recibe == total5) {
            txaResultado.append("" + total5);
        } else if (recibe == total6) {
            txaResultado.append("" + total6);
        } else if (recibe == total7) {
            txaResultado.append("" + total7);
        } else if (recibe == total8) {
            txaResultado.append("" + total8);
        } else if (recibe == total9) {
            txaResultado.append("" + total9);
        } else {
            txaResultado.append("" + total10);
        }


    }//GEN-LAST:event_btnConvertirActionPerformed

    private void txEntradaMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEntradaMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEntradaMonedaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JComboBox<String> divisa1;
    private javax.swing.JComboBox<String> divisa2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txEntradaMoneda;
    private javax.swing.JTextArea txaResultado;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/img.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
            super.paint(g);
        }

    }
}
