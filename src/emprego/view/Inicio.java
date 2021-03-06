/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprego.view;

import emprego.Banco;
import emprego.model.Profissional;
import emprego.model.Solicitacao;
import emprego.model.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author gcamargo
 */
public class Inicio extends javax.swing.JFrame {

    Usuario usuariologado = new Usuario();
    List<Profissional> listaTabelaProfissional = new ArrayList<>();
    List<Profissional> listaisUsuario = new ArrayList<>();
    List<Profissional> listaFinal = new ArrayList<>();
    List<Solicitacao> listaSolicitacoes = new ArrayList<>();

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Empre GO - Início");
        jMenuCompletarCadastro.setBorderPainted(false);

    }

    public Inicio(Usuario usuario) {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Empre GO - Início");
        jMenuCompletarCadastro.setBorderPainted(false);
        this.usuariologado = usuario;
        Banco listagem = new Banco();
        this.listaSolicitacoes = listagem.verificaSolicitacao(usuariologado.getIdUsuario());
        jLabelNomeUsuario.setText(usuariologado.getNome());
        jLabelDataUltimoLogin.setText(String.valueOf(usuariologado.getUltimologin()));
        this.listaTabelaProfissional = listagem.listarTabelaProfissional();
        this.listaisUsuario = listagem.listarIsUsuario();
        this.listaFinal = listagem.montagemdoProfissional(listaTabelaProfissional, listaisUsuario);
        if (listaSolicitacoes != null) {
            jMenuSolicitacoes.setBorderPainted(true);
            jMenuSolicitacoes.setForeground(Color.GREEN);
            JOptionPane.showMessageDialog(null, "Você tem notificações.");

        } else {
            jMenuSolicitacoes.setBorderPainted(false);
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

        jLabelInicioLogo = new javax.swing.JLabel();
        jLabelEventosRecentes = new javax.swing.JLabel();
        jLabelBoasVindas = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEventosRecentes = new javax.swing.JList<>();
        jLabelExplicando = new javax.swing.JLabel();
        jLabelExplicandocontinuacao = new javax.swing.JLabel();
        jLabelUltimoLogin = new javax.swing.JLabel();
        jLabelDataUltimoLogin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCompletarCadastro = new javax.swing.JMenu();
        jMenuPerfil = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemEditar = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItemVisualizar = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuSolicitacoes = new javax.swing.JMenu();
        jMenuConta = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabelInicioLogo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelInicioLogo.setText("Empre GO");

        jLabelEventosRecentes.setText("Eventos Recentes");

        jLabelBoasVindas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelBoasVindas.setText("Seja Bem Vindo:");

        jLabelNomeUsuario.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N

        jListEventosRecentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListEventosRecentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListEventosRecentes);

        jLabelExplicando.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelExplicando.setText("A lista acima contém os profissionais cadastrados.");

        jLabelExplicandocontinuacao.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelExplicandocontinuacao.setText("Para ver as opções disponíveis clique no usuário desejado.");

        jLabelUltimoLogin.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabelUltimoLogin.setText("Último Login em:");

        jMenuCompletarCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
        jMenuCompletarCadastro.setForeground(new java.awt.Color(0, 0, 0));
        jMenuCompletarCadastro.setText("Completar Perfil");
        jMenuCompletarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuCompletarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCompletarCadastroMouseClicked(evt);
            }
        });
        jMenuCompletarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCompletarCadastroActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuCompletarCadastro);

        jMenuPerfil.setForeground(new java.awt.Color(0, 0, 0));
        jMenuPerfil.setText("Perfil");
        jMenuPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPerfilMouseClicked(evt);
            }
        });
        jMenuPerfil.add(jSeparator3);

        jMenuItemEditar.setText("Editar");
        jMenuItemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarActionPerformed(evt);
            }
        });
        jMenuPerfil.add(jMenuItemEditar);
        jMenuPerfil.add(jSeparator5);

        jMenuItemVisualizar.setText("Visualizar");
        jMenuItemVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVisualizarActionPerformed(evt);
            }
        });
        jMenuPerfil.add(jMenuItemVisualizar);
        jMenuPerfil.add(jSeparator4);

        jMenuBar1.add(jMenuPerfil);

        jMenuSolicitacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        jMenuSolicitacoes.setForeground(new java.awt.Color(0, 0, 0));
        jMenuSolicitacoes.setText("Solicitações");
        jMenuSolicitacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuSolicitacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSolicitacoesMouseClicked(evt);
            }
        });
        jMenuSolicitacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSolicitacoesActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSolicitacoes);

        jMenuConta.setForeground(new java.awt.Color(0, 0, 0));
        jMenuConta.setText("Conta");
        jMenuConta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuConta.add(jSeparator1);

        jMenuItemExcluir.setText("Excluir");
        jMenuConta.add(jMenuItemExcluir);
        jMenuConta.add(jSeparator2);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemSairMouseClicked(evt);
            }
        });
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuConta.add(jMenuItemSair);

        jMenuBar1.add(jMenuConta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelExplicandocontinuacao)
                    .addComponent(jLabelExplicando))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabelInicioLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabelEventosRecentes))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBoasVindas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelUltimoLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDataUltimoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInicioLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEventosRecentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBoasVindas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUltimoLogin)
                    .addComponent(jLabelDataUltimoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExplicando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabelExplicandocontinuacao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSairMouseClicked
        Login inicio = new Login();
        inicio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuItemSairMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (usuariologado.getCompleto() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, complete seu cadastro.");
            jMenuCompletarCadastro.setBorderPainted(true);
            jMenuCompletarCadastro.setVisible(true);
            DefaultListModel modelList = new DefaultListModel();

            for (Profissional profissional : listaFinal) {
                modelList.addElement(profissional.toString());
            }
            jListEventosRecentes.setModel(modelList);

        } else {

            jMenuCompletarCadastro.setBorderPainted(false);
            jMenuCompletarCadastro.setEnabled(false);
            jMenuCompletarCadastro.setVisible(false);
            DefaultListModel modelList = new DefaultListModel();

            for (Profissional profissional : listaFinal) {
                modelList.addElement(profissional.toString());
            }
            jListEventosRecentes.setModel(modelList);

        }


    }//GEN-LAST:event_formComponentShown

    private void jMenuCompletarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCompletarCadastroMouseClicked

        Cadastro perfil = new Cadastro(usuariologado);
        perfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuCompletarCadastroMouseClicked

    private void jMenuPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPerfilMouseClicked

    }//GEN-LAST:event_jMenuPerfilMouseClicked

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        Login sair = new Login();
        sair.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarActionPerformed

        Perfil perfil = new Perfil(usuariologado, true);
        perfil.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuItemEditarActionPerformed

    private void jMenuItemVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVisualizarActionPerformed

        Perfil visualizar = new Perfil(usuariologado, false);
        visualizar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemVisualizarActionPerformed

    private void jListEventosRecentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListEventosRecentesMouseClicked
        if (listaFinal.size() > 0) {
            if (!javax.swing.SwingUtilities.isRightMouseButton(evt) && !javax.swing.SwingUtilities.isMiddleMouseButton(evt)) {

                //javax.swing.SwingUtilities.isMiddleMouseButton(evt)){
                String Profissional = jListEventosRecentes.getSelectedValue();
                int escolha = Integer.valueOf(JOptionPane.showInputDialog("Selecione uma opção:\n1- Visualizar Perfil\n2- Solicitar serviço\n0- Cancelar"));
                switch (escolha) {
                    case 1:
                        int codigo = getCod(Profissional);
                        Banco procura = new Banco();
                        Profissional profissionalDesejado = procura.procuraProfissional(listaFinal, codigo);
                        Perfil visualizar = new Perfil(usuariologado, profissionalDesejado);
                        visualizar.setVisible(true);
                        this.dispose();
                        break;
                    case 2:
                        int codigoProfissional = getCod(Profissional);
                        FrameSolicitacao solicitar = new FrameSolicitacao(usuariologado, listaFinal, codigoProfissional,listaSolicitacoes);
                        solicitar.setVisible(true);
                        this.dispose();

                        break;
                    case 0:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
                        break;
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "No momento ainda não existe profissional cadastrado.");


    }//GEN-LAST:event_jListEventosRecentesMouseClicked
    }
    private void jMenuCompletarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCompletarCadastroActionPerformed

        Cadastro completar = new Cadastro(usuariologado);
        completar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuCompletarCadastroActionPerformed

    private void jMenuSolicitacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSolicitacoesActionPerformed
        SolicitacoesRecebidas solicitacoes = new SolicitacoesRecebidas  (listaSolicitacoes, usuariologado);
        solicitacoes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuSolicitacoesActionPerformed

    private void jMenuSolicitacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSolicitacoesMouseClicked
        SolicitacoesRecebidas solicitacoes = new SolicitacoesRecebidas  (listaSolicitacoes, usuariologado);
        solicitacoes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuSolicitacoesMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    private int getCod(String cod) {
        int end = 0;
        for (int i = 0; i < cod.length(); i++) {
            if (cod.charAt(i) == '-') {
                end = i - 1;
                break;
            }
        }

        cod = cod.substring(0, end);
        return Integer.parseInt(cod);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBoasVindas;
    private javax.swing.JLabel jLabelDataUltimoLogin;
    private javax.swing.JLabel jLabelEventosRecentes;
    private javax.swing.JLabel jLabelExplicando;
    private javax.swing.JLabel jLabelExplicandocontinuacao;
    private javax.swing.JLabel jLabelInicioLogo;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel jLabelUltimoLogin;
    private javax.swing.JList<String> jListEventosRecentes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCompletarCadastro;
    private javax.swing.JMenu jMenuConta;
    private javax.swing.JMenuItem jMenuItemEditar;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemVisualizar;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JMenu jMenuSolicitacoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
