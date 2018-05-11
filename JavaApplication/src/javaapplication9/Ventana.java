
package javaapplication9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ventana extends javax.swing.JFrame {

    private final FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos txt", "txt");
    
    public Ventana() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pathIden = new javax.swing.JTextField();
        cantidadLetras = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cantidadPalabras = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        exportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pathIden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathIdenActionPerformed(evt);
            }
        });

        cantidadLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadLetrasActionPerformed(evt);
            }
        });

        jLabel1.setText("Path del Archivo:");

        jLabel2.setText("Cantidad de Letras:");

        boton.setText("Aceptar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        jLabel3.setText("Cantidad de Palabras :");

        cantidadPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadPalabrasActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        exportar.setText("Exportar");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pathIden))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 190, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cantidadLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exportar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cantidadPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathIden, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(boton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exportar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        if(validarCampos() ){
            try {
                obtenerPalabras();
            } catch (ArchivoNoEncontradoExeption ex) {
                JOptionPane.showMessageDialog(null, "Ruta del archivo invalido", "Error!!", JOptionPane.WARNING_MESSAGE);
            }
           
         }
            
        
    }//GEN-LAST:event_botonActionPerformed

    private void pathIdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathIdenActionPerformed
   
    }//GEN-LAST:event_pathIdenActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void cantidadLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadLetrasActionPerformed
       
    }//GEN-LAST:event_cantidadLetrasActionPerformed

    private void cantidadPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadPalabrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadPalabrasActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileFilter(filtro);
        int opcion = filechooser.showOpenDialog(this);
        
        if (opcion==JFileChooser.APPROVE_OPTION){
            String ruta = filechooser.getSelectedFile().getPath();
        
        pathIden.setText(ruta);
        }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
    
        JFileChooser archivo = new JFileChooser();
        archivo.showSaveDialog(this);
        
        
            String linea = "";
            
        if (archivo.getSelectedFile() != null) {
            
            try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
                guardado.write(obtenerPalabras());
                
                
                
            }catch (ArchivoNoEncontradoExeption ex) {
                JOptionPane.showMessageDialog(null, "Ruta del archivo invalido", "Error!!", JOptionPane.WARNING_MESSAGE);
            }catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
 }          
 }
    }//GEN-LAST:event_exportarActionPerformed

    private String obtenerPalabras() throws ArchivoNoEncontradoExeption{
        String palabrasValidas = "";
        try{
        File archivo = new File (pathIden.getText());
                
                if(archivo.exists() && !archivo.isDirectory()) {
                    
                BufferedReader leer = new BufferedReader(new FileReader (archivo));
                String linea = "";
                int contador=0;
                
                while(linea != null ){
                    
                    linea = leer.readLine();
                    
                    if(linea != null){
                        texto.setText(linea);

                        String [] palabra = linea.split(" ");
                        int n= Integer.parseInt(cantidadLetras.getText());

                        for (String p : palabra) {
                            if (p.length()>=n){
                                contador++;
                                palabrasValidas += p + " ";
                            }
                        }
                    }    
                    cantidadPalabras.setText(String.valueOf(contador));
                        
                }
                }else{
                    throw new ArchivoNoEncontradoExeption("Archivo no encontrado");
                }
        }catch (ArchivoNoEncontradoExeption ex) {
                 JOptionPane.showMessageDialog(null, "Ruta del archivo invalido", "Error!!", JOptionPane.WARNING_MESSAGE);
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        /*String [] palabra = texto.getText().split(" ");
        String palabras = "";
        
        for (String e : palabra) {
            if (e.length()>=cantidadLetras){
               palabras += e + " "; 
            }
        }*/   
        
    return palabrasValidas;
    }
    
    private boolean validarCampos (){
        return (pathIden.getText()!= null && cantidadLetras.getText() != null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cantidadLetras;
    private javax.swing.JTextField cantidadPalabras;
    private javax.swing.JButton exportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pathIden;
    private javax.swing.JButton salir;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables

}

