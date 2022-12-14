/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import entidades.Categoria;
import javax.swing.JOptionPane;
import persistencia.CategoriaDAO;

/**
 *
 * @author willian.xavier
 */
public class TelaCadastroCategoria extends javax.swing.JFrame {

    private Categoria categoria = new Categoria();
    private TelaListaCategoria telaListagem;
    /**
     * Creates new form TelaCadastroCategoria
     */
    public TelaCadastroCategoria(TelaListaCategoria telaListagem) {
        initComponents();
        this.telaListagem = telaListagem;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
        txtCategoria.setText(categoria.getNome());
        if(categoria.getTipo() == 'F') {
            rdbFilme.setSelected(true);
        } else if(categoria.getTipo() == 'J' ) {
            rdbJogo.setSelected(true);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTipo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rdbFilme = new javax.swing.JRadioButton();
        rdbJogo = new javax.swing.JRadioButton();
        btnGravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Categoria");

        jLabel2.setText("Tipo");

        rdbFilme.setText("Filme");

        rdbJogo.setText("Jogo");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGravar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbFilme)
                                .addGap(18, 18, 18)
                                .addComponent(rdbJogo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbFilme)
                    .addComponent(rdbJogo))
                .addGap(37, 37, 37)
                .addComponent(btnGravar)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
        categoria.setNome(txtCategoria.getText());
        if(rdbFilme.isSelected()) {
            categoria.setTipo('F');
        } else if (rdbJogo.isSelected()) {
            categoria.setTipo('J');
        }
        if(categoria.getTipo() != ' ') {
            if(categoria.getId() == 0) {
                inserir();
            } else {
                alterar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione o tipo de categoria");
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                //new TelaCadastroCategoria().setVisible(true);
//            }
//        });
//    }
//    
    private void inserir() {
        if(CategoriaDAO.inserir(categoria)) {
            JOptionPane.showMessageDialog(this, "Categoria inserida com sucesso!");
            telaListagem.montarListaCategorias();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao inserir categoria");
        }
    }
    
    private void alterar() {
        if(CategoriaDAO.alterar(categoria)) {
            JOptionPane.showMessageDialog(this, "Categoria alterada com sucesso!");
            telaListagem.montarListaCategorias();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar categoria");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.ButtonGroup btnTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rdbFilme;
    private javax.swing.JRadioButton rdbJogo;
    private javax.swing.JTextField txtCategoria;
    // End of variables declaration//GEN-END:variables
}
