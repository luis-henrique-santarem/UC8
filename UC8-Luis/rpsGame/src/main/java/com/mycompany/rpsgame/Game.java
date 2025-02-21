/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;
import java.util.Scanner;
/**
 *
 * @author LUISHENRIQUEPEDROSOS
 */
public class Game {
        private RpsValidator validator = new RpsValidator();  
    private Scanner scanner = new Scanner(System.in);  
    private String playerName;  
    private int playerScore = 0;  
    private int computerScore = 0;  
    private int rounds = 0;  

    public void start() {
        
        System.out.println("Digite seu nome: ");
        playerName = scanner.nextLine();

        System.out.println("Bem-vindo ao Pedra, Papel e Tesoura, " + playerName + "!");
        System.out.println("Você precisa vencer 2 das 3 rodadas para ganhar.");

        
        while (rounds < 3 && playerScore < 2 && computerScore < 2) {
            System.out.println("\nRodada " + (rounds + 1));
            System.out.println("Escolha 1 para Pedra, 2 para Papel, 3 para Tesoura:");

            int playerChoice = scanner.nextInt(); 
            int computerChoice = (int) (Math.random() * 3) + 1;  

            System.out.println(playerName + " escolheu: " + validator.choiceToString(playerChoice));
            System.out.println("Computador escolheu: " + validator.choiceToString(computerChoice));
           
            if (validator.validateChoice(playerChoice, computerChoice)) {
                playerScore++;  
                System.out.println(playerName + " ganhou esta rodada!");
            } else if (playerChoice != computerChoice) {
                computerScore++;  
                System.out.println("O computador ganhou esta rodada!");
            }

            rounds++;  
           
            System.out.println("\nPlacar: " + playerName + " " + playerScore + " x " + computerScore + " Computador");
        }

        if (playerScore > computerScore) {
            System.out.println("\nParabéns, " + playerName + ", você ganhou o jogo melhor de 3!");
        } else {
            System.out.println("\nO computador ganhou o jogo melhor de 3. Tente novamente!");
        }
    }

}