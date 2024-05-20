/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetosjava;

/**
 *
 * @author 55649
 */import java.util.ArrayList;
import java.util.Scanner;

    public class GerenciadorProjetos {
    static ArrayList<Projeto> projetos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            System.out.println("1. Adicionar projeto");
            System.out.println("2. Listar projetos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarProjeto();
                    break;
                case 2:
                    listarProjetos();
                    break;
                case 3:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    static void adicionarProjeto() {
        System.out.print("Nome do projeto: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição do projeto: ");
        String descricao = scanner.nextLine();
        System.out.print("Data de criação do projeto: ");
        String dataCriacao = scanner.nextLine();

        Projeto novoProjeto = new Projeto(nome, descricao, dataCriacao);
        projetos.add(novoProjeto);

        System.out.println("Projeto adicionado com sucesso!");
    }

    static void listarProjetos() {
        if (projetos.isEmpty()) {
            System.out.println("Não há projetos para listar.");
        } else {
            System.out.println("Lista de projetos:");
            for (Projeto projeto : projetos) {
                System.out.println("Nome: " + projeto.nome);
                System.out.println("Descrição: " + projeto.descricao);
                System.out.println("Data de criação: " + projeto.dataCriacao);
                System.out.println();
            }
        }
    }
}
