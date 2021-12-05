package br.senai.ex09;

public class ClasseEx9 {

    public ClasseEx9() {
        System.out.println("dentro do construtor");
    }

    static {
        System.out.println("dentro do bloco static");
    }

    {
        System.out.println("dentro do bloco de instância");
    }

}
