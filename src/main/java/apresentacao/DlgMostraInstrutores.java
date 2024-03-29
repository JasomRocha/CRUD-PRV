package apresentacao;

import java.util.ArrayList;
import negocio.Instrutor;
import persistencia.ControlaInstrutor;

/**
 *
 * @author jasom
 */
public class DlgMostraInstrutores extends javax.swing.JDialog {
    
    ControlaInstrutor ci = new ControlaInstrutor();
    
    
    public DlgMostraInstrutores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public DlgMostraInstrutores(java.awt.Frame parent, boolean modal, ControlaInstrutor ci) {
        super(parent, modal);
        this.ci = ci;
        initComponents();
        exibeInformacoes();
    }
   
    
    public void exibeInformacoes(){
         ArrayList <Instrutor> instrutores = ci.retornarTodos();
         
         //limpar JTable
         for(int i=0; i < instrutores.size(); i++){
             tblInstrutor.setValueAt(" ", i, 0);
             tblInstrutor.setValueAt(" ", i, 1);
             tblInstrutor.setValueAt(" ", i, 2);
             tblInstrutor.setValueAt(" ", i, 3);
             tblInstrutor.setValueAt(" ", i, 4);
         }
         
         for(int i = 0; i<instrutores.size() && instrutores.get(i) != null; i++){
              tblInstrutor.setValueAt(instrutores.get(i).getNome(), i, 0);
              tblInstrutor.setValueAt(instrutores.get(i).getSobrenome(), i, 1);
              tblInstrutor.setValueAt(instrutores.get(i).getTreinamento(), i, 2);
              tblInstrutor.setValueAt(instrutores.get(i).getEndereco(), i, 3);
              tblInstrutor.setValueAt(instrutores.get(i).getNumero(), i, 4);

         }
         
     }
    
      public void exibeInformacoesOrdenado(){
         ArrayList <Instrutor> instrutores = ci.retornarTodos();
         instrutores = ci.ordenarTabela(instrutores);
         //limpar JTable
         for(int i=0; i < instrutores.size(); i++){
             tblInstrutor.setValueAt(" ", i, 0);
             tblInstrutor.setValueAt(" ", i, 1);
             tblInstrutor.setValueAt(" ", i, 2);
             tblInstrutor.setValueAt(" ", i, 3);
             tblInstrutor.setValueAt(" ", i, 4);
         }
         
         for(int i = 0; i<instrutores.size() && instrutores.get(i) != null; i++){
              tblInstrutor.setValueAt(instrutores.get(i).getNome(), i, 0);
              tblInstrutor.setValueAt(instrutores.get(i).getSobrenome(), i, 1);
              tblInstrutor.setValueAt(instrutores.get(i).getTreinamento(), i, 2);
              tblInstrutor.setValueAt(instrutores.get(i).getEndereco(), i, 3);
              tblInstrutor.setValueAt(instrutores.get(i).getNumero(), i, 4);

         }
         
     }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInstrutor = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela de instrutores");

        tblInstrutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "Treinamento", "Endereço", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInstrutor);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrdenar)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnOrdenar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        exibeInformacoesOrdenado();
    }//GEN-LAST:event_btnOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(DlgMostraInstrutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgMostraInstrutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgMostraInstrutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgMostraInstrutores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgMostraInstrutores dialog = new DlgMostraInstrutores(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInstrutor;
    // End of variables declaration//GEN-END:variables
}
