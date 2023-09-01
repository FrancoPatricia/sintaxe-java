package edu.patricia.ExercicioSmartTV;

public class Usuario {
  public static void main(String[] args) {

    SmartTv smartTv = new SmartTv();

    System.out.println("TV iniciou ligada? " + smartTv.ligada);
    System.out.println("TV iniciou em que canal? " + smartTv.canal);
    System.out.println("TV iniciou em qual volume? " + smartTv.volume);

    smartTv.ligar();
    System.out.println("TV está ligada? " + smartTv.ligada);
  
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();
    System.out.println("Volume atual da TV: " + smartTv.volume);

    smartTv.subirCanal();
    System.out.println("Canal atual: " + smartTv.canal);
    smartTv.descerCanal();
    System.out.println("Canal atual: " + smartTv.canal);
    smartTv.mudarCanal(7);
    System.out.println("Canal atual: " + smartTv.canal);
  }

}
