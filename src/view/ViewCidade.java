/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.ControllerCidade;
import controller.ControllerCidadeEstado;
import controller.ControllerEstado;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCidade;
import model.ModelCidadeEstado;
import model.ModelEstado;

/**
 *
 * @author Administrador
 */
public class ViewCidade extends javax.swing.JFrame {

    ControllerEstado controllerEstados = new ControllerEstado();
    ControllerCidade controllerCidade = new ControllerCidade();
    ControllerCidadeEstado controllerCidadeEstado = new ControllerCidadeEstado();
    ModelEstado modelEstado = new ModelEstado();
    ModelCidade modelCidade = new ModelCidade();
    ArrayList<ModelCidadeEstado> listaModelCidadeEstados = new ArrayList<>();
    ArrayList<ModelEstado> listaModelEstados = new ArrayList<>();
    ArrayList<ModelCidade> listaModelCidades = new ArrayList<>();
    String tipoCadastro;
    
    
    /**
     * Creates new form ViewCidade
     */
    public ViewCidade() {
        initComponents();
        setLocationRelativeTo(null);
        habilitarCampos(false);
        carregarCidade();
        listarEstados();
        
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

        tfCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox();
        tfCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCidades = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de cidades");

        tfCodigo.setEditable(false);

        jLabel1.setText("Código:");

        jLabel2.setText("Estado");

        jLabel3.setText("Cidade:");

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        tbCidades.setAutoCreateRowSorter(true);
        tbCidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Código", "UF", "Estado", "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCidades.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbCidades.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbCidades);
        if (tbCidades.getColumnModel().getColumnCount() > 0) {
            tbCidades.getColumnModel().getColumn(1).setMinWidth(50);
            tbCidades.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbCidades.getColumnModel().getColumn(2).setMinWidth(200);
            tbCidades.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbCidades.getColumnModel().getColumn(3).setMinWidth(200);
            tbCidades.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfCidade)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar)
                    .addComponent(btNovo)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (tipoCadastro.equals("novo")){
            salvarCidade();
        } else if(tipoCadastro.equals("alteracao")){
            alterarCidade();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        habilitarCampos(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // preparar formulário´para novo cadastro
        novaCidade();
        habilitarCampos(true);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int linhaSelecionada = tbCidades.getSelectedRow();
        // Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item na tabela antes de clicar no botão!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            novaCidade();
            habilitarCampos(true);
            tipoCadastro = "alteracao";
            retornarCidade();
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linhaSelecionada = tbCidades.getSelectedRow();
        // Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Você deve selecionar um item na tabela antes de clicar no botão!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            this.excluirCidade();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void excluirCidade(){
        int linha = tbCidades.getSelectedRow();
        String nome = (String) tbCidades.getValueAt(linha, 3);
        int codigo = (Integer) tbCidades.getValueAt(linha, 0);
        //pegunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o registro \nNome: "
                + nome + " ?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerCidade.excluirCidadeController(codigo)) {
                JOptionPane.showMessageDialog(this, "Registro excluido com suscesso!");
                carregarCidade();
            }else{
            JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    /**
     * Salvar cidade
     * @return 
     */
    private boolean salvarCidade(){
        modelCidade.setFk_cod_estado(controllerEstados.getEstadoController(this.cbEstado.getSelectedItem().toString()).getCodigo());
        modelCidade.setNome(this.tfCidade.getText());

        //salvar 
        if (controllerCidade.salvarCidadeController(modelCidade)>0) {
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.habilitarCampos(false);
            this.carregarCidade();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    /**
     * Alterar cidade
     * @return boolean
     */
    private boolean alterarCidade(){
        modelCidade.setCodigo(Integer.parseInt(this.tfCodigo.getText()));
        modelCidade.setFk_cod_estado(controllerEstados.getEstadoController(this.cbEstado.getSelectedItem().toString()).getCodigo());
        modelCidade.setNome(this.tfCidade.getText());

        //alterar 
        if (controllerCidade.atualizarCidadeController(modelCidade)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.habilitarCampos(false);
            this.carregarCidade();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
    private void carregarCidade() {   
        listaModelCidadeEstados = controllerCidadeEstado.getListaCidadeEstadoController();
        DefaultTableModel modelo = (DefaultTableModel) tbCidades.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaModelCidadeEstados.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelCidadeEstados.get(i).getModelCidade().getCodigo(),
                listaModelCidadeEstados.get(i).getModelEstado().getUf(),
                listaModelCidadeEstados.get(i).getModelEstado().getNome(),
                listaModelCidadeEstados.get(i).getModelCidade().getNome()
            });
        }
    }

    private boolean retornarCidade(){
        //recebe a linha selecionada
        int linha = this.tbCidades.getSelectedRow();
        //pega o codigo do cliente na linha selecionada
        int codigo = (Integer) tbCidades.getValueAt(linha, 0);

        try {
            //recupera os dados do banco
            modelCidade = controllerCidade.getCidadeController(codigo);
            //seta os dados na interface
            this.tfCodigo.setText(String.valueOf(modelCidade.getCodigo()));
            this.tfCidade.setText(modelCidade.getNome());
            this.cbEstado.setSelectedItem(controllerEstados.getEstadoController(modelCidade.getFk_cod_estado()).getNome());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    private void novaCidade(){
        habilitarCampos(true);
        tfCodigo.setText("Novo");
        listarEstados();
        tfCidade.setText("");
        tipoCadastro = "novo";
    }
    
    private void habilitarCampos(boolean pStatus){
        tfCidade.setEditable(pStatus);
        cbEstado.setEnabled(pStatus);
        btSalvar.setEnabled(pStatus);
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
            java.util.logging.Logger.getLogger(ViewCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCidade().setVisible(true);
            }
        });
    }

    private void listarEstados(){
        listaModelEstados = controllerEstados.getListaEstadoController();
        cbEstado.removeAllItems();
        for (int i = 0; i < listaModelEstados.size(); i++){
            cbEstado.addItem(listaModelEstados.get(i).getNome());
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbCidades;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCodigo;
    // End of variables declaration//GEN-END:variables
}
