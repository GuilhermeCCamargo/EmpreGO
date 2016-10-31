/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego.view;

import emprego.Banco;
import emprego.listausuarios.ListaUsuarios;
import emprego.model.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gcamargo
 */
public class Login extends javax.swing.JFrame {

    private ListaUsuarios listausuarios;
    List<Usuario> listadeusuarios = new ArrayList<>();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Empre GO - Os melhores ao seu dispor.");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelLoginEmail = new javax.swing.JLabel();
        jTextFieldLoginEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldLoginSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelNaopossui = new javax.swing.JLabel();
        jLabelInicioNome = new javax.swing.JLabel();
        jTextFieldInicioNome = new javax.swing.JTextField();
        jLabelInicioEmail = new javax.swing.JLabel();
        jTextFieldInicioEmail = new javax.swing.JTextField();
        jLabelInicioSenha = new javax.swing.JLabel();
        jTextFieldInicioSenha = new javax.swing.JTextField();
        jButtonCriarConta = new javax.swing.JButton();
        jLabelEsqueceuSenha = new javax.swing.JLabel();
        jLabelCliqueAqui = new javax.swing.JLabel();
        jLabelLogoEmpreGO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelLoginEmail.setText("Email:");

        jLabel2.setText("Senha:");

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelNaopossui.setText("Ainda não possui Cadastro?");

        jLabelInicioNome.setText("Nome:");

        jLabelInicioEmail.setText("Email:");

        jLabelInicioSenha.setText("Senha:");

        jButtonCriarConta.setText("Criar Conta EmpreGO");
        jButtonCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelNaopossui)
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelInicioNome)
                            .addComponent(jLabelInicioSenha)
                            .addComponent(jLabelInicioEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldInicioEmail)
                                    .addComponent(jTextFieldInicioSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                            .addComponent(jTextFieldInicioNome, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jButtonCriarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelNaopossui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInicioNome)
                    .addComponent(jTextFieldInicioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInicioEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInicioEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldInicioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInicioSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCriarConta)
                .addGap(25, 25, 25))
        );

        jLabelEsqueceuSenha.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelEsqueceuSenha.setText("Esqueceu sua senha?");

        jLabelCliqueAqui.setForeground(new java.awt.Color(0, 102, 255));
        jLabelCliqueAqui.setText("Clique Aqui!");
        jLabelCliqueAqui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCliqueAqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCliqueAquiMouseClicked(evt);
            }
        });

        jLabelLogoEmpreGO.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        jLabelLogoEmpreGO.setText("EmpreGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelLogoEmpreGO)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabelLoginEmail))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPasswordFieldLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldLoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelEsqueceuSenha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelCliqueAqui)))
                                .addContainerGap(12, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelLogoEmpreGO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLoginEmail)
                    .addComponent(jTextFieldLoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCliqueAqui)
                    .addComponent(jLabelEsqueceuSenha))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarContaActionPerformed
        try {
            Banco cadastro = new Banco();
            String nome = jTextFieldInicioNome.getText();
            String email = jTextFieldInicioEmail.getText();
            String senha = jTextFieldInicioSenha.getText();
            if (cadastro.Cadastro(nome, email, senha)) {
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.");
                limparCamposCadastro();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível concluir teu cadastro. Verifiuqe tua conexão com o banco e tente novamente.");
                limparCamposCadastro();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonCriarContaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Banco login = new Banco();
        String email = jTextFieldLoginEmail.getText();
        String senha = jPasswordFieldLoginSenha.getText();
        if (email.equals("") || senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos para logar no sistema.");
        } else if (login.Login(email, senha)) {
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha inválidos tente novamente.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelCliqueAquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCliqueAquiMouseClicked
        RecuperarSenha recovery = new RecuperarSenha();
        recovery.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelCliqueAquiMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public void limparCamposCadastro() {
        jTextFieldInicioNome.setText("");
        jTextFieldInicioEmail.setText("");
        jTextFieldInicioSenha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCriarConta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCliqueAqui;
    private javax.swing.JLabel jLabelEsqueceuSenha;
    private javax.swing.JLabel jLabelInicioEmail;
    private javax.swing.JLabel jLabelInicioNome;
    private javax.swing.JLabel jLabelInicioSenha;
    private javax.swing.JLabel jLabelLoginEmail;
    private javax.swing.JLabel jLabelLogoEmpreGO;
    private javax.swing.JLabel jLabelNaopossui;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldLoginSenha;
    private javax.swing.JTextField jTextFieldInicioEmail;
    private javax.swing.JTextField jTextFieldInicioNome;
    private javax.swing.JTextField jTextFieldInicioSenha;
    private javax.swing.JTextField jTextFieldLoginEmail;
    // End of variables declaration//GEN-END:variables
}
