/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import DocView.Doarr;
import javax.swing.JOptionPane;

/**
 *
 * @author grazi
 */
public class Doar extends javax.swing.JFrame {
    
    /**
     * Creates new form Doar
     */
               
    
    
    public Doar() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblcnpj = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        solicitardoa = new javax.swing.JButton();
        fazerdoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nomefanta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cp = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        proddois = new javax.swing.JComboBox();
        prodtres = new javax.swing.JComboBox();
        prodquatro = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        barr = new javax.swing.JTextField();
        end = new javax.swing.JTextField();
        prodcinco = new javax.swing.JComboBox();
        prodseis = new javax.swing.JComboBox();
        prodsete = new javax.swing.JComboBox();
        un1 = new javax.swing.JTextField();
        un2 = new javax.swing.JTextField();
        un3 = new javax.swing.JTextField();
        un4 = new javax.swing.JTextField();
        un5 = new javax.swing.JTextField();
        un6 = new javax.swing.JTextField();
        un7 = new javax.swing.JTextField();
        qldd = new javax.swing.JTextField();
        produm = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        opcmenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fazer Doação");
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(1170, 670));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 120, 120));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 225, 206));
        jLabel1.setText("MERCADO SOLIDÁRIO");

        lblcnpj.setFont(new java.awt.Font("Segoe UI Light", 1, 10)); // NOI18N
        lblcnpj.setForeground(new java.awt.Color(236, 225, 206));
        lblcnpj.setText("Cnpj");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(497, 497, 497)
                .addComponent(jLabel1)
                .addGap(190, 500, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcnpj)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 36));

        jPanel2.setBackground(new java.awt.Color(0, 120, 120));
        jPanel2.setName(""); // NOI18N

        lbluser.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lbluser.setForeground(new java.awt.Color(236, 225, 206));
        lbluser.setText("Usuário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbluser)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 3, 13)); // NOI18N
        jLabel3.setText("Selecione abaixo os alimentos que deseja doar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel4.setText("Alimentos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel5.setText("Unidade");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        solicitardoa.setBackground(new java.awt.Color(0, 120, 120));
        solicitardoa.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        solicitardoa.setForeground(new java.awt.Color(236, 225, 206));
        solicitardoa.setText("Solicitar Doação");
        solicitardoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitardoaActionPerformed(evt);
            }
        });
        getContentPane().add(solicitardoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 570, -1, -1));

        fazerdoa.setBackground(new java.awt.Color(0, 120, 120));
        fazerdoa.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        fazerdoa.setForeground(new java.awt.Color(236, 225, 206));
        fazerdoa.setText("Finalizar Doação");
        fazerdoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazerdoaActionPerformed(evt);
            }
        });
        getContentPane().add(fazerdoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 570, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel2.setText("Descreva a situação do alimento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 184, 25));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setText("Para quem devemos enviar a doação?");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel8.setText("Empresa / Ong");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 90, -1));
        getContentPane().add(nomefanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 230, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel9.setText("Endereço de Destino");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 139, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel10.setText("Endereço");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 60, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel11.setText("Cep");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 25, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel12.setText("Bairro");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 37, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel13.setText("Cidade");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 39, -1));
        getContentPane().add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 131, -1));
        getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 165, -1));

        proddois.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arroz ", "Feijão ", "Macarrão ", "Sal ", "Acuçar", " Café ", "Oléo de Cozinha ", "Enlatados" }));
        proddois.setToolTipText("");
        proddois.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                proddoisAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(proddois, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, -1));

        prodtres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arroz", "Feijão", "Macarrão", "Sal", "Acuçar", "Café", "oléo de Cozinha", "Enlatados" }));
        prodtres.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                prodtresAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(prodtres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, -1));

        prodquatro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arroz", "Feijão", "Macarrão", "Sal", "Acuçar", "Café", "oléo de Cozinha", "Enlatados" }));
        prodquatro.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                prodquatroAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(prodquatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, -1));

        jPanel3.setBackground(new java.awt.Color(0, 120, 120));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1180, 10));
        getContentPane().add(barr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 165, -1));
        getContentPane().add(end, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 159, -1));

        prodcinco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arroz", "Feijão", "Macarrão", "Sal", "Acuçar", "Café", "oléo de Cozinha", "Enlatados" }));
        prodcinco.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                prodcincoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(prodcinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, -1));

        prodseis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arroz", "Feijão", "Macarrão", "Sal", "Acuçar", "Café", "oléo de Cozinha", "Enlatados" }));
        prodseis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prodseis.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                prodseisAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(prodseis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

        prodsete.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arroz", "Feijão", "Macarrão", "Sal", "Acuçar", "Café", "oléo de Cozinha", "Enlatados" }));
        prodsete.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                prodseteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(prodsete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, -1));
        getContentPane().add(un1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 58, -1));
        getContentPane().add(un2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 55, -1));
        getContentPane().add(un3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 55, -1));
        getContentPane().add(un4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 55, -1));
        getContentPane().add(un5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 55, -1));
        getContentPane().add(un6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 55, -1));
        getContentPane().add(un7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 55, -1));
        getContentPane().add(qldd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 176, -1));

        produm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arroz", "Feijão", "Macarrão", "Sal", "Acuçar", "Café", "Oléo de Cozinha", "Enlatados" }));
        produm.setToolTipText("Selecione");
        produm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produmActionPerformed(evt);
            }
        });
        getContentPane().add(produm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setText("Informações de Entrega");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        opcmenu.setText("Opções");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        opcmenu.add(jMenuItem1);

        jMenuBar1.add(opcmenu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        // Caixa de opção Sair 

int sair = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja sair?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void solicitardoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitardoaActionPerformed
        // TODO add your handling code here:
        //chamar tela de solicitação

        Solicitar telaDeSolicitar = new Solicitar();
        telaDeSolicitar.setVisible(true);
    }//GEN-LAST:event_solicitardoaActionPerformed

    private void proddoisAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_proddoisAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_proddoisAncestorAdded

    private void prodtresAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_prodtresAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_prodtresAncestorAdded

    private void prodquatroAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_prodquatroAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_prodquatroAncestorAdded

    private void prodcincoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_prodcincoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_prodcincoAncestorAdded

    private void prodseisAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_prodseisAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_prodseisAncestorAdded

    private void prodseteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_prodseteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_prodseteAncestorAdded

    private void fazerdoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazerdoaActionPerformed
        // TODO add your handling code here:
        
        
        // Chamar tela finalizar
        
         Doarr d = new Doarr();
         
         d.setNomeFantasia(nomefanta.getText());
         d.setEndereco(end.getText());
         d.setCep(Integer.parseInt(cp.getText()));
         d.setBairro(barr.getText());
         d.setCidade(cid.getText());
         
         
         d.setProduto(produm.getSelectedItem().toString());
         d.setProduto(proddois.getSelectedItem().toString());
         d.setProduto(prodtres.getSelectedItem().toString());
         d.setProduto(prodquatro.getSelectedItem().toString());
         d.setProduto(prodcinco.getSelectedItem().toString());
         d.setProduto(prodseis.getSelectedItem().toString());
         d.setProduto(prodsete.getSelectedItem().toString());
       
         d.setUnidade(Integer.parseInt(un1.getText()));
         d.setUnidade(Integer.parseInt(un2.getText()));
         d.setUnidade(Integer.parseInt(un3.getText()));
         d.setUnidade(Integer.parseInt(un4.getText()));
         d.setUnidade(Integer.parseInt(un5.getText()));
         d.setUnidade(Integer.parseInt(un6.getText()));
         d.setUnidade(Integer.parseInt(un7.getText()));
        
        Finalizado f = new Finalizado();
        f.Finalizar(d);
        f.setVisible(true);
        
        

        
       
        
        
            
    }//GEN-LAST:event_fazerdoaActionPerformed

    private void produmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produmActionPerformed

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
            java.util.logging.Logger.getLogger(Doar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barr;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField end;
    private javax.swing.JButton fazerdoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel lblcnpj;
    public static javax.swing.JLabel lbluser;
    private javax.swing.JTextField nomefanta;
    private javax.swing.JMenu opcmenu;
    private javax.swing.JComboBox prodcinco;
    private javax.swing.JComboBox proddois;
    private javax.swing.JComboBox prodquatro;
    private javax.swing.JComboBox prodseis;
    private javax.swing.JComboBox prodsete;
    private javax.swing.JComboBox prodtres;
    public static javax.swing.JComboBox<String> produm;
    private javax.swing.JTextField qldd;
    private javax.swing.JButton solicitardoa;
    private javax.swing.JTextField un1;
    private javax.swing.JTextField un2;
    private javax.swing.JTextField un3;
    private javax.swing.JTextField un4;
    private javax.swing.JTextField un5;
    private javax.swing.JTextField un6;
    private javax.swing.JTextField un7;
    // End of variables declaration//GEN-END:variables
}
