package edu.patricia.TiposVariaveis;

public class TiposEVariaveis {
  public static void main(String[] args) {
    
    String meuNome = "Patricia Franco";
    System.out.println(meuNome);

    int idade = 30;
    System.out.println(idade);

    double altura = 1.72;
    System.out.println(altura);

    long cpf = 38362854871L;
    System.out.println(cpf);

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal;
    System.out.println(numeroCurto2);

    final double VALOR_DE_PI = 3.14;
    System.out.println(VALOR_DE_PI);
  }
}
