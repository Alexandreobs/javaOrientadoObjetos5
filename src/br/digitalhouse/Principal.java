package br.digitalhouse;

public class Principal {
    public static void main(String[]args) {
        Animal animal = new Animal();

        System.out.println(animal.getNomeAnimal());


        Animal animalDomestico = new Animal("bidu");
        animalDomestico.setNomeAnimal("ted");
        animalDomestico.setRaca("vira-lata");
        animalDomestico.setCor("amarelo");


        Pessoa pessoaJovem = new Pessoa("erika");
        System.out.println(pessoaJovem.getNomePessoa());
        animalDomestico.setDonoAnimal(pessoaJovem);
        System.out.println(animalDomestico.getDonoAnimal().getNomePessoa());
        Pessoa pessoaIdosa = new Pessoa("Clotilde");
        animalDomestico.setDonoAnimal(pessoaIdosa);

        System.out.println(animalDomestico.getNomeAnimal());
        System.out.println(animalDomestico.getRaca());
        System.out.println(animalDomestico.getCor());


        Animal animal2 = new Animal("fox", "tomba-lata", 4, "preto");
        animal2.setNomeAnimal("coelho");
        System.out.println(animal2.getNomeAnimal());
        System.out.println(animal2.getRaca());
        System.out.println(animal2.getIdade());
        System.out.println(animal2.getCor());

    }

}
