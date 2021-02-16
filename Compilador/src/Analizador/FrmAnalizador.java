/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;

/**
 *
 * @author mdelgado
 */
public class FrmAnalizador extends javax.swing.JFrame {

    /**
     * Creates new form FrmAnalizador
     */
    public FrmAnalizador() {
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

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnArchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        btnASintactico = new javax.swing.JButton();
        btnALexico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        btnBorrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        btnBorrarSin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 32, -1, 193));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(null);

        btnArchivo.setBackground(new java.awt.Color(0, 0, 0));
        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnArchivo.setForeground(new java.awt.Color(255, 255, 255));
        btnArchivo.setText("Abrir Fuente");
        btnArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });
        jPanel2.add(btnArchivo);
        btnArchivo.setBounds(10, 130, 192, 45);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("David Ricardo Lopez Amador 20161020505");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 66, 306, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alvaro Alejandro Zarabanda 20161020507");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 43, 302, 17);

        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 359, 177);

        btnASintactico.setBackground(new java.awt.Color(0, 0, 0));
        btnASintactico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnASintactico.setForeground(new java.awt.Color(255, 255, 255));
        btnASintactico.setText("Analisis Sintaxis");
        btnASintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASintacticoActionPerformed(evt);
            }
        });
        jPanel2.add(btnASintactico);
        btnASintactico.setBounds(20, 370, 195, 45);

        btnALexico.setBackground(new java.awt.Color(0, 0, 0));
        btnALexico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnALexico.setForeground(new java.awt.Color(255, 255, 255));
        btnALexico.setText("Análisis Léxico");
        btnALexico.setBorder(null);
        btnALexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALexicoActionPerformed(evt);
            }
        });
        jPanel2.add(btnALexico);
        btnALexico.setBounds(390, 130, 197, 37);

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(390, 180, 359, 370);

        btnBorrar.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar);
        btnBorrar.setBounds(640, 130, 106, 45);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Generar Objeto");
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 589, 193, 45);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Generar Ejecutable");
        jPanel2.add(jButton2);
        jButton2.setBounds(277, 589, 233, 45);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ejecutar");
        jPanel2.add(jButton3);
        jButton3.setBounds(602, 589, 117, 45);

        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 420, 360, 130);

        btnBorrarSin.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrarSin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBorrarSin.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarSin.setText("Borrar");
        btnBorrarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarSinActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrarSin);
        btnBorrarSin.setBounds(260, 370, 97, 45);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/name.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(500, 60, 230, 100);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 0, 0);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(640, 0, 90, 0);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(540, 10, 70, 90);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 660));
        jPanel2.getAccessibleContext().setAccessibleName("prueba");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analizarLexico() throws IOException {
        int cont = 1;

        String expr = (String) Resultado.getText();
        Lexico lexicos = new Lexico(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexicos.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                
                case Using:
                    resultado += "  <Reservada using \n namespace std>\t" + lexicos.lexemas + "\n";
                    break;
                    
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexicos.lexemas + "\n";
                    break;
                case Int:
                    resultado += "  <Reservada int>\t" + lexicos.lexemas + "\n";
                    break;
                case Void:
                    resultado += "  <Reservada void>\t" + lexicos.lexemas + "\n";
                    break;
                case Double:
                    resultado += "  <Reservada double>\t" + lexicos.lexemas + "\n";
                    break;
                case Float:
                    resultado += "  <Reservada float>\t" + lexicos.lexemas + "\n";
                    break;
                case Long:
                    resultado += "  <Reservada long>\t" + lexicos.lexemas + "\n";
                    break;
                case Char:
                    resultado += "  <Reservada char>\t" + lexicos.lexemas + "\n";
                    break;
                case Byte:
                    resultado += "  <Reservada byte>\t" + lexicos.lexemas + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexicos.lexemas + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexicos.lexemas + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexicos.lexemas + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexicos.lexemas + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexicos.lexemas + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexicos.lexemas + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_And:
                    resultado += "  <Op And>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Op_Or:
                    resultado += "  <Op Or>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_Not:
                    resultado += "  <Op Not>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_Nand:
                    resultado += "  <Op Nand>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_Nor:
                    resultado += "  <Op Nor>\t" + lexicos.lexemas + "\n";
                    break;
                case True:
                    resultado += "  <Reservada True>\t" + lexicos.lexemas + "\n";
                    break;

                case False:
                    resultado += "  <Reservada False>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexicos.lexemas + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexicos.lexemas + "\n";
                    break;
                case Return:
                    resultado += "  <Reservada return>\t" + lexicos.lexemas + "\n";
                    break;
                case Sistema:
                    resultado += "  <Reservada system>\t" + lexicos.lexemas + "\n";
                    break;

                case Pause:
                    resultado += "  <Reservada pause>\t" + lexicos.lexemas + "\n";
                    break;

                case Include:
                    resultado += "  <Reservada Include>\t" + lexicos.lexemas + "\n";
                    break;

                case Define:
                    resultado += "  <Reservada Define>\t" + lexicos.lexemas + "\n";
                    break;

                case Struct:
                    resultado += "  <Reservada Struct>\t" + lexicos.lexemas + "\n";
                    break;

                case Register:
                    resultado += "  <Reservada Register>\t" + lexicos.lexemas + "\n";
                    break;

                case Union:
                    resultado += "  <Reservada Union>\t" + lexicos.lexemas + "\n";
                    break;

                

                case Scanf:
                    resultado += "  <Reservada scanf>\t" + lexicos.lexemas + "\n";
                    break;

                case Cin:
                    resultado += "  <Reservada cin>\t" + lexicos.lexemas + "\n";
                    break;

                case Cout:
                    resultado += "  <Reservada cout>\t" + lexicos.lexemas + "\n";
                    break;

                case Switch:
                    resultado += "  <Reservada switch>\t" + lexicos.lexemas + "\n";
                    break;

                case Case:
                    resultado += "  <Reservada case>\t" + lexicos.lexemas + "\n";
                    break;

                case Mayorque:
                    resultado += "  <Operador mayor que>\t" + lexicos.lexemas + "\n";
                    break;

                case Menorque:
                    resultado += "  <Operador menor que>\t" + lexicos.lexemas + "\n";
                    break;

                case Igual_a:
                    resultado += "  <Operador igual a>\t" + lexicos.lexemas + "\n";
                    break;

                case Diferente:
                    resultado += "  <Operador diferente>\t" + lexicos.lexemas + "\n";
                    break;
                case Mayor_Igual:
                    resultado += "  <Operador Mayor_Igual>\t" + lexicos.lexemas + "\n";
                    break;

                case Menor_Igual:
                    resultado += "  <Operador Mayor_Igual>\t" + lexicos.lexemas + "\n";
                    break;

                case Desplazamiento_Izq:
                    resultado += "  <Operador desplazamiento izq>\t" + lexicos.lexemas + "\n";
                    break;

                case Desplazamiento_Der:
                    resultado += "  <Operador desplazamiento izq>\t" + lexicos.lexemas + "\n";
                    break;

                case Op_And_BaB:
                    resultado += "  <Operador and bit a bit>\t" + lexicos.lexemas + "\n";
                    break;

                case Op_Or_BaB:
                    resultado += "  <Operador or bit a bit>\t" + lexicos.lexemas + "\n";
                    break;

                case Op_Not_BaB:
                    resultado += "  <Operador not bit a bit>\t" + lexicos.lexemas + "\n";
                    break;

                case Op_Xor_BaB:
                    resultado += "  <Operador Xor bit a bit>\t" + lexicos.lexemas + "\n";
                    break;

                case Op_asig_suma:
                    resultado += "  <Operador asigna suma>\t" + lexicos.lexemas + "\n";
                    break;

                case Op_asig_resta:
                    resultado += "  <Operador asigna resta>\t" + lexicos.lexemas + "\n";
                    break;

                case Op_asig_multiplicacion:
                    resultado += "  <Operador asigna multiplicacion>\t" + lexicos.lexemas + "\n";
                    break;

                case Op_asig_division:
                    resultado += "  <Operador asigna division>\t" + lexicos.lexemas + "\n";
                    break;

                case Op_asig_modulo:
                    resultado += "  <Operador asigna modulo>\t" + lexicos.lexemas + "\n";
                    break;

                case Op_decremento:
                    resultado += "  <Operador decremento>\t" + lexicos.lexemas + "\n";
                    break;

                case Printf:
                    resultado += "  <Reservada printf>\t" + lexicos.lexemas + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexicos.lexemas + "\n";
                    break;
                case Coma:
                    resultado += "  <Coma>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Punto:
                    resultado += "  <Punto>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t" + lexicos.lexemas + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexicos.lexemas + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexicos.lexemas + " >\n";
                    break;
            }
        }

    }

    private void btnALexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALexicoActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnALexicoActionPerformed

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        int cont = 1;
        JFileChooser escoger = new JFileChooser();
        escoger.showOpenDialog(null);
        File arc = new File(escoger.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(arc.toPath()));
            Resultado.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtAnalizarLex.setText(null);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnASintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASintacticoActionPerformed
        String ST = Resultado.getText();
        Sintaxis s = new Sintaxis(new Analizador.LexicoCup(new StringReader(ST)));

        try {
            s.parse();
            txtAnalizarSin.setText("Analisis realizado correctamente");
            txtAnalizarSin.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarSin.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnASintacticoActionPerformed

    private void btnBorrarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarSinActionPerformed
        txtAnalizarSin.setText(null);
    }//GEN-LAST:event_btnBorrarSinActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnalizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Resultado;
    private javax.swing.JButton btnALexico;
    private javax.swing.JButton btnASintactico;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarSin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    // End of variables declaration//GEN-END:variables
}
