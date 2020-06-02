/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thordrugstore.farmacia.view;

import java.awt.Dimension;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author lipes
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Desktop = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCad = new javax.swing.JMenu();
        menuCadFun = new javax.swing.JMenuItem();
        menuCadCli = new javax.swing.JMenuItem();
        menuCadFor = new javax.swing.JMenuItem();
        menuCadPro = new javax.swing.JMenuItem();
        menuRel = new javax.swing.JMenu();
        menuRelCli = new javax.swing.JMenuItem();
        MenuRelMen = new javax.swing.JMenuItem();
        menuAju = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuServicos = new javax.swing.JMenu();
        menuServCompra = new javax.swing.JMenuItem();
        menuOpc = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X - Sistema ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Desktop.setPreferredSize(new java.awt.Dimension(673, 689));
        Desktop.setRequestFocusEnabled(false);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblData.setText("Data");

        menuCad.setText("Cadastro");

        menuCadFun.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        menuCadFun.setText("Funcionário");
        menuCadFun.setEnabled(false);
        menuCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadFunActionPerformed(evt);
            }
        });
        menuCad.add(menuCadFun);

        menuCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuCadCli.setText("Cliente");
        menuCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadCliActionPerformed(evt);
            }
        });
        menuCad.add(menuCadCli);

        menuCadFor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK));
        menuCadFor.setText("Fornecedor");
        menuCadFor.setEnabled(false);
        menuCadFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadForActionPerformed(evt);
            }
        });
        menuCad.add(menuCadFor);

        menuCadPro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menuCadPro.setText("Produto");
        menuCadPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadProActionPerformed(evt);
            }
        });
        menuCad.add(menuCadPro);

        jMenuBar1.add(menuCad);

        menuRel.setText("Relatório");
        menuRel.setEnabled(false);

        menuRelCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menuRelCli.setText("Relatório Cliente");
        menuRelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelCliActionPerformed(evt);
            }
        });
        menuRel.add(menuRelCli);

        MenuRelMen.setText("Relatório Mensal");
        MenuRelMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelMenActionPerformed(evt);
            }
        });
        menuRel.add(MenuRelMen);

        jMenuBar1.add(menuRel);

        menuAju.setText("Ajuda");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Sobre");
        menuAju.add(jMenuItem2);

        jMenuBar1.add(menuAju);

        menuServicos.setText("Serviços");
        menuServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuServicosActionPerformed(evt);
            }
        });

        menuServCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuServCompra.setText("Compra");
        menuServCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuServCompraActionPerformed(evt);
            }
        });
        menuServicos.add(menuServCompra);

        jMenuBar1.add(menuServicos);

        menuOpc.setText("Opções");

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuOpc.add(menuSair);

        jMenuBar1.add(menuOpc);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData)
                    .addComponent(lblUsuario))
                .addGap(0, 57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblUsuario)
                .addGap(30, 30, 30)
                .addComponent(lblData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadForActionPerformed
        TelaFornecedor fornecedor = new TelaFornecedor();
        fornecedor.setVisible(true);
    }//GEN-LAST:event_menuCadForActionPerformed

    private void menuCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadCliActionPerformed
        // menu Cliente
        TelaCliente novoArquivo = new TelaCliente();
        
        //Defino o tamanho da janela e adiciono ao desktopPanel [859, 742]
        novoArquivo.setPreferredSize(new Dimension(859,742));
        novoArquivo.setLocationRelativeTo(this);
        
        //Habilitar a view
        novoArquivo.setVisible(true);

        //Forço o internalframe a ajustar seus componentes às dimensões preferidas
        novoArquivo.pack();
    }//GEN-LAST:event_menuCadCliActionPerformed

    private void menuCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadFunActionPerformed
        TelaFuncionarios funcionarios = new TelaFuncionarios();
        funcionarios.setVisible(true);
    }//GEN-LAST:event_menuCadFunActionPerformed

    private void menuRelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelCliActionPerformed
        TelaRelatorioCliente cliente = new TelaRelatorioCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_menuRelCliActionPerformed

    private void menuServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuServicosActionPerformed
       
    }//GEN-LAST:event_menuServicosActionPerformed

    private void menuServCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuServCompraActionPerformed
        TelaVenda compra = new TelaVenda();
        compra.setVisible(true);
        Desktop.add(compra);
    }//GEN-LAST:event_menuServCompraActionPerformed

    private void menuCadProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadProActionPerformed
        TelaProduto produto = new TelaProduto();
        produto.setVisible(true);
    }//GEN-LAST:event_menuCadProActionPerformed

    private void MenuRelMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelMenActionPerformed
        TelaRelatorioVendas mensal = new TelaRelatorioVendas();
        mensal.setVisible(true);
    }//GEN-LAST:event_MenuRelMenActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
          int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?","Atenção",JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION){
            System.exit(0); // encerrar o sistema
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem MenuRelMen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblData;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuAju;
    public javax.swing.JMenu menuCad;
    private javax.swing.JMenuItem menuCadCli;
    public javax.swing.JMenuItem menuCadFor;
    public javax.swing.JMenuItem menuCadFun;
    private javax.swing.JMenuItem menuCadPro;
    private javax.swing.JMenu menuOpc;
    public javax.swing.JMenu menuRel;
    private javax.swing.JMenuItem menuRelCli;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuServCompra;
    private javax.swing.JMenu menuServicos;
    // End of variables declaration//GEN-END:variables
}
