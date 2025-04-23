/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora.java;

/**
 *
 * @author FATEC ZONA LESTE
 */

public class CalculadoraJava {
    public static void main(String[] args) {
       
        // Definição de dois números para as operações
        double num1 = 10.5;
        double num2 = 5.2;
        
        // Realizando operações matemáticas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; // Evita divisão por zero
        double resto = num1 % num2;        
        
        // Exibindo os resultados das operações
        System.out.println("Resultados das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao : "Indefinida (divisão por zero)"));
        System.out.println("Resto da divisão: " + resto);
       
        // Cálculos de áreas e circunferência
        // Área do Quadrado
        double ladoQuadrado = 4.0;
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("Área do Quadrado: " + areaQuadrado);
        
        // Área do Retângulo
        double larguraRetangulo = 6.0;
        double alturaRetangulo = 3.0;
        double areaRetangulo = larguraRetangulo * alturaRetangulo;
        System.out.println("Área do Retângulo: " + areaRetangulo);
        
        // Área do Losango
        double diagonalMaior = 8.0;
        double diagonalMenor = 6.0;
        double areaLosango = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("Área do Losango: " + areaLosango);
        
        // Área do Triângulo
        double baseTriangulo = 5.0;
        double alturaTriangulo = 4.0;
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("Área do Triângulo: " + areaTriangulo);
        
        // Circunferência do Círculo
        double raioCirculo = 7.0;
        double circunferencia = 2 * Math.PI * raioCirculo;
        System.out.println("Circunferência do Círculo: " + circunferencia);
        
        // Cálculo da Média
        double num3 = 7.0;
        double num4 = 8.0;
        double num5 = 9.0;
        
        // Somando os números
        double somaMedia = num3 + num4 + num5;
        
        // Calculando a média
        double media = somaMedia / 3;
        
        // Mostrando o resultado da média
        System.out.println("Média dos números: " + media);
    }
}
