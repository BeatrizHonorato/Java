package domain;

public class Pedra implements Algoritmo {

  @Override
  public void executar(TipoAlgoritmo tipo) {
    switch(tipo){
      case PEDRA : 
        System.out.println("Empatou! Pedra empata com Pedra.");
        break;
      case SPOCK : 
        System.out.println("Perdeu! Spock destroi Pedra");
        break;
      case TESOURA : 
        System.out.println("Ganhou! Pedra destroi Tesoura");
        break;
      case LAGARTO : 
        System.out.println("Ganhou! Pedra mata Lagarto");
        break;
      default:
        System.out.println("Perdeu! Pedra embrulha papel");
        
    }
      
    }
  }
  

