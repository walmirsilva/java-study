/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.explorandoapisbibliotecasjava.livraria.threads;

/**
 *
 * @author walmir.silva
 */
public class TestandoThread {
    
    public static void main(String[] args) {
// 1ª) Possibilidade
        ExportadorDeCSV exportador = new ExportadorDeCSV();
        
        Thread thread = new Thread(exportador);
        thread.start();
        System.out.println("Terminei de rodar o main");

//2ª POSSIBILIDADE
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Rodando em paralelo");
            }
        }).start();
        System.out.println("Terminei de rodar o main");

// 3ª POSSIBILIDADE
        new Thread(() -> System.out.println("Rodando em paralelo")).start();
        System.out.println("Terminaie de rodar o main");
    }
    
}
