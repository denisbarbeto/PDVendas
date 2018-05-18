/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ViewTipoProduto.java
 *
 * Created on 18/10/2011, 19:57:22
 */
package view;

import controller.ControllerPermissaousuario;
import controller.ControllerUsuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelPermissaousuario;
import model.ModelUsuario;

/**
 *
 * @author Leandro
 */
public class ViewUsuario extends javax.swing.JFrame {

    public ViewUsuario() {
        initComponents();
        this.carregarUsuarios();
        setLocationRelativeTo(null);
        this.cancelarOperacao();
  URL caminhoIcone = getClass().getResource("/imagens/pay.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
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
        jTabbedPaneTipoProduto = new javax.swing.JTabbedPane();
        jpCadastro = new javax.swing.JPanel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbConfirmarAlteracao = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfConfirmarSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jcbOrcamento = new javax.swing.JCheckBox();
        jcbUsuario = new javax.swing.JCheckBox();
        jcbVendas = new javax.swing.JCheckBox();
        jcbClientes = new javax.swing.JCheckBox();
        jcbProdutos = new javax.swing.JCheckBox();
        jcbContasPagar = new javax.swing.JCheckBox();
        jcbContasReceber = new javax.swing.JCheckBox();
        jcbEmpresa = new javax.swing.JCheckBox();
        jcbCaixa = new javax.swing.JCheckBox();
        jcbUnidadeMedida = new javax.swing.JCheckBox();
        jcbFormaPagamento = new javax.swing.JCheckBox();
        jcbFornecedores = new javax.swing.JCheckBox();
        jcbCidades = new javax.swing.JCheckBox();
        jcbCompras = new javax.swing.JCheckBox();
        jcbAtivacao = new javax.swing.JCheckBox();
        jpConsulta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfCodigo.setEditable(false);
        jtfCodigo.setToolTipText("Código do tipo do produto");
        jtfCodigo.setEnabled(false);
        jpCadastro.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 85, -1));

        jLabel1.setText("Código:");
        jpCadastro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jtfNome.setToolTipText("Descrição do tipo do produto");
        jpCadastro.add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 400, -1));

        jLabel2.setText("Nome:");
        jpCadastro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jbConfirmarAlteracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        jbConfirmarAlteracao.setText("Salvar Alteração");
        jbConfirmarAlteracao.setToolTipText("Confirmar alteração no cadastro do tipo do produto");
        jbConfirmarAlteracao.setEnabled(false);
        jbConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarAlteracaoActionPerformed(evt);
            }
        });
        jpCadastro.add(jbConfirmarAlteracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        jbCadastrar.setText("Salvar");
        jbCadastrar.setToolTipText("Salvar cadastro do tipo de produto");
        jbCadastrar.setEnabled(false);
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jpCadastro.add(jbCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setToolTipText("Cancelar operação");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jpCadastro.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.setToolTipText("Limpar todos os campos");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jpCadastro.add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel3.setText("Login:");
        jpCadastro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jpCadastro.add(jtfConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 130, -1));

        jLabel4.setText("Senha:");
        jpCadastro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));
        jpCadastro.add(jtfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 130, -1));

        jLabel5.setText("Confirmar senha:");
        jpCadastro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));
        jpCadastro.add(jtfLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Permissões"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbOrcamento.setText("Orçamento");
        jPanel1.add(jcbOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        jcbUsuario.setText("Cadastro de Usuário");
        jPanel1.add(jcbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jcbVendas.setText("Vendas e PDV");
        jcbVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVendasActionPerformed(evt);
            }
        });
        jPanel1.add(jcbVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jcbClientes.setText("Cadastro de Clientes");
        jPanel1.add(jcbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jcbProdutos.setText("Cadastro de Produtos");
        jPanel1.add(jcbProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jcbContasPagar.setText("Contas a pagar");
        jPanel1.add(jcbContasPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jcbContasReceber.setText("Contas a receber");
        jPanel1.add(jcbContasReceber, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jcbEmpresa.setText("Cadastro de Empresa");
        jPanel1.add(jcbEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jcbCaixa.setText("Caixa");
        jcbCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCaixaActionPerformed(evt);
            }
        });
        jPanel1.add(jcbCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jcbUnidadeMedida.setText("Unidade de medida");
        jcbUnidadeMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUnidadeMedidaActionPerformed(evt);
            }
        });
        jPanel1.add(jcbUnidadeMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jcbFormaPagamento.setText("Forma de pagamento");
        jPanel1.add(jcbFormaPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jcbFornecedores.setText("Cad. de Fornecedores");
        jPanel1.add(jcbFornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jcbCidades.setText("Cadastro de Cidades");
        jPanel1.add(jcbCidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jcbCompras.setText("Compras e Estoque");
        jPanel1.add(jcbCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jcbAtivacao.setText("Ativação Sistema");
        jPanel1.add(jcbAtivacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jpCadastro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 490, 190));

        jTabbedPaneTipoProduto.addTab("Cadastro", jpCadastro);

        jTableUsuarios.setAutoCreateRowSorter(true);
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableUsuarios);
        if (jTableUsuarios.getColumnModel().getColumnCount() > 0) {
            jTableUsuarios.getColumnModel().getColumn(0).setPreferredWidth(90);
            jTableUsuarios.getColumnModel().getColumn(1).setPreferredWidth(250);
            jTableUsuarios.getColumnModel().getColumn(2).setPreferredWidth(250);
        }

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setToolTipText("Excluir tipo de produto selecionado");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setToolTipText("Alterar tipo de produto selecionado");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultaLayout = new javax.swing.GroupLayout(jpConsulta);
        jpConsulta.setLayout(jpConsultaLayout);
        jpConsultaLayout.setHorizontalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jpConsultaLayout.createSequentialGroup()
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 333, Short.MAX_VALUE)
                        .addComponent(jButtonAlterar)))
                .addContainerGap())
        );
        jpConsultaLayout.setVerticalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jbExcluir))
                    .addGroup(jpConsultaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAlterar)))
                .addContainerGap())
        );

        jTabbedPaneTipoProduto.addTab("Consulta/Alteração/Exclusão", jpConsulta);

        getContentPane().add(jTabbedPaneTipoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        // TODO add your handling code here:
        if (this.jtfNome.getText().equals("")|| this.jtfLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Você deve informar o nome para salvar!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String senha, confirmaSenha;
        senha = new String(this.jtfSenha.getPassword());
        confirmaSenha = new String(this.jtfConfirmarSenha.getPassword());
        
        //testa se as senhas são iguais
        if (senha.equals(confirmaSenha)) {
            this.salvarUsuario();
        } else {
            JOptionPane.showMessageDialog(rootPane, "As senhas digitadas não conferem!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        //salvar tipo produto
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        int linha = jTableUsuarios.getSelectedRow();
        String nome = (String) jTableUsuarios.getValueAt(linha, 1);
        int codigo = (int) jTableUsuarios.getValueAt(linha, 0);

        ControllerUsuario controllerUsuario = new ControllerUsuario();
        ControllerPermissaousuario controllerPermissaousuario = new ControllerPermissaousuario();
        //pegunta se realmente deseja excluir o tipo de produto
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o usuário:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerUsuario.excluirUsuarioController(codigo)) {
                controllerPermissaousuario.excluirPermissaousuarioController(codigo);
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                this.carregarUsuarios();
                this.novoUsuario();
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        this.cancelarOperacao();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
                //abilita botão da interface
        jtfCodigo.setEditable(false);
        this.jbCadastrar.setEnabled(true);
        jbConfirmarAlteracao.setEnabled(false);
        novoUsuario();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarAlteracaoActionPerformed
        // TODO add your handling code here:
        if (this.jtfNome.getText().equals("")|| this.jtfLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Você deve informar o nome para salvar!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String senha, confirmaSenha;
        senha = new String(this.jtfSenha.getPassword());
        confirmaSenha = new String(this.jtfConfirmarSenha.getPassword());
        
        //testa se as senhas são iguais
        if (senha.equals(confirmaSenha)) {
            this.alterarUsuario();
        } else {
            JOptionPane.showMessageDialog(rootPane, "As senhas digitadas não conferem!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbConfirmarAlteracaoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        desativarPermissao();
        this.recuperarUsuario();
        this.habilitarCampos();
        
        //abilita botão da interface
        jtfCodigo.setEditable(false);
        this.jbCadastrar.setEnabled(false);
        jbConfirmarAlteracao.setEnabled(true);

        //volta a aba anterior
        this.jTabbedPaneTipoProduto.setSelectedIndex(this.jTabbedPaneTipoProduto.getSelectedIndex() - 1);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jcbVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbVendasActionPerformed

    private void jcbUnidadeMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUnidadeMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbUnidadeMedidaActionPerformed

    private void jcbCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCaixaActionPerformed

    /**
     * Salvar
     * @return 
     */
    private boolean salvarUsuario() {
        ModelUsuario modelUsuario = new ModelUsuario();
        int codigousuario;
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        ControllerPermissaousuario controllerPermissaousuario = new ControllerPermissaousuario();
        modelUsuario.setNome(this.jtfNome.getText());
        modelUsuario.setLogin(this.jtfLogin.getText());
        modelUsuario.setSenha(new String(this.jtfSenha.getPassword()));
        
        codigousuario = controllerUsuario.salvarUsuarioController(modelUsuario);
        //salvar
        if (codigousuario > 0) {
            controllerPermissaousuario.salvarPermissaousuarioController(setardadosPermissaoUsuario(codigousuario));
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.cancelarOperacao();
            this.carregarUsuarios();
            this.novoUsuario();
            jTabbedPaneTipoProduto.setSelectedIndex(jTabbedPaneTipoProduto.getSelectedIndex() + 1);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }
    
    
    public ModelPermissaousuario setardadosPermissaoUsuario(int pCodigoUsuario){
        ArrayList<ModelPermissaousuario> listaModelPermissaousuarios = new ArrayList<>();
        ModelPermissaousuario modelPermissaousuario = new ModelPermissaousuario();
        modelPermissaousuario = new ModelPermissaousuario();
        if(jcbClientes.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("cliente");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbProdutos.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("produto");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbCompras.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("compras");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbOrcamento.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("fornecedor");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbUsuario.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("usuario");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbVendas.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("venda");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
       
        if(jcbContasPagar.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("pagar");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbContasReceber.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("receber");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbEmpresa.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("empresa");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbCaixa.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("cidade");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbUnidadeMedida.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("unidade");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbFormaPagamento.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("pagamento");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbOrcamento.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("orcamento");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
        if(jcbCaixa.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("caixa");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }
         if(jcbAtivacao.isSelected()){
           modelPermissaousuario = new ModelPermissaousuario();
           modelPermissaousuario.setCodigo_usuario(pCodigoUsuario);
           modelPermissaousuario.setPermissao("ativacao");
           listaModelPermissaousuarios.add(modelPermissaousuario);
        }

        modelPermissaousuario.setListaModelPermissaousuarios(listaModelPermissaousuarios);
        return modelPermissaousuario;
    }
    
    /**
     * alterar
     * @return 
     */
    private boolean alterarUsuario() {
        ModelUsuario modelUsuario = new ModelUsuario();
        ControllerPermissaousuario controllerPermissaousuario = new ControllerPermissaousuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        modelUsuario.setCodigo(Integer.parseInt(this.jtfCodigo.getText()));
        modelUsuario.setNome(this.jtfNome.getText());
        modelUsuario.setLogin(this.jtfLogin.getText());
        modelUsuario.setSenha(new String(this.jtfSenha.getPassword()));

        //alterar
        if (controllerUsuario.atualizarUsuarioController(modelUsuario)) {
            //exclui as permissões antigas
            controllerPermissaousuario.excluirPermissaousuarioController(modelUsuario.getCodigo());
            //cadastra as novas
            controllerPermissaousuario.salvarPermissaousuarioController(setardadosPermissaoUsuario(modelUsuario.getCodigo()));
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.cancelarOperacao();
            this.carregarUsuarios();
            jTabbedPaneTipoProduto.setSelectedIndex(jTabbedPaneTipoProduto.getSelectedIndex() + 1);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    private void cancelarOperacao() {
        desabilitarCampos();
    }

    /**
     * carrena na tebla 
     */
    private void carregarUsuarios() {
        ArrayList<ModelUsuario> listaUsuarios = new ArrayList<>();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        listaUsuarios = controllerUsuario.getListaUsuarioController();

        DefaultTableModel modelo = (DefaultTableModel) jTableUsuarios.getModel();
        modelo.setNumRows(0);

        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaUsuarios.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaUsuarios.get(i).getCodigo(),
                listaUsuarios.get(i).getNome(),
                listaUsuarios.get(i).getLogin()
            });
        }
    }
    
    /**
     * Pega os dados
     *
     * @return boolean
     */
    private boolean recuperarUsuario() {
        ModelUsuario modelUsuario = new ModelUsuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        ControllerPermissaousuario controllerPermissaousuario = new ControllerPermissaousuario();
        ArrayList<ModelPermissaousuario> listaModelPermissaousuarios = new ArrayList<>();

        //recebe a linha selecionada
        int linha = this.jTableUsuarios.getSelectedRow();

        //pega o codigo do cliente na linha selecionada
        int codigo = (Integer) jTableUsuarios.getValueAt(linha, 0);

        try {
            //recupera os dados do banco
            modelUsuario = controllerUsuario.getUsuarioController(codigo);
            listaModelPermissaousuarios = controllerPermissaousuario.getListaPermissaousuarioController(codigo);
            //seta os dados na interface
            this.jtfCodigo.setText(String.valueOf(modelUsuario.getCodigo()));
            this.jtfNome.setText(modelUsuario.getNome());
            this.jtfLogin.setText(modelUsuario.getLogin());
            
            //preencher permissoes
            for (int i = 0; i < listaModelPermissaousuarios.size(); i++) {
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("cliente")) {
                    jcbClientes.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("produto")) {
                    jcbProdutos.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("fornecedor")) {
                    jcbFornecedores.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("usuario")) {
                    jcbUsuario.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("venda")) {
                    jcbVendas.setSelected(true);
                }              
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("pagar")) {
                    jcbContasPagar.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("receber")) {
                    jcbContasReceber.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("empresa")) {
                    jcbEmpresa.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("cidade")) {
                    jcbCidades.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("unidade")) {
                    jcbUnidadeMedida.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("pagamento")) {
                    jcbFormaPagamento.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("orcamento")) {
                    jcbOrcamento.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("caixa")) {
                    jcbCaixa.setSelected(true);
                }
                if (listaModelPermissaousuarios.get(i).getPermissao().equals("ativacao")) {
                    jcbAtivacao.setSelected(true);
                }

            }

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }
    
    protected void desabilitarCampos(){
        jtfNome.setEditable(false);
        jtfCodigo.setEditable(false);
        jtfLogin.setEditable(false);
        jtfSenha.setEditable(false);
        jtfConfirmarSenha.setEditable(false);
        carregarUsuarios();
    }
    
    private void novoUsuario(){
        habilitarCampos();
        jtfCodigo.setText("Novo");
        jtfNome.setText("");
        jtfLogin.setText("");
        jtfSenha.setText("");
        jtfConfirmarSenha.setText("");
        desativarPermissao();
    }
    
    private void desativarPermissao() {
        jcbClientes.setSelected(false);
        jcbProdutos.setSelected(false);
        jcbOrcamento.setSelected(false);
        jcbUsuario.setSelected(false);
        jcbVendas.setSelected(false);
        jcbEmpresa.setSelected(false);
        jcbUnidadeMedida.setSelected(false);
        jcbCidades.setSelected(false);
        jcbOrcamento.setSelected(false);
        jcbFormaPagamento.setSelected(false);
        jcbCaixa.setSelected(false);
        jcbFornecedores.setSelected(false);
        jcbContasPagar.setSelected(false);
        jcbContasReceber.setSelected(false);
        jcbAtivacao.setSelected(false);
    }
    
    private void habilitarCampos(){
        jtfNome.setEditable(true);
        jtfCodigo.setEditable(false);
        jtfLogin.setEditable(true);
        jtfSenha.setEditable(true);
        jtfConfirmarSenha.setEditable(true);
        carregarUsuarios();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneTipoProduto;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConfirmarAlteracao;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JCheckBox jcbAtivacao;
    private javax.swing.JCheckBox jcbCaixa;
    private javax.swing.JCheckBox jcbCidades;
    private javax.swing.JCheckBox jcbClientes;
    private javax.swing.JCheckBox jcbCompras;
    private javax.swing.JCheckBox jcbContasPagar;
    private javax.swing.JCheckBox jcbContasReceber;
    private javax.swing.JCheckBox jcbEmpresa;
    private javax.swing.JCheckBox jcbFormaPagamento;
    private javax.swing.JCheckBox jcbFornecedores;
    private javax.swing.JCheckBox jcbOrcamento;
    private javax.swing.JCheckBox jcbProdutos;
    private javax.swing.JCheckBox jcbUnidadeMedida;
    private javax.swing.JCheckBox jcbUsuario;
    private javax.swing.JCheckBox jcbVendas;
    private javax.swing.JPanel jpCadastro;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JPasswordField jtfConfirmarSenha;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
}
