package org.automatas.analizadorlexico;

import java.util.ArrayList;

import static org.automatas.analizadorlexico.Lexema.lex;

public class Main {
    public static void main(String[] args) {

        String input = "public class a L8_";
        ArrayList<Token> tokens = lex(input);
        for (Token token : tokens) {
            System.out.println("(" + token.getTipo() + ": " + token.getValor() + ")");
        }

    }
}