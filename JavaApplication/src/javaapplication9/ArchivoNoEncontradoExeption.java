/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Nico
 */
public class ArchivoNoEncontradoExeption extends Exception{
    
    public static final long serialVersionUID = 700L;
    
    public ArchivoNoEncontradoExeption (String mensaje){  
        super(mensaje);
    }  
}
