/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.explorandoapisbibliotecasjava.livraria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author walmir.silva
 */
public class InputStreamTest {
    
    public static void main(String[] args) {
        try {
            InputStream is = System.in;
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            
            String linha = reader.readLine();
            
            while (linha != null ) {
                System.out.println(linha);
                linha = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao tentar ler o arquivo " + e);
        }
    }
    
}
