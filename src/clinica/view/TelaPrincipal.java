/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.view;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSecretaria = new javax.swing.JMenu();
        jMenuItemCadastrarPaciente = new javax.swing.JMenuItem();
        jMenuItemRelatorioCadastro = new javax.swing.JMenuItem();
        jMenuItemEditarPaciente = new javax.swing.JMenuItem();
        jMenuItemExcluirPaciente = new javax.swing.JMenuItem();
        jMenuItemCadastrarConsulta = new javax.swing.JMenuItem();
        jMenuItemRelatorioConsulta = new javax.swing.JMenuItem();
        jMenuItemEditarConsulta = new javax.swing.JMenuItem();
        jMenuItemExcluirConsulta = new javax.swing.JMenuItem();
        jMenuItemConsultasProximas = new javax.swing.JMenuItem();
        jMenuMedico = new javax.swing.JMenu();
        jMenuItemCadastrarDados = new javax.swing.JMenuItem();
        jMenuItemEditarDados = new javax.swing.JMenuItem();
        jMenuItemExcluirDados = new javax.swing.JMenuItem();
        jMenuItemRelatorioConsultas = new javax.swing.JMenuItem();
        jMenuItemCadastrarProntuario = new javax.swing.JMenuItem();
        jMenuItemEditarProntuario = new javax.swing.JMenuItem();
        jMenuItemExcluirProntuario = new javax.swing.JMenuItem();
        jMenuItemRelatorioMedico = new javax.swing.JMenuItem();
        jMenuAvisarConsultas = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dyuthi", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Salve Doidos!!");

        jMenuSecretaria.setText(" Secretaria");
        jMenuSecretaria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItemCadastrarPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadastrarPaciente.setText("Cadastrar Paciente");
        jMenuItemCadastrarPaciente.setToolTipText("");
        jMenuItemCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarPacientePacienteActionPerformed(evt);
            }
        });
        jMenuSecretaria.add(jMenuItemCadastrarPaciente);

        jMenuItemRelatorioCadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemRelatorioCadastro.setText("Relatorio Cadastro");
        jMenuSecretaria.add(jMenuItemRelatorioCadastro);

        jMenuItemEditarPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemEditarPaciente.setText("Editar Paciente");
        jMenuItemEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarPacienteActionPerformed(evt);
            }
        });
        jMenuSecretaria.add(jMenuItemEditarPaciente);

        jMenuItemExcluirPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemExcluirPaciente.setText("Excluir Paciente");
        jMenuItemExcluirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirPacienteActionPerformed(evt);
            }
        });
        jMenuSecretaria.add(jMenuItemExcluirPaciente);

        jMenuItemCadastrarConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadastrarConsulta.setText("Cadastrar Consulta");
        jMenuItemCadastrarConsulta.setToolTipText("");
        jMenuSecretaria.add(jMenuItemCadastrarConsulta);

        jMenuItemRelatorioConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemRelatorioConsulta.setText("Relatorio Consulta");
        jMenuSecretaria.add(jMenuItemRelatorioConsulta);

        jMenuItemEditarConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemEditarConsulta.setText("Editar Consulta");
        jMenuSecretaria.add(jMenuItemEditarConsulta);

        jMenuItemExcluirConsulta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemExcluirConsulta.setText("Excluir Consulta");
        jMenuItemExcluirConsulta.setToolTipText("");
        jMenuSecretaria.add(jMenuItemExcluirConsulta);

        jMenuItemConsultasProximas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemConsultasProximas.setText("Consultas proximas");
        jMenuSecretaria.add(jMenuItemConsultasProximas);

        jMenuBar1.add(jMenuSecretaria);

        jMenuMedico.setText(" Medico");
        jMenuMedico.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItemCadastrarDados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadastrarDados.setText("Cadastrar Dados");
        jMenuMedico.add(jMenuItemCadastrarDados);

        jMenuItemEditarDados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemEditarDados.setText("Editar Dados");
        jMenuMedico.add(jMenuItemEditarDados);

        jMenuItemExcluirDados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemExcluirDados.setText("Excluir Dados");
        jMenuMedico.add(jMenuItemExcluirDados);

        jMenuItemRelatorioConsultas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemRelatorioConsultas.setText("Relatorio Consultas");
        jMenuMedico.add(jMenuItemRelatorioConsultas);

        jMenuItemCadastrarProntuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCadastrarProntuario.setText("Cadastrar Prontuario");
        jMenuMedico.add(jMenuItemCadastrarProntuario);

        jMenuItemEditarProntuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemEditarProntuario.setText("Editar Prontuario");
        jMenuMedico.add(jMenuItemEditarProntuario);

        jMenuItemExcluirProntuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemExcluirProntuario.setText("Excluir Prontuario");
        jMenuMedico.add(jMenuItemExcluirProntuario);

        jMenuItemRelatorioMedico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemRelatorioMedico.setText("Relatorio Medico");
        jMenuMedico.add(jMenuItemRelatorioMedico);

        jMenuBar1.add(jMenuMedico);

        jMenuAvisarConsultas.setText("  Avisar Consultas");
        jMenuAvisarConsultas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuBar1.add(jMenuAvisarConsultas);

        jMenuSair.setText("  SAIR   ");
        jMenuSair.setBorderPainted(false);
        jMenuSair.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuSair.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                jMenuSairMenuCanceled(evt);
            }
        });
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, Short.MAX_VALUE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("ta escrito doido");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastrarPacientePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarPacientePacienteActionPerformed
        TelaCadastroPaciente tela = new TelaCadastroPaciente();
        
        tela.setVisible(true);
        //setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCadastrarPacientePacienteActionPerformed

    private void jMenuItemExcluirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemExcluirPacienteActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuSairMenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuSairMenuCanceled
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairMenuCanceled

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarPacienteActionPerformed
        TelaEditarPaciente edit = new TelaEditarPaciente();
        edit.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEditarPacienteActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAvisarConsultas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCadastrarConsulta;
    private javax.swing.JMenuItem jMenuItemCadastrarDados;
    private javax.swing.JMenuItem jMenuItemCadastrarPaciente;
    private javax.swing.JMenuItem jMenuItemCadastrarProntuario;
    private javax.swing.JMenuItem jMenuItemConsultasProximas;
    private javax.swing.JMenuItem jMenuItemEditarConsulta;
    private javax.swing.JMenuItem jMenuItemEditarDados;
    private javax.swing.JMenuItem jMenuItemEditarPaciente;
    private javax.swing.JMenuItem jMenuItemEditarProntuario;
    private javax.swing.JMenuItem jMenuItemExcluirConsulta;
    private javax.swing.JMenuItem jMenuItemExcluirDados;
    private javax.swing.JMenuItem jMenuItemExcluirPaciente;
    private javax.swing.JMenuItem jMenuItemExcluirProntuario;
    private javax.swing.JMenuItem jMenuItemRelatorioCadastro;
    private javax.swing.JMenuItem jMenuItemRelatorioConsulta;
    private javax.swing.JMenuItem jMenuItemRelatorioConsultas;
    private javax.swing.JMenuItem jMenuItemRelatorioMedico;
    private javax.swing.JMenu jMenuMedico;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSecretaria;
    // End of variables declaration//GEN-END:variables
}
