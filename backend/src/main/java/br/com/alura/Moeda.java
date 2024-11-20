package br.com.alura;

public enum Moeda {
    USD("Dolar"),
    BRL("Real"),
    JPY("Iene"),
    EUR("Euro"),
    GBP("Libra Esterlina"),
    AUD("Dolar Australiano");

    private final String nome;

    Moeda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
