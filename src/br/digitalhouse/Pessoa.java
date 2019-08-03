package br.digitalhouse;

public class Pessoa {
    private String nomePessoa;

    public Pessoa(String novoNome){
        nomePessoa = novoNome;
    }

    public String getNomePessoa(){
        return nomePessoa;

    }

   public void setNomePessoa(String novoNome){
        nomePessoa = novoNome;
   }
}
