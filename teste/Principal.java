/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.projetopacotes.teste;

import br.edu.etec.projetopacotes.model.Aluno;
import br.edu.etec.projetopacotes.model.Funcionario;
import br.edu.etec.projetopacotes.model.Professor;



public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", "123.456.789-10", "12.345.678-9", "0123.4567-9", "7ºB");
        System.out.println("---Dados  dos Alunos---");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("CPF: " + a1.getCpf());
        System.out.println("RG: " + a1.getRg());
        System.out.println("RGM: " + a1.getRgm() );
        System.out.println("Turma: " + a1.getTurma());
    
        
        Professor p1 = new Professor ("Marilia", "123.456.789-10", "12.345.678-9", "123456789-0", "Professor", "Historia" );
        System.out.println("---Dados dos Professores---");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("RG: " + p1.getRg());
        System.out.println("RF: " + p1.getRf());
        System.out.println("Cargo: " + p1.getCargo());
        System.out.println("Disciplina: " + p1.getDisciplina());
        
        Funcionario f1 = new Funcionario("Jorlan", "123.456.789-10", "12.345.678-9", "123456789-0", "Diretor");
        System.out.println("---Dados dos Funcionarios---");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("CPF: " + f1.getCpf());
        System.out.println("RG: " + f1.getRg());
        System.out.println("RF: " + f1.getRf());
        System.out.println("Cargo: " + f1.getCargo());
    }
}
