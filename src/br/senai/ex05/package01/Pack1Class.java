package br.senai.ex05.package01;

import br.senai.ex05.package02.Pack2Class;

public class Pack1Class {

    public static void main(String[] args) {
        // Objeto
        Pack2Class pkg2 = new Pack2Class();
        pkg2.printInfoObjeto();

        // Estático
        Pack2Class.printInfoEstatico();

    }

}
