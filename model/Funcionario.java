/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.projetopacotes.model;

public class Funcionario extends Pessoa{
        private String rf;
        private String cargo;
        
        public Funcionario(String nome, String cpf, String rg, String rf, String cargo){
            super(nome, cpf, rg);
            this.rf = rf;
            this.cargo = cargo;
        }

        public String getRf(){
            return rf;
        }
        
        public void setRf(String rf){
            this.rf = rf;
        }
        
        public String getCargo(){
            return cargo;
        }
        
        public void setCargo(String Cargo){
            this.cargo = cargo;
        }
}
