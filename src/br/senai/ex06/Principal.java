package br.senai.ex06;

public class Principal {

    public static void main(String[] args) {

        ClasseAbstrata classe = new ClasseAbstrata() {
            @Override
            public String printInfo() {
                return "metodo da classe abstrata";
            }
        };

        System.out.println(classe.printInfo());


    }
}
