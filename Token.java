package org.automatas.analizadorlexico;

public class Token {

    private Tipos tipo;
    private String valor;

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    enum Tipos {

        LETRA ("[a-zA-z]+"),
        DIGITO ("[0-9]+"),
        CLASE ("class"),
        GUIONBAJO ("_"),
        IDENTIFICADOR(LETRA.patron+DIGITO.patron+GUIONBAJO.patron);
        public final String patron;
        Tipos(String s) {
            this.patron = s;
        }
    }
}
