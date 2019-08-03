package br.digitalhouse;



public class Cliente {
    private String nome;
    private String sobreNome;

    public Cliente(String novoCliente) {
        nome = novoCliente;
    }

    public Cliente(String novoCliente, String sobreNome) {

        this.nome = nome;
        this.sobreNome = sobreNome;

        System.out.println();

    }
}