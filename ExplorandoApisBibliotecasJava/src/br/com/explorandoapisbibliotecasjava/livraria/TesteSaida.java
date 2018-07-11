/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.explorandoapisbibliotecasjava.livraria;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author walmir.silva
 */
public class TesteSaida {
    
    public static void main(String ... args) throws IOException {
        OutputStream os = new FileOutputStream("saida.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        bw.write("Testando a escrita em arquivo");
        bw.newLine();
        bw.write("Conteúdo na próxima linha");
        bw.close();
        
    }
    
}
