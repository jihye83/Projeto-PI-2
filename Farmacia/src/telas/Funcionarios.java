/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author trodrsil
 */
public class Funcionarios extends javax.swing.JFrame {

    /**
     * Creates new form Funcionarios
     */
    public Funcionarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldCodFunc = new javax.swing.JTextField();
        jLabelSalarioFunc = new javax.swing.JLabel();
        jLabelNomeFunc = new javax.swing.JLabel();
        jTextFieldNomeFunc = new javax.swing.JTextField();
        jLabelCPFFunc = new javax.swing.JLabel();
        jTextFieldCPFFunc = new javax.swing.JTextField();
        jLabelLogradouroFunc = new javax.swing.JLabel();
        jTextFieldLogradouroFunc = new javax.swing.JTextField();
        jLabelNumFunc = new javax.swing.JLabel();
        jTextFieldNumFunc = new javax.swing.JTextField();
        jLabelComplemFunc = new javax.swing.JLabel();
        jTextFieldComplem = new javax.swing.JTextField();
        jLabelUF = new javax.swing.JLabel();
        jTextFieldUF = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelCod = new javax.swing.JLabel();
        jLabelFuncao = new javax.swing.JLabel();
        jTextFieldFuncao = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jButtonIncluir = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTitle.setText("Funcionários");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelSalarioFunc.setText("Salário: ");

        jLabelNomeFunc.setText("Nome:");

        jLabelCPFFunc.setText("CPF:");

        jLabelLogradouroFunc.setText("Logradouro:");

        jLabelNumFunc.setText("Número:");

        jLabelComplemFunc.setText("Complemento: ");

        jLabelUF.setText("UF:");

        jLabelTelefone.setText("Telefone:");

        jLabelEmail.setText("E-mail:");

        jLabelCod.setText("Código:");

        jLabelFuncao.setText("Função:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNomeFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeFunc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCPFFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCPFFunc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelLogradouroFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldLogradouroFunc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNumFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNumFunc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelComplemFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldComplem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldUF))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTelefone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFuncao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFuncao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSalarioFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCod)
                    .addComponent(jTextFieldCodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFunc)
                    .addComponent(jTextFieldNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCPFFunc)
                    .addComponent(jTextFieldCPFFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogradouroFunc)
                    .addComponent(jTextFieldLogradouroFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumFunc)
                    .addComponent(jTextFieldNumFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComplemFunc)
                    .addComponent(jTextFieldComplem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUF)
                    .addComponent(jTextFieldUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFuncao)
                    .addComponent(jTextFieldFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSalarioFunc)
                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButtonIncluir.setText("Incluir Registro");

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(95, 95, 95))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAtualizar, jButtonExcluir, jButtonIncluir, jButtonPesquisar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAtualizar, jButtonExcluir, jButtonIncluir, jButtonPesquisar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funcionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabelCPFFunc;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelComplemFunc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFuncao;
    private javax.swing.JLabel jLabelLogradouroFunc;
    private javax.swing.JLabel jLabelNomeFunc;
    private javax.swing.JLabel jLabelNumFunc;
    private javax.swing.JLabel jLabelSalarioFunc;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCPFFunc;
    private javax.swing.JTextField jTextFieldCodFunc;
    private javax.swing.JTextField jTextFieldComplem;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFuncao;
    private javax.swing.JTextField jTextFieldLogradouroFunc;
    private javax.swing.JTextField jTextFieldNomeFunc;
    private javax.swing.JTextField jTextFieldNumFunc;
    private javax.swing.JTextField jTextFieldSalario;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldUF;
    // End of variables declaration//GEN-END:variables
}
