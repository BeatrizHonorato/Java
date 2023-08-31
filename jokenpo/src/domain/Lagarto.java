package domain;

public class Lagarto implements Algoritmo{

  @Override
  public void executar(TipoAlgoritmo tipo) {
    switch(tipo){
      case PEDRA :
        System.out.println("Perdeu! Pedra mata Lagarto.");
        break;
      case SPOCK :
        System.out.println("Ganhou! Lagarto envenena Spock");
        break;
      case TESOURA :
        System.out.println("Perdeu!Tesoura decapita Lagarto");
        break;
      case LAGARTO :
        System.out.println("Empatou! Lagarto empata com Lagarto.");
        break;
      default :
        System.out.println("Ganhou! Lagarto come papel.");
    }
  }
  
}
