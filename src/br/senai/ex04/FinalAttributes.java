package br.senai.ex04;

class FinalAttributes {
    private final int FINAL_ATTRIBUTE1;
    private final static int FINAL_ATTRIBUTE2;

    FinalAttributes() {
        FINAL_ATTRIBUTE1 = 1;
    }

    static {
        FINAL_ATTRIBUTE2 = 2;
    }

}
