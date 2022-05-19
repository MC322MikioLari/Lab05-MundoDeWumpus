package pt.c40task.l05wumpus;
import java.util.Scanner;


public class AppWumpus {

   public static void main(String[] args) {
      AppWumpus.executaJogo(
            (args.length > 0) ? args[0] : null,
            (args.length > 1) ? args[1] : null,
            (args.length > 2) ? args[2] : null);
   }
   
   public static void executaJogo(String arquivoCaverna, String arquivoSaida,
                                  String arquivoMovimentos) {
      Toolkit tk = Toolkit.start(arquivoCaverna, arquivoSaida, arquivoMovimentos);
      String cave[][] = tk.retrieveCave();
      
//      System.out.println("=== Caverna");
//      for (int l = 0; l < cave.length; l++) {
//         for (int c = 0; c < cave[l].length; c++)
//            System.out.print(cave[l][c] + ((c < cave[l].length-1) ? ", " : ""));
//         System.out.println();
//      }
      
      MontadorCaverna montador = new MontadorCaverna(cave);
      montador.CavernaVerificacao (cave);
      Controle controle = new Controle(montador.getHeroi());
 
      
      if (arquivoMovimentos == null) {
          try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Nome do player: ");
			  controle.getHeroi().setNome(keyboard.nextLine());
			  PrintUtils.gameSate(controle.getHeroi().getCaverna().retornaSaida(),
					  controle.getHeroi().getNome(), controle.getScore(), controle.getMessage());			  tk.writeBoard(controle.getHeroi().getCaverna().retornaSaida(), controle.getScore(), controle.getStatus());
			  tk.writeBoard(controle.getHeroi().getCaverna().retornaSaida(), controle.getScore(), controle.getStatus());

			  char comando = keyboard.nextLine().charAt(0);
			  comando = Character.toLowerCase(comando);
			  while(controle.getStatus() == 'P') {
				  if (controle.comandoValido(comando)) {    
					  controle.executa(comando);
					  tk.writeBoard(controle.getHeroi().getCaverna().retornaSaida(), controle.getScore(), controle.getStatus());
					  }
			  }
			  keyboard.close();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado na leitura do teclado");
			}
      }
      else if (arquivoMovimentos != null) {
          String movements = tk.retrieveMovements();
          controle.getHeroi().setNome("Alcebiades");	    
    	  
    	  while (controle.getStatus() == 'P') {
    		  int i = 0;
    		  char comando = movements.charAt(i);
			  if (controle.comandoValido(comando)) {
				  controle.executa(comando);
			  }
    		  tk.writeBoard(controle.getHeroi().getCaverna().retornaSaida(), controle.getScore(), controle.getStatus());
			  i++;
    	  }
      }
      
      
      
//      String movements = tk.retrieveMovements();
//      System.out.println("=== Movimentos");
//      System.out.println(movements);
//      
//      System.out.println("=== Caverna Intermediaria");
//      char partialCave[][] = {
//         {'#', '#', 'b', '-'},
//         {'#', 'b', '-', '-'},
//         {'b', '-', '-', '-'},
//         {'p', '-', '-', '-'}
//      };
//      int score = -120;
//      char status = 'x'; // 'w' para venceu; 'n' para perdeu; 'x'  intermediárias
//      tk.writeBoard(partialCave, score, status);
//
//      System.out.println("=== Última Caverna");
//      char finalCave[][] = {	
//         {'#', '#', 'b', '-'},
//         {'#', 'b', '#', 'f'},
//         {'b', '-', '-', 'w'},
//         {'#', '-', '-', '-'}
//      };
//      score = -1210;
//      status = 'n'; // 'w' para venceu; 'n' para perdeu; 'x'  intermediárias
//      tk.writeBoard(finalCave, score, status);
      
      tk.stop();
   }

}