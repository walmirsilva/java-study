/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.explorandoapisbibliotecasjava.livraria;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author walmir.silva
 */
public class PrintStreamTest {
    
    public static void main(String[] args) throws FileNotFoundException {
       
        PrintStream out = new PrintStream("saida2.txt");
        out.println("Testando a escrita em arquivo");
        out.println("Conteúdo na próxima linha");
        out.close();
        
    }
    
}
