/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AviaoDAO;
import dao.CategoriaDAO;
import database.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Aviao;
import model.Categoria;

/**
 *
 * @author Alunos
 */
public class JFrameCadastroAviao extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCadastroAviao
     */
    public JFrameCadastroAviao() {
        initComponents();
        limparComponentes();
    }

    public JFrameCadastroAviao(Aviao aviao) {
        this();
        jTextFieldCodigo.setText(String.valueOf(aviao.getCodigo()));
        popularComponentes(aviao);
    }

    public void limparComponentes() {
        jTextFieldNome.setText("");
        jComboBoxCategoria.setSelectedIndex(-1);
    }

    public void popularComponentes(Aviao aviao) {
        jTextFieldNome.setText(aviao.getNome());
        for (int i = 0; i < jComboBoxCategoria.getModel().getSize(); i++) {
            Categoria categoria = jComboBoxCategoria.getModel().getElementAt(i);
            if (categoria.getId() == aviao.getCategoria().getId()) {
                jComboBoxCategoria.setSelectedIndex(i);
                return;
            }
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

        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<Categoria>();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCodigo.setText("Código:");

        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCodigoFocusLost(evt);
            }
        });
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyReleased(evt);
            }
        });

        jLabelNome.setText("Nome:");

        jTextFieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCategoria.setText("Categoria:");

        jComboBoxCategoria.setModel(popularJComboBoxCategoria());

        jButtonSalvar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCategoria)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCodigo)
                    .addComponent(jTextFieldNome)
                    .addComponent(jComboBoxCategoria, 0, 295, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoria)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButtonSalvar)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (!jTextFieldCodigo.getText().equals("")) {
            int codigo = Integer.parseInt(jTextFieldCodigo.getText());

            Aviao aviao = new Aviao();
            aviao.setCodigo(codigo);
            aviao.setNome(jTextFieldNome.getText());
            aviao.setCategoria((Categoria) jComboBoxCategoria.getSelectedItem());
            int codigoAlterado = new AviaoDAO().alterar(aviao);
            if (codigo == Utilitarios.NAO_FOI_POSSIVEL_ALTERAR) {
                JOptionPane.showMessageDialog(null, "Não foi possível alerar", "Aviso", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Avião alterado");
            }

        } else {

            Aviao aviao = new Aviao();
            aviao.setNome(jTextFieldNome.getText());
            aviao.setCategoria((Categoria) jComboBoxCategoria.getSelectedItem());
            int codigoInserido = new AviaoDAO().inserir(aviao);
            if (codigoInserido == Utilitarios.NAO_FOI_POSSIVEL_INSERIR) {
                JOptionPane.showMessageDialog(null, "Não foi possível inserir o avião", "Aviso", JOptionPane.ERROR_MESSAGE);
            } else {
                jTextFieldCodigo.setText(String.valueOf(codigoInserido));
                aviao.setCodigo(codigoInserido);
                JOptionPane.showMessageDialog(null, "Avião inserido com sucesso.");
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            verificarCodigoExistente();
    }//GEN-LAST:event_jTextFieldCodigoKeyReleased
    }
    private void jTextFieldCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCodigoFocusLost
        verificarCodigoExistente();
    }//GEN-LAST:event_jTextFieldCodigoFocusLost

    public void verificarCodigoExistente() {
        try {

            int codigo = Integer.parseInt(jTextFieldCodigo.getText());
            Aviao aviao = new AviaoDAO().buscarAviaoPorId(codigo);
            if (aviao == null) {
                JOptionPane.showMessageDialog(null, "Código inválido");
                limparComponentes();
                jTextFieldCodigo.requestFocus();
            } else {
                popularComponentes(aviao);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor informado não é válido");
        }
    }

    public DefaultComboBoxModel<Categoria> popularJComboBoxCategoria() {
        DefaultComboBoxModel<Categoria> model = new DefaultComboBoxModel<>();
        ArrayList<Categoria> categorias = new CategoriaDAO().retornarListaCategoria();
        for (Categoria categoria : categorias) {
            model.addElement(categoria);
        }
        return model;
    }

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
            java.util.logging.Logger.getLogger(JFrameCadastroAviao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroAviao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroAviao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroAviao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroAviao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<Categoria> jComboBoxCategoria;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
