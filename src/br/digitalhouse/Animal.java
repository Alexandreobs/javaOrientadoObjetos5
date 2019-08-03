package br.digitalhouse;

public class Animal {

    private String nomeAnimal;
    private String raca;
    private int idade;
    private String cor;
    private Pessoa donoAnimal;

    //classe especifica
    public Animal (String novoNomeAnimal){
        nomeAnimal = novoNomeAnimal;
    }

    public Animal (){

    }

    public Animal (String nome, String raca, int idade, String cor) {

        nomeAnimal = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;

    }

    public String getNomeAnimal (){return nomeAnimal;}
    public String getRaca (){return raca;}
    public int getIdade (){return idade;}
    public String getCor (){return cor;}
    public Pessoa getDonoAnimal () {return donoAnimal;}

    public void setNomeAnimal (String novoNomeAnimal){
        nomeAnimal = novoNomeAnimal;
    }

    public void setRaca(String novaRaca){
        raca = novaRaca;
    }

    public void setIdade(int novaIdade){
        idade = novaIdade;
    }

    public void setCor(String novaCor){
        cor = novaCor;
    }

    public void brincar() {
        System.out.println("o Animal esta brincando");
    }

    public void setDonoAnimal (Pessoa donoAnimal){
        this.donoAnimal = donoAnimal;
    }


}