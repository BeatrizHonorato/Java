package domain;

public class Tesoura implements Algoritmo{

  @Override
  public void executar(TipoAlgoritmo tipo) {
    
    switch(tipo){
      case PEDRA :
        System.out.println("Perdeu! Pedra destroi Tesoura.");
        break;
      case SPOCK :
        System.out.println("Perdeu! Spock destoi Tesoura");
        break;
      case TESOURA :
        System.out.println("Empatou! Tesoura empata com Tesoura.");
        break;
      case LAGARTO :
        System.out.println("Ganhou! Tesoura decapita Lagarto");
        break;
      default :
        System.out.println("Ganhou! Tesoura corta o Papel");
    }
  }

  
}
