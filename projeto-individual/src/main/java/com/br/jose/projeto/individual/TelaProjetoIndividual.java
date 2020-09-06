/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.jose.projeto.individual;

import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class TelaProjetoIndividual extends javax.swing.JFrame {

    /**
     * Creates new form TelaProjetoIndividual
     *
     */
    Integer contador = 0;
    MediaBarra mediaCpu = new MediaBarra();
    MediaBarra mediaDisco = new MediaBarra();
    MediaBarra mediaRam = new MediaBarra();
    
    Double maxCpu = 0.0;
    Double minCpu = 100.0;
    
    Double maxDisco = 0.0;
    Double minDisco = 185.0;
    
    Double maxMemoria = 0.0;
    Double minMemoria = 8.0;
            
    
    public TelaProjetoIndividual() {
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

        barraCpu = new javax.swing.JProgressBar();
        barraDisco = new javax.swing.JProgressBar();
        barraMemoria = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLeitura = new javax.swing.JButton();
        labelValorMemoria = new javax.swing.JLabel();
        labelValorDisco = new javax.swing.JLabel();
        labelvalorCpu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelMinCpu = new javax.swing.JLabel();
        labelMedCpu = new javax.swing.JLabel();
        labelMaxCpu = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        labelMinDisco = new javax.swing.JLabel();
        labelMedDisco = new javax.swing.JLabel();
        labelMaxDisco = new javax.swing.JLabel();
        labelMinMemoria = new javax.swing.JLabel();
        labelMedMemoria = new javax.swing.JLabel();
        labelMaxMemoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CPU");

        jLabel2.setText("Disco");

        jLabel3.setText("Memória");

        btnLeitura.setText("Fazer leitura dos dados");
        btnLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeituraActionPerformed(evt);
            }
        });

        jLabel4.setText("Mínimo:");

        jLabel5.setText("Média:");

        jLabel6.setText("Máximo:");

        jLabel7.setText("CPU(%)");

        jLabel8.setText("Disco(185)");

        jLabel9.setText("Memória(8GB)");

        labelMinCpu.setText("0");

        labelMedCpu.setText("0");

        labelMaxCpu.setText("0");

        jLabel11.setText("Mínimo:");

        jLabel12.setText("Média:");

        jLabel13.setText("Máximo:");

        jLabel14.setText("Mínimo:");

        jLabel15.setText("Média:");

        jLabel16.setText("Máximo:");

        labelMinDisco.setText("0");

        labelMedDisco.setText("0");

        labelMaxDisco.setText("0");

        labelMinMemoria.setText("0");

        labelMedMemoria.setText("0");

        labelMaxMemoria.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barraMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(barraDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(barraCpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(labelMedCpu))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(labelMinCpu))))))
                                    .addComponent(btnLeitura, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelMaxCpu)))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelMinDisco))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelMaxDisco))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelMedDisco)))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelMaxMemoria)
                                            .addComponent(labelMedMemoria)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelMinMemoria)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelvalorCpu)
                                        .addGap(90, 90, 90))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(labelValorDisco)
                                        .addGap(92, 92, 92))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelValorMemoria)
                                .addGap(91, 91, 91))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelvalorCpu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelValorDisco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelValorMemoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLeitura)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMinCpu)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(labelMedCpu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(labelMaxCpu)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(labelMinDisco)
                            .addComponent(jLabel14)
                            .addComponent(labelMinMemoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(labelMedDisco)
                            .addComponent(jLabel15)
                            .addComponent(labelMedMemoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(labelMaxDisco)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(labelMaxMemoria))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeituraActionPerformed
        contador += 1;
        
        // setando valor maximo e minimo(barra de cpu)
        barraCpu.setMaximum(100);
        // setando valor maximo e minimo (barra de disco)
        barraDisco.setMaximum(185);
        // setando valor maximo e minimo (barra de RAM)
        barraMemoria.setMaximum(8);
        // valor randominco para a cpu
        Double numeroRealCpu = ThreadLocalRandom.current().nextDouble(0, 100);
        // valor randomico para o disco
        Double numeroRealDisco = ThreadLocalRandom.current().nextDouble(0, 185);
        // valor randomico para a ram
        Double numeroRealRam = ThreadLocalRandom.current().nextDouble(0, 8);
        
        mediaCpu.media = mediaCpu.media + numeroRealCpu;
        mediaDisco.media = mediaDisco.media + numeroRealDisco;
        mediaRam.media = mediaRam.media + numeroRealRam;
        
        labelMedCpu.setText(String.format("%.2f", (mediaCpu.media/contador)));
        labelMedDisco.setText(String.format("%.2f", (mediaDisco.media/contador)));
        labelMedMemoria.setText(String.format("%.2f", (mediaRam.media/contador)));
        
        
        barraCpu.setStringPainted(true);
        barraDisco.setStringPainted(true);
        barraMemoria.setStringPainted(true);
        
        barraDisco.setValue(numeroRealDisco.intValue());
        barraMemoria.setValue(numeroRealRam.intValue());
        barraCpu.setValue(numeroRealCpu.intValue());
        Double porcentagemDisco = (100 * numeroRealDisco) / 185;
        Double porcentagemRam = (100 * numeroRealRam) / 8;
        labelvalorCpu.setText(String.format("%.2f%%", numeroRealCpu));
        labelValorDisco.setText(String.format("%.2f GB"
                + " (%.2f%%)", numeroRealDisco, porcentagemDisco));
        labelValorMemoria.setText(String.format("%.2f GB (%.2f%%)", numeroRealRam, porcentagemRam));
        
        if (maxDisco < numeroRealDisco) {
            maxDisco = numeroRealDisco;
        }
        if (minDisco > numeroRealDisco) {
            minDisco = numeroRealDisco;
        }
        if (maxCpu < numeroRealCpu) {
            maxCpu = numeroRealCpu;
        }
        if (minCpu > numeroRealCpu) {
            minCpu = numeroRealCpu;
        }
        if (maxMemoria < numeroRealRam) {
            maxMemoria = numeroRealRam;
        }
        if (minMemoria > numeroRealRam) {
            minMemoria = numeroRealRam;
        }
        labelMaxDisco.setText(String.format("%.2f", maxDisco));
        labelMinDisco.setText(String.format("%.2f", minDisco));
        labelMaxMemoria.setText(String.format("%.2f", maxMemoria));
        labelMinMemoria.setText(String.format("%.2f", minMemoria));
        labelMinCpu.setText(String.format("%.2f", minCpu));
        labelMaxCpu.setText(String.format("%.2f", maxCpu));
    }//GEN-LAST:event_btnLeituraActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProjetoIndividual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraCpu;
    private javax.swing.JProgressBar barraDisco;
    private javax.swing.JProgressBar barraMemoria;
    private javax.swing.JButton btnLeitura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelMaxCpu;
    private javax.swing.JLabel labelMaxDisco;
    private javax.swing.JLabel labelMaxMemoria;
    private javax.swing.JLabel labelMedCpu;
    private javax.swing.JLabel labelMedDisco;
    private javax.swing.JLabel labelMedMemoria;
    private javax.swing.JLabel labelMinCpu;
    private javax.swing.JLabel labelMinDisco;
    private javax.swing.JLabel labelMinMemoria;
    private javax.swing.JLabel labelValorDisco;
    private javax.swing.JLabel labelValorMemoria;
    private javax.swing.JLabel labelvalorCpu;
    // End of variables declaration//GEN-END:variables
}
