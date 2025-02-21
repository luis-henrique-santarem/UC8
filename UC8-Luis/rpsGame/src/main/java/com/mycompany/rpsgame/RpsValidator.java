/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;

/**
 *
 * @author LUISHENRIQUEPEDROSOS
 */
public class RpsValidator {
    public boolean validateChoice(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            System.out.println("Empate nesta rodada!");
            return false;
        } else if ((playerChoice == 1 && computerChoice == 3) || 
                   (playerChoice == 2 && computerChoice == 1) || 
                   (playerChoice == 3 && computerChoice == 2)) { 
            return true; 
        } else {
            return false; 
        }
    }

    public String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            default:
                return "Escolha inválida";
        }
    }
    
} 
