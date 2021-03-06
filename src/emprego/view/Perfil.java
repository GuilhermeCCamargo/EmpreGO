/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego.view;

import emprego.Banco;
import emprego.model.Profissional;
import emprego.model.Usuario;

/**
 *
 * @author gcamargo
 */
public class Perfil extends javax.swing.JFrame {

    Profissional profissionaldesejado = new Profissional();
    Usuario usuariologado = new Usuario();

    /**
     * Creates new form Perfil
     */
    public Perfil() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Empre GO - Perfil");
    }

    public Perfil(Usuario usuario, boolean editar) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Empre GO - Perfil");
        this.usuariologado = usuario;
        if (editar != true) {
            jTextFieldPerfilNome.setText(usuariologado.getNome());
            jTextFieldDataNascimento.setText(usuariologado.getData_Nascimento());
            jTextFieldPerfilEmail.setText(usuariologado.getEmail());
            jTextFieldPerfilEndereco.setText(usuariologado.getEndereco());
            jTextFieldPerfilTelefone.setText(String.valueOf(usuariologado.getTelefone()));
            //jTextFieldPerfilProfissao.setText(usuariologado.getProfissao());
            //jTextAreaPerfilExperienciaDescricao.setText(usuariologado.getExperienciaProfissional());
            jTextFieldPerfilNome.setEditable(false);
            jTextFieldDataNascimento.setEditable(false);
            jTextFieldPerfilEmail.setEditable(false);
            jTextFieldPerfilEndereco.setEditable(false);
            jTextFieldPerfilTelefone.setEditable(false);
            jTextFieldPerfilProfissao.setEditable(false);
            jTextFieldPerfilProfissao.setEditable(false);
            jTextAreaPerfilExperienciaDescricao.setEditable(false);
            jButtonPerfilSalvar.setVisible(false);

        } else {
            jTextFieldPerfilNome.setText(usuariologado.getNome());
            jTextFieldDataNascimento.setText(usuariologado.getData_Nascimento());
            jTextFieldPerfilEmail.setText(usuariologado.getEmail());
            jTextFieldPerfilEndereco.setText(usuariologado.getEndereco());
            jTextFieldPerfilTelefone.setText(String.valueOf(usuariologado.getTelefone()));
            jTextFieldPerfilProfissao.setEnabled(true);
            jTextFieldPerfilProfissao.setVisible(true);
            jTextAreaPerfilExperienciaDescricao.setEnabled(true);
            jTextAreaPerfilExperienciaDescricao.setVisible(true);
            jTextFieldPerfilNome.setEditable(true);
            jTextFieldDataNascimento.setEditable(true);
            jTextFieldPerfilEmail.setEditable(true);
            jTextFieldPerfilEndereco.setEditable(true);
            jTextFieldPerfilTelefone.setEditable(true);
            jTextFieldPerfilProfissao.setEditable(true);
            jTextFieldPerfilProfissao.setEditable(true);
            jTextAreaPerfilExperienciaDescricao.setEditable(true);
            jTextAreaPerfilExperienciaDescricao.setEditable(true);
            jButtonPerfilSalvar.setVisible(true);

        }
    }

    public Perfil(Usuario usuario, Profissional profissional) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Empre GO - Perfil");
        this.usuariologado = usuario;
        this.profissionaldesejado = profissional;
        jTextFieldPerfilNome.setText(profissionaldesejado.getNome());
        jTextFieldDataNascimento.setText(profissionaldesejado.getData_Nascimento());
        jTextFieldPerfilEmail.setText(profissionaldesejado.getEmail());
        jTextFieldPerfilEndereco.setText(profissionaldesejado.getEndereco());
        jTextFieldPerfilTelefone.setText(String.valueOf(profissionaldesejado.getTelefone()));
        jTextFieldPerfilProfissao.setText(profissionaldesejado.getProfissao());
        jTextAreaPerfilExperienciaDescricao.setText(profissionaldesejado.getExperienciaProfissional());
        desativarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPerfilNome = new javax.swing.JLabel();
        jTextFieldPerfilNome = new javax.swing.JTextField();
        jLabelPerfilEmail = new javax.swing.JLabel();
        jTextFieldPerfilEmail = new javax.swing.JTextField();
        jLabelPerfilEndereco = new javax.swing.JLabel();
        jTextFieldPerfilEndereco = new javax.swing.JTextField();
        jLabelPerfilTelefone = new javax.swing.JLabel();
        jTextFieldPerfilTelefone = new javax.swing.JTextField();
        jLabelPerfilProfissao = new javax.swing.JLabel();
        jTextFieldPerfilProfissao = new javax.swing.JTextField();
        jLabelPerfilExperienciaDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPerfilExperienciaDescricao = new javax.swing.JTextArea();
        jButtonPerfilSalvar = new javax.swing.JButton();
        jLabelDatanascimento = new javax.swing.JLabel();
        jTextFieldDataNascimento = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPerfilEditar = new javax.swing.JMenu();
        jMenuVoltar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabelPerfilNome.setText("Nome:");

        jLabelPerfilEmail.setText("Email:");

        jLabelPerfilEndereco.setText("Endereço:");

        jLabelPerfilTelefone.setText("Telefone:");

        jLabelPerfilProfissao.setText("Profissão:");

        jLabelPerfilExperienciaDescricao.setText("Última experiência profissional");

        jTextAreaPerfilExperienciaDescricao.setColumns(20);
        jTextAreaPerfilExperienciaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaPerfilExperienciaDescricao);

        jButtonPerfilSalvar.setText("Salvar");
        jButtonPerfilSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonPerfilSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilSalvarActionPerformed(evt);
            }
        });

        jLabelDatanascimento.setText("Data de Nascimento:");

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jMenuPerfilEditar.setText("Editar");
        jMenuPerfilEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuPerfilEditar.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenuPerfilEditarMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuPerfilEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPerfilEditarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuPerfilEditar);

        jMenuVoltar.setText("Voltar");
        jMenuVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuVoltar.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenuVoltarMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVoltarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuVoltar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPerfilSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelPerfilProfissao)
                                .addComponent(jLabelPerfilTelefone)
                                .addComponent(jLabelPerfilEndereco)
                                .addComponent(jLabelPerfilEmail))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelPerfilExperienciaDescricao)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPerfilEmail)
                                    .addComponent(jTextFieldPerfilEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldPerfilProfissao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPerfilTelefone, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelPerfilNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDatanascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldPerfilNome, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPerfilNome)
                    .addComponent(jTextFieldPerfilNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDatanascimento)
                    .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPerfilEmail)
                    .addComponent(jTextFieldPerfilEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPerfilEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPerfilEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPerfilTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPerfilTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPerfilProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPerfilProfissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPerfilExperienciaDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPerfilSalvar)
                    .addComponent(jButtonVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPerfilEditarMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuPerfilEditarMenuSelected

    }//GEN-LAST:event_jMenuPerfilEditarMenuSelected

    private void jMenuVoltarMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuVoltarMenuSelected

    }//GEN-LAST:event_jMenuVoltarMenuSelected

    private void jMenuPerfilEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPerfilEditarMouseClicked
        jTextFieldPerfilNome.setEditable(true);
        jTextFieldPerfilEmail.setEditable(true);
        jTextFieldPerfilEndereco.setEditable(true);
        jTextFieldPerfilTelefone.setEditable(true);
        jTextFieldPerfilProfissao.setEditable(true);
        jTextAreaPerfilExperienciaDescricao.setEditable(true);
        jButtonPerfilSalvar.setVisible(true);

    }//GEN-LAST:event_jMenuPerfilEditarMouseClicked

    private void jMenuVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVoltarMouseClicked
        Inicio voltar = new Inicio();
        voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuVoltarMouseClicked

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        Inicio voltar = new Inicio(usuariologado);
        voltar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void jButtonPerfilSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilSalvarActionPerformed
        String nome = jTextFieldPerfilNome.getText();
        String dataNascimento = jTextFieldDataNascimento.getText();
        String email = jTextFieldPerfilEmail.getText();
        String endereco = jTextFieldPerfilEndereco.getText();
        int telefone = Integer.valueOf(jTextFieldPerfilTelefone.getText());
        String profissao = jTextFieldPerfilProfissao.getText();
        String descricao = jTextAreaPerfilExperienciaDescricao.getText();
    }//GEN-LAST:event_jButtonPerfilSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    public void completar(Usuario usuario, Profissional profissional) {
        jTextFieldPerfilNome.setText(usuario.getNome());
        jTextFieldDataNascimento.setText(usuario.getData_Nascimento());
        jTextFieldPerfilEmail.setText(usuario.getEmail());
        jTextFieldPerfilEndereco.setText(profissional.getEndereco());
        jTextFieldPerfilTelefone.setText(String.valueOf(usuario.getTelefone()));
        jTextFieldPerfilProfissao.setText(profissional.getProfissao());
        jTextAreaPerfilExperienciaDescricao.setText(profissional.getExperienciaProfissional());

    }

    public void desativarCampos() {
        jTextFieldDataNascimento.setEditable(false);
        jTextFieldPerfilNome.setEditable(false);
        jTextFieldPerfilEmail.setEditable(false);
        jTextFieldPerfilEndereco.setEditable(false);
        jTextFieldPerfilTelefone.setEditable(false);
        jTextFieldPerfilProfissao.setEditable(false);
        jTextAreaPerfilExperienciaDescricao.setEditable(false);
        jButtonPerfilSalvar.setVisible(false);

    }

    public void ativarCampos() {
        jTextFieldDataNascimento.setEditable(true);
        jTextFieldPerfilNome.setEditable(true);
        jTextFieldPerfilEmail.setEditable(true);
        jTextFieldPerfilEndereco.setEditable(true);
        jTextFieldPerfilTelefone.setEditable(true);
        jTextFieldPerfilProfissao.setEditable(true);
        jTextAreaPerfilExperienciaDescricao.setEditable(true);
        jButtonPerfilSalvar.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jButtonPerfilSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelDatanascimento;
    private javax.swing.JLabel jLabelPerfilEmail;
    private javax.swing.JLabel jLabelPerfilEndereco;
    private javax.swing.JLabel jLabelPerfilExperienciaDescricao;
    private javax.swing.JLabel jLabelPerfilNome;
    private javax.swing.JLabel jLabelPerfilProfissao;
    private javax.swing.JLabel jLabelPerfilTelefone;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuPerfilEditar;
    private javax.swing.JMenu jMenuVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaPerfilExperienciaDescricao;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldPerfilEmail;
    private javax.swing.JTextField jTextFieldPerfilEndereco;
    private javax.swing.JTextField jTextFieldPerfilNome;
    private javax.swing.JTextField jTextFieldPerfilProfissao;
    private javax.swing.JTextField jTextFieldPerfilTelefone;
    // End of variables declaration//GEN-END:variables
}
