package domain;

public class Spock implements Algoritmo{

  @Override
  public void executar(TipoAlgoritmo tipo) {
    switch(tipo){
      case PEDRA :
        System.out.println("Ganhou! Spock destroi Pedra ");
        break;
      case SPOCK :
        System.out.println("Empatou! Spock empata com Spock.");
        break;
      case TESOURA :
        System.out.println("Ganhou! Spock destroi Tesoura");
        break;
      case LAGARTO :
        System.out.println("Perdeu! Lagarto envenena Spock");
        break;
      default :
        System.out.println("Perdeu! Papel espanta o Spock");
    }
  }
  
}
