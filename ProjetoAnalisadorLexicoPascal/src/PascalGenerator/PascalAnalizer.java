/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PascalGenerator;

import java.io.StringReader;
import javax.swing.JTextArea;

/**
 *
 * @author Edson
 */
public class PascalAnalizer extends javax.swing.JFrame {
    
     public JTextArea jText;
     
     public void executar () throws Exception{
        int cont = 0;
        
        jText = textArea1;
        String expr;
        expr = (String)jText.getText();
        Lexer lexer = new Lexer(new StringReader (expr));    
        
        String resultado = "";
        
        while(true){
            Token token = lexer.yylex();
            if(token == null){
                textArea2.setText(resultado);
                return;
            }
            
            switch(token){
                case SIM_PROGRAM:
                     resultado = resultado + "Linha: " +cont+ "<SIMBOLO_PROGRAM>  " + lexer.lexeme + "\n";
                    break;
                    
                case DECLARACAO:
                     resultado = resultado + "Linha: " +cont+ "<DECLARACAO>  " + lexer.lexeme + "\n";
                    break;   
                    
                case TIPO:
                     resultado = resultado + "Linha: " +cont+ "<TIPO>  " + lexer.lexeme + "\n";
                    break; 
                    
                case COMANDOS:
                     resultado = resultado + "Linha: " +cont+ "<COMANDOS>  " + lexer.lexeme + "\n";
                    break;   
              
                case OPERADOR_ARITIMETICO:
                    resultado = resultado + "Linha: " +cont+ "<OPERADOR_ARITMETICO>  " + lexer.lexeme + "\n";
                    break;
                 
                case OPERADOR_LOGICO:
                    resultado = resultado + "Linha: " +cont+ "<OPERADOR_LOGICO>  " + lexer.lexeme + "\n";
                    break;
                    
                case OP_ATRIBUICAO:
                    resultado = resultado + "Linha: " +cont+ "<OPERADOR_ATRIBUICAO>  " + lexer.lexeme + "\n";
                    break;
                    
                case OP_RELACIONAL:
                    resultado = resultado + "Linha: " +cont+ "<OPERADOR_RELACIONAL> " + lexer.lexeme + "\n";
                    break;
                    
                case OP_BOOLEANO:
                    resultado = resultado + "Linha: " +cont+ "<OPERADOR_BOOLEANO>  " + lexer.lexeme + "\n";
                    break;
                    
                case SEPARADOR:
                    resultado = resultado + "Linha: " +cont+ "<SEPARADOR>  " + lexer.lexeme + "\n";
                    break;
                    
                case ESPECIAL:
                    resultado = resultado + "Linha: " +cont+ "<ESPECIAL>  " + lexer.lexeme + "\n";
                    break;
                    
                case COMENTARIO:
                    resultado = resultado + "Linha: " +cont+ "<COMENTARIO>  " + lexer.lexeme + "\n";
                    break;
                    
                case LINHA:
                    cont++;
                    break;
                   
                case ERROR:
                    resultado = resultado + "Linha: " +cont+ "<ERROR> " + lexer.lexeme + "\n";
                    break;

                case ID:
                    resultado = resultado + "Linha: " +cont+ "<ID> " + lexer.lexeme + "\n";
                    break;
                    
                case NUMERO:
                    resultado = resultado + "Linha: " +cont+ "<NUMERO> " + lexer.lexeme + "\n";
                    break;
                    
                case INICIO:
                    resultado = resultado + "Linha: " +cont+ "<INICIO> " + lexer.lexeme + "\n";
                    break;
                    
                case FIM:
                    resultado = resultado + "Linha: " +cont+ "<FIM>" + lexer.lexeme + "\n";
                    break;
                    
                case MARCADOR_INICIO:
                    resultado = resultado + "Linha: " +cont+ "<MARCADOR_INICIO> " + lexer.lexeme + "\n";
                    break;
               
                case MARCADOR_FIM:
                    resultado = resultado + "Linha: " +cont+ "<MARCADOR_FIM>  " + lexer.lexeme + "\n";
                    break;
                    
                case BIBLIOTECA:
                    resultado = resultado + "Linha: " +cont+ "<BIBLIOTECA>  " + lexer.lexeme + "\n";
                    break;
                    
                case ESCREVA:
                    resultado = resultado + "Linha: " +cont+ "<ESCREVA>  " + lexer.lexeme + "\n";
                    break;
                    
                case LEIA:
                    resultado = resultado + "Linha: " +cont+ "<LEIA>  " + lexer.lexeme + "\n";
                    break;
             
                default:
                    resultado = resultado + "Linha: " +cont+ "<" + lexer.lexeme + ">" + cont++;
                    break;
            }
        }
        
    }
        

    /**
     * Creates new form PascalAnalizer
     */
    public PascalAnalizer() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAnalisar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea2 = new javax.swing.JTextArea();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Análisador Léxico");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Entrada");

        btnAnalisar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnAnalisar.setForeground(new java.awt.Color(0, 0, 255));
        btnAnalisar.setText("Analisar");
        btnAnalisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 51, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        textArea1.setColumns(20);
        textArea1.setRows(5);
        jScrollPane1.setViewportView(textArea1);

        textArea2.setColumns(20);
        textArea2.setRows(5);
        jScrollPane2.setViewportView(textArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)
                                .addGap(93, 93, 93)
                                .addComponent(btnAnalisar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnalisar)
                            .addComponent(btnLimpar))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addGap(59, 59, 59)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisarActionPerformed
        try{
            executar();
        }catch(Exception e)
        {e.printStackTrace();
        } 
                                              

    }//GEN-LAST:event_btnAnalisarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        textArea1.setText("");
        textArea2.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(PascalAnalizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PascalAnalizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PascalAnalizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PascalAnalizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PascalAnalizer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalisar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textArea1;
    private javax.swing.JTextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
