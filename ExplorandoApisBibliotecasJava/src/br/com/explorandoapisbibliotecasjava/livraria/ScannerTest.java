/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.explorandoapisbibliotecasjava.livraria;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author walmir.silva
 */
public class ScannerTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    
}
